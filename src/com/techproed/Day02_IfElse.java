package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_IfElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
        String amazonTitle = driver.getTitle();
        System.out.println("amazon'un Title'i : " + amazonTitle);

        if (amazonTitle.toLowerCase().contains("elma")) {
            System.out.println(amazonTitle + " 'da computer kelimesi geciyor");
        }
        else {
            System.out.println(amazonTitle + " 'da elma kelimesi gecmiyor");
        }


    }
}
