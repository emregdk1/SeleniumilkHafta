package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println("youtube'un Title'i : " + youtubeTitle);

        if(youtubeTitle.toLowerCase().contains("youtube")) {
            System.out.println("istediginiz kelimeyi iceriyor");
        }
        else {
            System.out.println("istediginiz kelimeyi icermiyor");
        }

        driver.quit();
    }
}
