package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ModalLogin extends PageObject{
		
	public static final Target NEWACCOUNT = Target.the("newAccount")
            .located(By.xpath("//a[contains(text(),'CREATE NEW ACCOUNT')]"));
}
