package com.sample.test.demo.tests;

import com.sample.test.demo.constants.PizzaTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;

public class DemoTest extends TestBase {

    @Test
    public void demoTest() {
        System.out.println("HELLO WORLD");
    }

    String str = PizzaTypes.LARE_NOTOPPINGS.getDisplayName();
}
