package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PageOfProduct extends PageObject{
	
	public static final Target ADDTOCART = Target.the("addToCart")
            .located(By.xpath("//button[contains(text(),'ADD TO CART')]"));
	
	public static final Target AMOUNT = Target.the("amount")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[2]/e-sec-plus-minus[1]/div[1]/div[3]"));	
	
	public static final Target NAMEPRODUCT = Target.the("nameProduct")
            .located(By.xpath("//body/div[3]/section[1]/article[1]/div[2]/div[2]/h1[1]"));

}
