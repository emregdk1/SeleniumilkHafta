package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_DersTekrari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("computer");

        WebElement aramaButton = driver.findElement(By.id("nav-search-submit-button"));
        aramaButton.click();

        WebElement aramaSayisi = driver.findElement(By.className("sg-col-inner"));
        //System.out.println("computer arama sayisi : " + aramaSayisi.getText());

        if (aramaSayisi.isDisplayed()) {
            System.out.println("görüyorum");
        }
        else {
            System.out.println("görmüyorum");
        }













    }
}
