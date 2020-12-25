package com.sample.test.demo.tests;

import com.sample.test.demo.TestBase;
import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//TODO need to create page objects separately
public class PizzaOrder extends TestBase {

    Select selectDropdown;
    WebElement webElement;

    private static final int QUANTITY = 1;
    private static final String PAGE_TITLE = "Pizza Order Form";
    private static final String NAME = "Parvez Sheikh";
    private static final String EMAIL = "parvezsheikh234@gmail.com";
    private static final String PHONE_NUMBER = "123456789";

    //happy path case placing an order
    @Test
    public void placePizzaOrderTest() {


        //verifying page title
        Assert.assertEquals(PAGE_TITLE, driver.getTitle());

        // filling up the page with test data
        selectDropdown = new Select(driver.findElement(By.id("pizza1Pizza")));
        selectDropdown.selectByValue(PizzaTypes.LARGE_THREETOPPINGS.getDisplayName());

        selectDropdown = new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']")));
        selectDropdown.selectByValue(PizzaToppings.EXTRACHEESE.getDisplayName());

        selectDropdown = new Select(driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings2']")));
        selectDropdown.selectByValue(PizzaToppings.PEPPERONI.getDisplayName());

        webElement = driver.findElement(By.id("pizza1Qty"));
        webElement.sendKeys(String.valueOf(QUANTITY));

        webElement = driver.findElement(By.id("name"));
        webElement.sendKeys(NAME);
        webElement = driver.findElement(By.id("email"));
        webElement.sendKeys(EMAIL);
        webElement = driver.findElement(By.id("phone"));
        webElement.sendKeys(PHONE_NUMBER);

        webElement = driver.findElement(By.id("ccpayment"));
        webElement.click();
        webElement = driver.findElement(By.id("placeOrder"));
        webElement.click();

        webElement = driver.findElement(By.xpath("//div[@id='dialog']/p"));

        //Verifying success message
        Assert.assertTrue(webElement.getText().contains("Thank you for your order"));

    }

    //error case
    @Test
    public void verifyEmptyPageTest() {

        //verifying page title
        Assert.assertEquals(PAGE_TITLE, driver.getTitle());

        //Clicking on place order without filling the form
        webElement = driver.findElement(By.id("placeOrder"));
        webElement.click();

        webElement = driver.findElement(By.xpath("//div[@id='dialog']/p"));

        //Verifying error message
        Assert.assertTrue(webElement.getText().contains("Missing name"));
        Assert.assertTrue(webElement.getText().contains("phone number"));
    }
}
