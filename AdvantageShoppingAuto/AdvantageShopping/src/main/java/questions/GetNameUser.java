package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.HomePage;

public class GetNameUser implements Question<String>{
	
	private String user;
		
	@Override
	public String answeredBy(Actor actor) {
		
		user = HomePage.USERNAME.resolveFor(actor).getTextContent();
		
		return user;
	}
	
	public static GetNameUser verified() {
		return new GetNameUser();

	}

}
