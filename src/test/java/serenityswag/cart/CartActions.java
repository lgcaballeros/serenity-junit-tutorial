package serenityswag.cart;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import serenityswag.inventory.ProductList;

import java.util.List;

public class CartActions extends UIInteractions {

    @Step("Add {0} to the cart")
    public void addItem(String itemName) {
        $(ProductList.addToCartButtonFor(itemName)).click();
    }

    @Step("Add {0} to the cart")
    public void addItems(List<String> items) {
        items.forEach(this::addItem);
    }

    @Step("Open the shopping cart page")
    public void openCart() {
        $(ShoppingCartIcon.link()).click();
    }

    public List<String> displayedItems() {
        return findAll(".inventory_item_name").texts();
    }
}
