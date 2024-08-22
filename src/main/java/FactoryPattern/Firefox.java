package FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements BrowserDriver{

    @Override
    public WebDriver createDriver() {
        return new FirefoxDriver();
    }
}
