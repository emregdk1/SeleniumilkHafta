package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alistirma2YesilKartForum {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://yesilkartforum.com");

        WebElement forumLink = driver.findElement(By.linkText("FORUM"));
        forumLink.click();

        WebElement kayitLink = driver.findElement(By.linkText("Kayıt Ol"));
        kayitLink.click();

        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("muittin_topal@gmail.com");

        WebElement usernameKutusu = driver.findElement(By.id("username"));
        usernameKutusu.sendKeys("muittintopal52");

        WebElement konumKutusu = driver.findElement(By.id("inputLocation"));
        konumKutusu.sendKeys("Ordu/Ünye");

        WebElement passwordKutusu = driver.findElement(By.id("password"));
        passwordKutusu.sendKeys("1598520");

        WebElement passwordTekrar = driver.findElement(By.id("password-confirm"));
        passwordTekrar.sendKeys("1598520");

        WebElement kayitButton = driver.findElement(By.id("register"));
        kayitButton.click();

        WebElement kabulKutusu = driver.findElement(By.id("agree-terms"));
        kabulKutusu.click();

        WebElement gonderButtonu = driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/div[2]/div/button"));
        gonderButtonu.click();






    }
}
