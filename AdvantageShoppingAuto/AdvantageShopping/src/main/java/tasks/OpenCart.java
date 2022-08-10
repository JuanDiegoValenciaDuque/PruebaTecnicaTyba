package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.MINICART;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenCart implements Task{
	
	public OpenCart() {
	}

	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MINICART));
	}
	
	public static OpenCart now() {
		return instrumented(OpenCart.class);			
	}
}