package eShopTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        System.out.println("Chrome");
    }


    @BeforeTest
    public void openSite() {
        System.out.println("Открытие сайта");
    }

    @AfterTest (alwaysRun = true)
    public void close () {
        System.out.println("Закрыть сайт");
    }


}
