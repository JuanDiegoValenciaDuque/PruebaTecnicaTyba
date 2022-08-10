package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class HomePage extends PageObject{
	
	public static final Target LOGO = Target.the("logo")
            .located(By.xpath("//header/nav[1]/div[1]/a[1]"));
	
	public static final Target MENUUSER = Target.the("menuUser")
            .located(By.xpath("//*[@id='menuUser']"));
	
	public static final Target MINICART = Target.the("minicart")
            .located(By.xpath("//*[@id='menuCart']"));
	
	public static final Target SEARCH = Target.the("search")
            .located(By.xpath("//header/nav[1]/ul[1]/li[4]/a[1]/div[1]/div[1]/div[1]/a[1]/*[1]"));

	public static final Target SEARCHKEYS = Target.the("searchKeys")
			.locatedBy("//input[@id='autoComplete']");
	
	public static final Target PRODUCT = Target.the("product")
			.locatedBy("//header/nav[1]/ul[1]/li[4]/a[1]/div[1]/div[2]/div[1]/div[2]/a[{0}]/img[1]");
	
	public static final Target UNITVALUE = Target.the("unitValue")
			.locatedBy("/html[1]/body[1]/header[1]/nav[1]/ul[1]/li[4]/a[1]/div[1]/div[2]/div[1]/div[2]/a[{0}]/span[1]");
	
	public static final Target USERNAME = Target.the("userName")
			.locatedBy("//header/nav[1]/ul[1]/li[3]/a[1]/span[1]");

	
	
}


