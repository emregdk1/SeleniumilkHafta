package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Calisma1FacebookKayit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://facebook.com");

        WebElement kayitButton = driver.findElement(By.linkText("Yeni Hesap Oluştur"));
        kayitButton.click();

        WebElement adGir = driver.findElement(By.name("firstname"));
        adGir.sendKeys("Muittin");

        WebElement soyAdGir = driver.findElement(By.name("lastname"));
        soyAdGir.sendKeys("Topal");

        WebElement emailGir = driver.findElement(By.name("reg_email__"));
        emailGir.sendKeys("muittin_topal@gmail.com");

        WebElement emailTekrar = driver.findElement(By.name("reg_email_confirmation__"));
        emailTekrar.sendKeys("muittin_topal@gmail.com");

        WebElement sifreGir = driver.findElement(By.name("reg_passwd__"));
        sifreGir.sendKeys("1598520");

        WebElement gunGir = driver.findElement(By.id("day"));
        gunGir.sendKeys("4");

        WebElement ayGir = driver.findElement(By.id("month"));
        ayGir.sendKeys("May");

        WebElement yilGir = driver.findElement(By.id("year"));
        yilGir.sendKeys("1996");
















    }
}
