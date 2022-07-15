package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public static final String URL="https://qa-scooter.praktikum-services.ru/";
    private final WebDriver driver ;
    //Уведомление о куках
    private final By cookeMessageButton = By.className("App_CookieButton__3cvqF");

    //Ссылка на кнопку Заказать маленькая
    protected final By orderSmallButton = By.className("Button_Button__ra12g");

    //Вопросы о важном: Сколько это стоит? И как оплатить?
    private final By questionOne = By.id("accordion__heading-0");

    //Вопросы о важном: Хочу сразу несколько самокатов! Так можно?
    private final By questionTwo = By.id("accordion__heading-1");

    //Вопросы о важном: Как рассчитывается время аренды?
    private final By questionThree = By.id("accordion__heading-2");

    //Вопросы о важном: Можно ли заказать самокат прямо на сегодня?
    private final By questionFour = By.id("accordion__heading-3");

    //Вопросы о важном: Можно ли продлить заказ или вернуть самокат раньше?
    private final By questionFive = By.id("accordion__heading-4");

    //Вопросы о важном: Вы привозите зарядку вместе с самокатом?
    private final By questionSix = By.id("accordion__heading-5");

    //Вопросы о важном: Можно ли отменить заказ?
    private final By questionSeven = By.id("accordion__heading-6");

    //Вопросы о важном: Я живу за МКАДом, привезёте?
    private final By questionEight = By.id("accordion__heading-7");

    //Вопросы о важном: Сколько это стоит? И как оплатить?
    private final By answerOne = By.id("accordion__panel-0");

    //Вопросы о важном: Хочу сразу несколько самокатов! Так можно?
    private final By answerTwo = By.id("accordion__panel-1");

    //Вопросы о важном: Как рассчитывается время аренды?
    private final By answerThree = By.id("accordion__panel-2");

    //Вопросы о важном: Можно ли заказать самокат прямо на сегодня?
    private final By answerFour = By.id("accordion__panel-3");

    //Вопросы о важном: Можно ли продлить заказ или вернуть самокат раньше?
    private final By answerFive = By.id("accordion__panel-4");

    //Вопросы о важном: Вы привозите зарядку вместе с самокатом?
    private final By answerSix = By.id("accordion__panel-5");

    //Вопросы о важном: Можно ли отменить заказ?
    private final By answerSeven = By.id("accordion__panel-6");

    //Вопросы о важном: Я живу за МКАДом, привезёте?
    private final By answerEight = By.id("accordion__panel-7");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickCookeMessageButton() {
        driver.findElement(cookeMessageButton).click();
    }

    public String getAnswerOne(){
        driver.findElement(questionOne).click();
        return driver.findElement(answerOne).getText();
    }
    public String getAnswerTwo(){
        driver.findElement(questionTwo).click();
        return driver.findElement(answerTwo).getText();
    }
    public String getAnswerThree(){
        driver.findElement(questionThree).click();
        return driver.findElement(answerThree).getText();
    }
    public String getAnswerFour(){
        driver.findElement(questionFour).click();
        return driver.findElement(answerFour).getText();
    }
    public String getAnswerFive(){
        driver.findElement(questionFive).click();
        return driver.findElement(answerFive).getText();
    }
    public String getAnswerSix(){
        driver.findElement(questionSix).click();
        return driver.findElement(answerSix).getText();
    }
    public String getAnswerSeven(){
        driver.findElement(questionSeven).click();
        return driver.findElement(answerSeven).getText();
    }
    public String getAnswerEight(){
        driver.findElement(questionEight).click();
        return driver.findElement(answerEight).getText();
    }

    public void clickOrderSmallButton() {
        driver.findElement(orderSmallButton).click();
    }
}
