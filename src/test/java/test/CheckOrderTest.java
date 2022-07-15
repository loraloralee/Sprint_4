package test;

import home.HomePage;
import home.OrderPage;
import home.RentPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.containsString;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class CheckOrderTest {
    private WebDriver driver;

    @Before
    public void setPropAndStartBrowser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver/WebDriver/bin/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(HomePage.URL);
        /*WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(HomePage.URL);*/
    }

    @After
    public void teardown() {
        driver.quit(); // Закрыть браузер
    }

    //Тест для набора 1
    @Test
    public void checkOrderUpButtonTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCookeMessageButton();
        homePage.clickOrderSmallButton();

        OrderPage orderPage=new OrderPage(driver);
        orderPage.sendName();
        orderPage.sendSurname();
        orderPage.sendAddress();
        orderPage.sendStation();
        orderPage.sendChooseStation();
        orderPage.sendPhone();
        orderPage.clickButtonNext();

        RentPage rentPage=new RentPage(driver);
        rentPage.sendDate();
        rentPage.sendChooseDate();
        rentPage.sendInputPeriod();
        rentPage.sendChoosePeriod();
        rentPage.sendChooseСolor();
        rentPage.sendComment();
        rentPage.clickButtonOrder();
        rentPage.clickButtonOrderYes();
        String orderCompleted="Заказ оформлен";
        MatcherAssert.assertThat(rentPage.getOrderCompleted(), containsString(orderCompleted));

    }
    /*Тест для набора 2
    @Test
    public void checkOrderUpButtonTest_2() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCookeMessageButton();
        homePage.clickOrderSmallButton();

        OrderPage orderPage=new OrderPage(driver);
        orderPage.sendName_2();
        orderPage.sendSurname_2();
        orderPage.sendAddress_2();
        orderPage.sendStation_2();
        orderPage.sendChooseStation_2();
        orderPage.sendPhone_2();
        orderPage.clickButtonNext_2();

        RentPage rentPage=new RentPage(driver);
        rentPage.sendDate_2();
        rentPage.sendChooseDate_2();
        rentPage.sendInputPeriod_2();
        rentPage.sendChoosePeriod_2();
        rentPage.sendChooseСolor_2();
        rentPage.sendComment_2();
        rentPage.clickButtonOrder_2();
        rentPage.clickButtonOrderYes_2();
        String orderCompleted="Заказ оформлен";
        MatcherAssert.assertThat(rentPage.getOrderCompleted(), containsString(orderCompleted));

    }*/
}
