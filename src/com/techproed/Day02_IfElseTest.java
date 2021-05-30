package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_IfElseTest {
    public static void main(String[] args) {
         /*
            1. Create a class : Day2Review
        2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının "youtube"
        olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
        yazdirin.
        3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Navigate to https://www.amazon.com/
        5. Navigate back to youtube
        6. Refresh the page
        7. Navigate forward to amazon
        8. Maximize the window
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Quit the browser
     */

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        System.out.println("youtube'un Title'i : " + youtubeTitle);

        if (youtubeTitle.contains("youtube")) {
            System.out.println("istediginiz kelimeyi iceriyor");
        }
        else {
            System.out.println("gerçek baslik : " + youtubeTitle);
        }

        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("youtube URL'si : " + youtubeUrl);

        if (youtubeUrl.toLowerCase().contains("youtube")) {
            System.out.println("istediginiz kelimeyi iceriyor");
        }
        else {
            System.out.println("istediginiz kelimeyi icermiyor");
        }

        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        String amazonTitle = driver.getTitle();
        System.out.println("amazon'un Title'i : " + amazonTitle);

        if (amazonTitle.contains("Amazon")) {
            System.out.println("istediginiz kelimeyi iceriyor");
        }
        else {
            System.out.println("gercek title : " + amazonTitle);
        }

        String amazonUrl = driver.getCurrentUrl();
        System.out.println("amazon'un URL'si : " + amazonUrl );

        if (amazonUrl.contains("http://amazon.com")) {
            System.out.println("istediginiz URl'yi iceriyor");
        }
        else {
            System.out.println("gercek adres : " + amazonUrl);
        }

        driver.quit();















    }
}
