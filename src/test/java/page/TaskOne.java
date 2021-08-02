package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne  extends BasePage{

    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public  void checkPageIsCorrect(String xPath) {
        isElementDisplayed(By.xpath(xPath));
    }
}
