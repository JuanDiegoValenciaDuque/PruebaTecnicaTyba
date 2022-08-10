package questions;

import userinterfaces.MiniCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetAmount implements Question<String> {

	private String amount;

	public GetAmount() {
	}

	@Override
	public String answeredBy(Actor actor) {

		amount = MiniCart.AMOUNT.resolveFor(actor).getTextContent();

		return amount;
	}

	public static GetAmount verified() {
		return new GetAmount();

	}
}