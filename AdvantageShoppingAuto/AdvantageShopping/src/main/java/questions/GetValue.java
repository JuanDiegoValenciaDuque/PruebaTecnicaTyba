package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.HomePage;

public class GetValue implements Question<String>{
	
	String value;
	private String index;

	public GetValue(String index) {
		this.index = index;
	}

	@Override
	public String answeredBy(Actor actor) {
		
		index = String.valueOf(Integer.parseInt(index)+1);

		value = HomePage.UNITVALUE.of(index).resolveFor(actor).getTextContent().replace("$", "").replace(".", "").replace(",", "");
		
		
		return value;
	}

	public static GetValue verified(String index) {
		return new GetValue(index);

	}

}
