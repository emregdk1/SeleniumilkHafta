package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // driver'imiza google.com'a gitmesini söyledik
        driver.get("http://google.com");
        driver.get("http://amazon.com");
        // driver'imizda acik olan sayfayi kapatir
        //driver.close();

        // driver'imizi tüm sekmeleriyle tamamen kapatir
        driver.quit();

    }
}
