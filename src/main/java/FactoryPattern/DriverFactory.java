package FactoryPattern;

public class DriverFactory {
    public static BrowserDriver getDriver(String browser){
        switch (browser.toLowerCase()){
            case "chrome" :
                return new Chrome();
            case "firefox" :
                return new Firefox();
            case "safari":
                return new Safari();
            case "edge" :
                return new Edge();

            default:
                throw new IllegalArgumentException("Wrong Browser passed :- "+browser);
        }
    }
}
