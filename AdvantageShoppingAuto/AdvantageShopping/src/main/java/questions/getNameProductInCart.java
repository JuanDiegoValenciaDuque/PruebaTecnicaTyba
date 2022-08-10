package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.MiniCart;

public class getNameProductInCart implements Question<String> {
	
	private String product;


	@Override
	public String answeredBy(Actor actor) {

		product = MiniCart.NAMEINCART.resolveFor(actor).getTextContent();

		return product;
	}

	public static getNameProductInCart verified() {
		return new getNameProductInCart();

	}

}
