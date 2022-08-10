package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MiniCart extends PageObject{
	
	public static final Target AMOUNT = Target.the("amount")
            .located(By.xpath("//tbody/tr[1]/td[5]/label[2]"));		
	
	public static final Target NAMEINCART = Target.the("nameInCart")
            .located(By.xpath("/html[1]/body[1]/div[3]/section[1]/article[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/label[1]"));		
	
	public static final Target TOTALVALUE = Target.the("totalValue")
            .located(By.xpath("//tbody/tr[1]/td[6]/p[1]"));	

}
