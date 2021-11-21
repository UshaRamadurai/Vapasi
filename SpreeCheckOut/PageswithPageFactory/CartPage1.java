package org.vapasi.SpreeCheckOut.PageswithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage1 {

    @FindBy(css = "[data-hook='cart_item_total']")
    private WebElement cartTotal;
    @FindBy(id="checkout-link")
    private WebElement checkOutBtn;

    public CartPage1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getCartValue() {
        String cartTotalValue = cartTotal.getText();
        return cartTotalValue;
    }
    public void clickCheckOut(){

        checkOutBtn.click();
    }
}
