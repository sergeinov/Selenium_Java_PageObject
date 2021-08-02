// файл с основными настройками для запуска

package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.TaskOne;

import java.util.concurrent.TimeUnit;

public class TestMain {

    public WebDriver driver;
    public Main main;
    public TaskOne taskOne;

    @Before
    public void start() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskOne = PageFactory.initElements(driver, TaskOne.class);
    }

    @After
    public void finish() {
        driver.quit();
    }
}
