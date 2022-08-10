package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.MiniCart;

public class GetTotalValue implements Question<String> {

	String totalValue;

	public GetTotalValue() {
	}

	@Override
	public String answeredBy(Actor actor) {

		totalValue = (MiniCart.TOTALVALUE.resolveFor(actor).getTextContent().replace("$", "")).replace(".", "").replace(",", "");


		return totalValue.trim();
	}

	public static GetTotalValue verified() {
		return new GetTotalValue();

	}

}
