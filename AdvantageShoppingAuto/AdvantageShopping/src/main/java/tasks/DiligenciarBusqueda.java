package tasks;


import static userinterfaces.HomePage.SEARCH;
import static userinterfaces.HomePage.SEARCHKEYS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarBusqueda implements Task{
	
	String product;
	
	public DiligenciarBusqueda(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SEARCH),
		Enter.theValue(product).into(SEARCHKEYS));
	}
	
	public static DiligenciarBusqueda withTheData(String product) {
		return instrumented(DiligenciarBusqueda.class, product);
			
	}

}
