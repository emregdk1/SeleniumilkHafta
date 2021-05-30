package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {
        //TODO Driverı ekranı kaplıcakşekilde kullanalım
        // -ilk önce google.com'a gidelim
        // 2-sayfanın title'ını alalım ekrana yazdıralım
        // 3-daha sonra youtube.com'a gidelim
        // 4-sayfanın title'ını ve urlsini alıp ekrana yazdıralım
        // 5-google.com'a geri gelelim ve sayfanın url'sini alıp ekrana yazdıralım
        // 6-driverımızı kapatalım

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://google.com");
        String googleTitle = driver.getTitle();
        System.out.println("google'in Title'i : " + googleTitle);

        driver.navigate().to("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println("youtube'un Title'i : " + youtubeTitle);

        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("youtube'nin URL'si : " + youtubeUrl);

        driver.navigate().back();
        String googleUrl = driver.getCurrentUrl();
        System.out.println("google'in URL'si : " + googleUrl);


        driver.close();

    }
}
