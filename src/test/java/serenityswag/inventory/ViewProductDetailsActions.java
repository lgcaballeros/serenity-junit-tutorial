package serenityswag.inventory;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;

public class ViewProductDetailsActions extends UIInteractions {

    ProductList productList;

    @Step("View product details for product {0}")
    public void forProductWithName(String itemName) {
        $(ProductList.productDetailsLinkFor(itemName)).click();
    }
}
