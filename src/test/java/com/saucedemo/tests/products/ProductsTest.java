package com.saucedemo.tests.products;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed(){
        ProductsPage productsPage =
                loginPage.logInApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "Products Header is NOT displayed");
    }
}
