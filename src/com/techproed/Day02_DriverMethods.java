package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");

        // amazon'un Title'ini alir
        String amazonTitle = driver.getTitle();

        // amazon'un Title'ini yazdirir
        System.out.println("amazon'un Title'i : " + amazonTitle);

        //  amazon'un URL'sini alir
        String amazonUrl = driver.getCurrentUrl();

        // amazonun URL'sini yazdirir
        System.out.println("amazonun URL'si sudur : " + amazonUrl);


    }
}
