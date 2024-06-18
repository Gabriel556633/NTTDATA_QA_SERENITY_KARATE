package starter.selectProduct;


import org.openqa.selenium.By;

public class SelectProduct {

    public static By PRODUCT1 = By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a");
    public static By ANADIR = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    public static By PRODUCT2 = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a");
    public static By GOCART = By.xpath("//*[@id=\"cartur\"]");
    public static By ORDER = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    public static By NAME = By.xpath("//*[@id=\"name\"]");
    public static By COUNTRY = By.id("country");
    public static By CITY = By.id("city");
    public static By CARD = By.xpath("//*[@id=\"card\"]");
    public static By MONTH = By.xpath("//*[@id=\"month\"]");
    public static By YEAR = By.xpath("//*[@id=\"year\"]");
    public static By PURCHASE = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
}
