package FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements BrowserDriver {


    @Override
    public WebDriver createDriver() {
        return new ChromeDriver();
    }
}
