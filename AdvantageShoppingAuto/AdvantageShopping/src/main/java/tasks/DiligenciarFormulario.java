package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.NewAccount.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


public class DiligenciarFormulario implements Task{
	
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	
	public DiligenciarFormulario(String userName, String email, String password, String confirmPassword) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(		
				Enter.theValue(userName).into(NEWUSER),
				Enter.theValue(email).into(NEWEMAIL),
				Enter.theValue(password).into(NEWPASSWORD),
				Enter.theValue(confirmPassword).into(CONFIRMPASSWORD),
				Scroll.to(REGISTER), Click.on(CHECKCONDITIONS), Click.on(REGISTER));
				
	}
	
	public static DiligenciarFormulario withTheData(String userName, String email, String password, String confirmPassword) {
		return instrumented(DiligenciarFormulario.class, userName, email, password, confirmPassword);
			
	}

}
