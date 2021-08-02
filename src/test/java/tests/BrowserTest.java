package tests;

import org.junit.*;


public class BrowserTest  extends TestMain {


        @Test
        public void firstTest() {
                main.goTo();
                Assert.assertEquals(driver.getTitle(), "Лучшие публикации за сутки / Хабр");

        }

        @Test
        public void secondTest() {
                main.goTo();
                main.chooseCategory("//div[@class='layout__row layout__row_navbar']//li[2]/a[1]");
                taskOne.checkPageIsCorrect("//div[contains(text(),'Разработка')]");

        }

        @Test
        public void thirdTest() {

                main.goTo();
                main.chooseCategory("//div[@class='layout__row layout__row_navbar']//li[7]/a[1]]");
                taskOne.checkPageIsCorrect("//div[contains(text(),'Научпоп')]");

        }


}
