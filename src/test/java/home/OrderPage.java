package home;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class OrderPage {
    private final WebDriver driver;
    private final By inputName = By.xpath(".//input[@placeholder='* Имя']");
    private final By inputSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private final By inputAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By inputStation = By.xpath(".//input[@placeholder='* Станция метро']");
    private final By inputPhone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By inputNameStation = By.xpath(".//ul[contains(@class,'select-search__options')]/li");
    private final By inputNameStation_2 = By.xpath(".//div[@class='Order_Circle__3uWFr']");
    private final By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    public OrderPage(WebDriver driver) {

        this.driver = driver;
    }
    Order order=new Order("Лариса","Ли","город Ташкент","Сокольники","+7899999999");

    public OrderPage fillOrderForm(){
        fillName(order.getName());
     fillSurname(order.getSurname());
     fillAddress(order.getAddress());
     fillStation(order.getStation());
     fillPhone(order.getPhone());
     return this;
    }
    private void fillName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }
    private void fillSurname(String surname) {
        driver.findElement(inputSurname).sendKeys(surname);
    }
    private void fillAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
    }
    private void fillStation(String station) {
        driver.findElement(inputStation).click();
        driver.findElement(inputNameStation).click();
    }

    private void fillPhone(String phone) {
        driver.findElement(inputPhone).sendKeys(phone);
    }
    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }



/*
    // Набор1
    public OrderPage sendName() {
        driver.findElement(inputName).sendKeys("Лариса");
        return this;
    }
    public OrderPage sendSurname() {
        driver.findElement(inputSurname).sendKeys("Ли");
        return this;
    }
    public OrderPage sendAddress() {
        driver.findElement(inputAddress).sendKeys("г.Ташкент");
        return this;
    }
    public OrderPage sendStation() {
        driver.findElement(inputStation).click();
        return this;
    }
    public OrderPage sendChooseStation() {
        driver.findElement(inputNameStation).click();
        return this;
    }

    public OrderPage sendPhone() {
        driver.findElement(inputPhone).sendKeys("+998931111111");
        return this;
    }
    public OrderPage clickButtonNext() {
        driver.findElement(buttonNext).click();
        return this;
    }

    /*Набор 2
    public OrderPage sendName_2() {
        driver.findElement(inputName).sendKeys("Петя");
        return this;
    }
    public OrderPage sendSurname_2() {
        driver.findElement(inputSurname).sendKeys("Жоловец");
        return this;
    }
    public OrderPage sendAddress_2() {
        driver.findElement(inputAddress).sendKeys("г.Москва");
        return this;
    }
    public OrderPage sendStation_2() {
        driver.findElement(inputStation).click();
        return this;
    }
    public OrderPage sendChooseStation_2() {
        driver.findElement(inputNameStation_2).click();
        return this;
    }
    public OrderPage sendPhone_2() {
        driver.findElement(inputPhone).sendKeys("+7789966333");
        return this;
    }
    public OrderPage clickButtonNext_2() {
        driver.findElement(buttonNext).click();
        return this;
    }*/
}