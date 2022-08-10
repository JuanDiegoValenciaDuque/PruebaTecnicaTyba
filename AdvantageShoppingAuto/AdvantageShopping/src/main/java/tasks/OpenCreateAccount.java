package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.MENUUSER;
import static userinterfaces.ModalLogin.NEWACCOUNT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenCreateAccount implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MENUUSER));			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(NEWACCOUNT));	
	}

	public static OpenCreateAccount now() {
		return instrumented(OpenCreateAccount.class);			
	}
}
