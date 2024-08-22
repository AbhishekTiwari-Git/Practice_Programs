package FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari implements BrowserDriver{
    @Override
    public WebDriver createDriver() {
        return new SafariDriver();
    }
}
