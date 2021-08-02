# Информация

### Простой проект c паттерном Page Object

Использовалось:
```sh
Java 8
IntelliJ IDEA 2019.3.3
```

Для управления браузером используется зависимость maven "WebDriverManager", который нам и скачивает драйвер для запуска тестов. 

Есть возможности для всех нужных браузеров: 
https://github.com/bonigarcia/webdrivermanager 

```sh
WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
WebDriverManager.operadriver().setup();
WebDriverManager.phantomjs().setup();
WebDriverManager.edgedriver().setup();
WebDriverManager.iedriver().setup();
WebDriverManager.chromiumdriver().setup();
```


Можно скачать самостоятельно драйвер по ссылке:

https://github.com/mozilla/geckodriver/releases

... и установить путь (пример для драйвера FireFox)
```sh
String projectPath = System.getProperty("user.dir");
System.setProperty("webdriver.gecko.driver", projectPath + "src/driver/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
```

Зависимости  pom.xml файла:

```sh
<dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>

        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>3.8.1</version>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
