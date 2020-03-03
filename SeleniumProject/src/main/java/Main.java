//import org.openqa.selenium.By;
//import org.openqa.selenium.Capabilities;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariDriverService;
//import org.openqa.selenium.safari.SafariOptions;
//
//public class Main {
//
//    enum BrowserType {
//        CHROME,
//        FIREFOX,
//        SAFARI
//    }
//
//    public static WebDriver setup(BrowserType type) {
//
//        switch (type) {
//            case CHROME:
//                System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//                return new ChromeDriver();
//            case SAFARI:
//                System.setProperty("webdriver.safari.driver", "resources/safaridriver");
//                return new SafariDriver();
//            default:
//                return new ChromeDriver();
//        }
//    }
//
//    public static void main(String[] args) {
////        WebDriver driver = setup(BrowserType.SAFARI);
////        register(driver);
////        login(driver);
////        WishListTest(driver);
////        RegisterTest(driver);
////        LoginTest(driver);
////        driver.quit();
//
//        WebDriver driverChrome = setup(BrowserType.CHROME);
//        register(driverChrome);
//        login(driverChrome);
//        WishListTest(driverChrome);
//        RegisterTest(driverChrome);
//        LoginTest(driverChrome);
//        driverChrome.quit();
//    }
//
//
//
//    public static void login(WebDriver driver) {
//
//        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
////        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://testfasttrackit.info/selenium-test/");
//        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
//        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
//        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
//        driver.findElement(By.cssSelector("#send2")).click();
//        //driver.quit();
//    }
//
//    public static void register(WebDriver driver) {
//
//        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
////        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://testfasttrackit.info/selenium-test/");
//        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
//        driver.findElement(By.cssSelector("#send2")).click();
//        //driver.quit();
//    }
//
//    public static void WishListTest(WebDriver driver) {
//
////        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
////        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://fasttrackit.org/selenium-test/");
//        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
//        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
//        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
//        //driver.quit();
//
//    }
//
//    public static void RegisterTest(WebDriver driver) {
//
////        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
////        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://fasttrackit.org/selenium-test/");
//        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
//        driver.findElement(By.cssSelector("#firstname")).sendKeys("Pop");
//        driver.findElement(By.cssSelector("#middlename")).sendKeys("Maria");
//        driver.findElement(By.cssSelector("#lastname")).sendKeys("Irina");
//        driver.findElement(By.cssSelector("#email_address")).sendKeys("pmi@mailinator.com");
//        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
//        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345");
//        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
//        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
//        //driver.quit();
//
//    }
//
//    public static void LoginTest(WebDriver driver){
//
////        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
////        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://fasttrackit.org/selenium-test/");
//        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
//        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
//        driver.findElement(By.cssSelector("#email")).sendKeys("dmi@mailinator.com");
//        driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
//        driver.findElement(By.cssSelector("#send2 > span > span")).click();
//        //driver.quit();
//
//
//    }
//
//
//}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        register();
        login();
        WishListTest();
        RegisterTest();
        LoginTest();
    }

    public static void login() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

    public static void register() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }

    public static void WishListTest() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.quit();
    }

    public static void RegisterTest() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Pop");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Maria");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Irina");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("pmi@mailinator.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("12345");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.quit();
    }

    public static void LoginTest(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("dmi@mailinator.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.quit();
    }


}