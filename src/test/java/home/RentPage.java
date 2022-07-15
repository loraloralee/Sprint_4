package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RentPage {
    private final WebDriver driver;
    private final By inputDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By chooseDate = By.xpath(".//div[@aria-label='Choose среда, 13-е июля 2022 г.']");
    private final By chooseDate_2 = By.xpath(".//div[@aria-label='Choose пятница, 29-е июля 2022 г.']");
    private final By inputPeriod = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By choosePeriod = By.xpath(".//div[text()='двое суток']");
    private final By choosePeriod_2 = By.xpath(".//div[text()='четверо суток']");
    private final By chooseColor = By.xpath(".//input[@id='black']");
    private final By chooseColor_2 = By.xpath(".//input[@id='grey']");

    private final By inputComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private final By buttonOrder = By.xpath("(.//button[text()='Заказать'])[2]");
    private final By buttonOrderYes = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");
    private final By orderCompleted = By.xpath("(.//div[text()='Заказ оформлен'])[1]");

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }
    //Набор 1
    public RentPage sendDate() {
        driver.findElement(inputDate).click();
        return this;
    }
    public RentPage sendChooseDate() {
        driver.findElement(chooseDate).click();
        return this;
    }
    public RentPage sendInputPeriod() {
        driver.findElement(inputPeriod).click();
        return this;
    }
    public RentPage sendChoosePeriod() {
        driver.findElement(choosePeriod).click();
        return this;
    }
    public RentPage sendChooseСolor() {
        driver.findElement(chooseColor).click();
        return this;
    }
    public RentPage sendComment() {
        driver.findElement(inputComment).sendKeys("Захватите колы");
        return this;
    }
    public RentPage clickButtonOrder() {
        driver.findElement(buttonOrder).click();
        return this;
    }
    public RentPage clickButtonOrderYes() {
        driver.findElement(buttonOrderYes).click();
        return this;
    }
    public String getOrderCompleted() {
        return  driver.findElement(orderCompleted).getText();
    }


    /*Набор 2
    public RentPage sendDate_2() {
        driver.findElement(inputDate).click();
        return this;
    }
    public RentPage sendChooseDate_2() {
        driver.findElement(chooseDate_2).click();
        return this;
    }
    public RentPage sendInputPeriod_2() {
        driver.findElement(inputPeriod).click();
        return this;
    }
    public RentPage sendChoosePeriod_2() {
        driver.findElement(choosePeriod_2).click();
        return this;
    }
    public RentPage sendChooseСolor_2() {
        driver.findElement(chooseColor_2).click();
        return this;
    }
    public RentPage sendComment_2() {
        driver.findElement(inputComment).sendKeys("Захватите пивка");
        return this;
    }
    public RentPage clickButtonOrder_2() {
        driver.findElement(buttonOrder).click();
        return this;
    }
    public RentPage clickButtonOrderYes_2() {
        driver.findElement(buttonOrderYes).click();
        return this;
    }
    public String getOrderCompleted_2() {
        return  driver.findElement(orderCompleted).getText();
    }*/
}
