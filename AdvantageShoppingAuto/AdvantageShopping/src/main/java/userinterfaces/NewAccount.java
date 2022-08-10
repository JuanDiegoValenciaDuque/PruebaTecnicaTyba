package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class NewAccount extends PageObject{
	
	public static final Target NEWUSER = Target.the("newUser")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/sec-view[1]/div[1]/input[1]"));
	
	public static final Target NEWEMAIL = Target.the("newEmail")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/sec-view[2]/div[1]/input[1]"));
	
	public static final Target NEWPASSWORD = Target.the("newPassword")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/sec-view[1]/div[1]/input[1]"));
	
	public static final Target CONFIRMPASSWORD = Target.the("confirmPassword")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/sec-view[2]/div[1]/input[1]"));
	
	public static final Target CHECKCONDITIONS = Target.the("checkConditions")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/sec-form[1]/div[1]/div[2]/div[1]/sec-view[1]/div[1]/input[1]"));
	
	public static final Target REGISTER = Target.the("register")
            .located(By.xpath("//button[@id='register_btnundefined']"));

	
}
