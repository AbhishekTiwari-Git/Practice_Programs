package FactoryPattern;

import org.openqa.selenium.WebDriver;

public class Factory {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver("chrome").createDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }

}
