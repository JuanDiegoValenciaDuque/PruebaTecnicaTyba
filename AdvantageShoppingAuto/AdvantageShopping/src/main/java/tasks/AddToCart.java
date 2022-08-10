package tasks;

import static userinterfaces.HomePage.PRODUCT;
import static userinterfaces.PageOfProduct.AMOUNT;
import static userinterfaces.PageOfProduct.ADDTOCART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCart implements Task {

	String index;
	int cantidad;
	

	public AddToCart(String index, int cantidad) {
		this.index = index;
		this.cantidad = cantidad;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		index = String.valueOf(Integer.parseInt(index)+1);
		
		actor.attemptsTo(Click.on(PRODUCT.of(index)));
		
		
		
		for (int i = 1; i < cantidad; i++) {
			actor.attemptsTo(Click.on(AMOUNT));
		}
		
		actor.attemptsTo(Click.on(ADDTOCART));
	}

	public static AddToCart theProduct(String index, int cantidad) {
		return instrumented(AddToCart.class, index, cantidad);
	}
}