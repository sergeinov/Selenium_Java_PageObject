package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BasePage{

    String SITE_URL = "https://habr.com/ru/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void chooseCategory(String xPath) {
        click(By.xpath(xPath));
    }



}

