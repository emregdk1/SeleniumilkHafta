package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDersAlistirma {
    public static void main(String[] args) {
        // 1. google.com'a gidin
        // 2. navigate to method'u ile amazon.com'a gidin
        // 3. navigate back ile geri gelin
        // 4. forward method'u ile tekrar ileri gidin
        // 5. bulundugunuz sayfayi yenileyin
        // 6. driver'i kapatin

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\EMre\\Documents\\selenium dependencies\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close();
    }
}
