package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.PageOfProduct;

public class getNameProduct implements Question<String> {

	private String product;

	public getNameProduct() {
	}

	@Override
	public String answeredBy(Actor actor) {
		
		product = PageOfProduct.NAMEPRODUCT.resolveFor(actor).getTextContent();
		
		return product;
	}

	public static getNameProduct verified() {
		return new getNameProduct();

	}

}
