package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.WrongSelection;
import models.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import questions.GetAmount;
import questions.GetTotalValue;
import questions.GetValue;
import questions.getNameProduct;
import questions.getNameProductInCart;
import tasks.AddToCart;
import tasks.DiligenciarBusqueda;
import tasks.OpenCart;
import tasks.OpenTheBrowser;
import userinterfaces.HomePage;

public class AddToCartStepDefinitions {
	
	HomePage homePage;
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor user = Actor.named("Juan Diego");
	private int cantidad;
	private String index;
	private String totalValue;
	
	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Desea agregar productos al carrito$")
	public void desea_agregar_productos_al_carrito(){
		user.wasAbleTo(OpenTheBrowser.on(homePage));	
	}
	
	@When("^Busca el producto (.*) a agregar$")
	public void buscaElProductoAgregar(List<Products> products){
		user.attemptsTo(DiligenciarBusqueda.withTheData(products.get(0).getProducto()));
	}

	@When("^Agrega el \"([^\"]*)\" producto (\\d+) veces$")
	public void agregaElProductoVeces(String index, int cantidad){
		this.cantidad = cantidad;
		this.index = index;		
		user.remember("value", GetValue.verified(index));
		user.attemptsTo(AddToCart.theProduct(index, cantidad));			
		user.remember("product", getNameProduct.verified());		
		user.attemptsTo(OpenCart.now());
	}


	@Then("^Valida que el producto fue agregado correctamente$")
	public void valida_que_el_producto_y_la_cantidad_fue_agregada_correctamente(){		
		user.should(seeThat(GetAmount.verified(), is(String.valueOf(cantidad))).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
	}
	
	
	@Then("^Verifica la cantidad agregada$")
	public void verificaLaCantidadAgregada(){
		user.should(seeThat(getNameProductInCart.verified(), containsString(user.recall("product").toString().trim())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
	}


	@Then("^Verifica el valor calculado$")
	public void verificaElValorCalculado(){		
		user.remember("amount", GetAmount.verified());
		user.remember("GetTotalValue", GetTotalValue.verified());
		totalValue = String.valueOf(Integer.valueOf(user.recall("value").toString()) * Integer.valueOf(user.recall("amount").toString()));
		
		assertEquals(totalValue, user.recall("GetTotalValue").toString());
	}


}
