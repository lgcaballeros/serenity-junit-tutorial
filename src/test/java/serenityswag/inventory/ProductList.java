package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.ResolvableElement;
import org.openqa.selenium.By;

import java.util.List;

public class ProductList extends PageObject {

    public static By addToCartButtonFor(String itemName) {
        return By.xpath("//div[@class='inventory_item'][contains(.,'" + itemName + "')]//button");
    }

    public List<String> titles() {
        return findAll(By.className("inventory_item_name")).textContents();
    }

    public String imageTextForProduct(String itemName) {
        return $("//div[@class='inventory_item'][contains(.,'" + itemName + "')]//img").getAttribute("alt");
    }

    public static By productDetailsLinkFor(String itemName) {
        return By.linkText(itemName);
    }
}
