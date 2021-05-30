package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatersGiris2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailKutusu = driver.findElement(By.className("form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.className("form-control"));
        password.sendKeys("Test1234!");

    }
}
