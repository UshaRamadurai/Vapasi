package org.vapasi.SpreeCheckOut;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.vapasi.SpreeCheckOut.PageswithPageFactory.*;


public class CheckOutTest extends BaseTest{
    @Test
    public void test() {
        LoginPage1 loginPage = new LoginPage1(driver);
        HomePage1 homePage= new HomePage1(driver);
        ProductPage1 productPage = new ProductPage1(driver);
        CartPage1 cartPage = new CartPage1(driver);
        AddressPage1 addressPage = new AddressPage1(driver);
        DeliveryPage1 deliveryPage = new DeliveryPage1(driver);
        PaymentPage1 paymentPage = new PaymentPage1(driver);
        OrderPage1 orderPage = new OrderPage1(driver);

        loginPage.login1("test21@gmail.com","testpassword");
        homePage.clickCategory();
        homePage.clickProduct();
        productPage.enterQuantity("2");
        productPage.clickAddToCart();
        Assert.assertEquals(cartPage.getCartValue(),"$31.98");
        cartPage.clickCheckOut();
        addressPage.enterAddressDetails();
        addressPage.clickSaveAndContinue();
        deliveryPage.clickSaveAndContinue();
        paymentPage.clickCheck();
        paymentPage.clickSaveAndContinue();
        Assert.assertEquals(orderPage.verifyOrderSuccessMessage(),"Your order has been processed successfully");
    }

}
