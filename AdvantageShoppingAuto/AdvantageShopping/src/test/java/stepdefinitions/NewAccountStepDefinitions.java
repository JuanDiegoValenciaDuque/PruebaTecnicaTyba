package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import questions.GetNameUser;
import tasks.DiligenciarFormulario;
import tasks.OpenCreateAccount;
import tasks.OpenTheBrowser;
import userinterfaces.HomePage;

public class NewAccountStepDefinitions {
	
	HomePage homePage;
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor user = Actor.named("Juan Diego");
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	
	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^Desea crear cuenta$")
	public void deseaCrearCuenta(){
		user.wasAbleTo(OpenTheBrowser.on(homePage));
	}


	@When("^ingresa al formulario de creacion$")
	public void ingresaAlFormularioDeCreacion(){
		user.wasAbleTo(OpenCreateAccount.now());
	}

	@When("^diligencia el formulario con los valores (.*) (.*) (.*) (.*)$")
	public void diligenciaElFormularioConLosValoresJuanDValenciaJuanDValenciaEmailComAbAb(String userName, String email, String password, String confirmPassword){
		this.userName = userName;
		this.email = email;		
		this.password = password;
		this.confirmPassword = confirmPassword;	
		user.attemptsTo(DiligenciarFormulario.withTheData(userName, email, password, confirmPassword));		
	}

	@Then("^Valida que el usuario (.*) esta logueado correctamente$")
	public void validaQueElUsuarioEstLogueadoCorrectamente(String userNick){
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		user.should(seeThat(GetNameUser.verified(), containsString(userNick)));		
	}

}