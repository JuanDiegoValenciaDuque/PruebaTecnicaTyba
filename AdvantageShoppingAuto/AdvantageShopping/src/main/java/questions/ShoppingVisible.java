package questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.HomePage.LOGO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ShoppingVisible implements Question<Boolean>{

	public Boolean answeredBy(Actor actor) { 
		
		return the(LOGO).answeredBy(actor).isCurrentlyVisible();
	}

	public static Question<Boolean> isVisible() {
		return new ShoppingVisible();
	}	

}
