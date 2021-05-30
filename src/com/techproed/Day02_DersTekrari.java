package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DersTekrari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://google.com"); // google sayfasini görecegiz
        driver.navigate().to("http://amazon.com"); // amazon sayfasini görecegiz
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();













    }
}
