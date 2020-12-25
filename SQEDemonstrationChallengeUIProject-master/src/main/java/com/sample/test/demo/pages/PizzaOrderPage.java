package com.sample.test.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// For page objects -
public class PizzaOrderPage {

    @FindBy(id = "pizza1Pizza")
    private WebElement pizza1Pizza;

    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings1']")
    private WebElement pizza1Toppings1;

    @FindBy(xpath = "//div[@id='pizza1']//select[@class='toppings2']")
    private WebElement pizza1Toppings2;

    @FindBy(id = "pizza1Qty")
    private WebElement pizza1Qty;

    @FindBy(id = "radioCreditCard")
    private WebElement radioCreditCard;

    @FindBy(id = "radioCash")
    private WebElement radioCash;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "placeOrder")
    private WebElement placeOrder;

    @FindBy(id = "reset")
    private WebElement reset;

    @FindBy(id = "dialog")
    private WebElement dialog;

    @FindBy(xpath = "//div[@id='dialog']/p")
    private WebElement dialogText;

    public WebElement getPizza1Pizza() {
        return pizza1Pizza;
    }

    public void setPizza1Pizza(WebElement pizza1Pizza) {
        this.pizza1Pizza = pizza1Pizza;
    }

    public WebElement getPizza1Toppings1() {
        return pizza1Toppings1;
    }

    public void setPizza1Toppings1(WebElement pizza1Toppings1) {
        this.pizza1Toppings1 = pizza1Toppings1;
    }

    public WebElement getPizza1Toppings2() {
        return pizza1Toppings2;
    }

    public void setPizza1Toppings2(WebElement pizza1Toppings2) {
        this.pizza1Toppings2 = pizza1Toppings2;
    }

    public WebElement getPizza1Qty() {
        return pizza1Qty;
    }

    public void setPizza1Qty(WebElement pizza1Qty) {
        this.pizza1Qty = pizza1Qty;
    }

    public WebElement getRadioCreditCard() {
        return radioCreditCard;
    }

    public void setRadioCreditCard(WebElement radioCreditCard) {
        this.radioCreditCard = radioCreditCard;
    }

    public WebElement getRadioCash() {
        return radioCash;
    }

    public void setRadioCash(WebElement radioCash) {
        this.radioCash = radioCash;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getName() {
        return name;
    }

    public void setName(WebElement name) {
        this.name = name;
    }

    public WebElement getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(WebElement placeOrder) {
        this.placeOrder = placeOrder;
    }

    public WebElement getReset() {
        return reset;
    }

    public void setReset(WebElement reset) {
        this.reset = reset;
    }

    public WebElement getDialog() {
        return dialog;
    }

    public void setDialog(WebElement dialog) {
        this.dialog = dialog;
    }

    public WebElement getDialogText() {
        return dialogText;
    }

    public void setDialogText(WebElement dialogText) {
        this.dialogText = dialogText;
    }
}
