package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Odev1 {
    public static void main(String[] args) {
        /*
    1. yeni bir class olusturun,
    2. chromeDriver i kullanarak facebook' a gidin ve sayfa basliginin " facebook" olup olmadigini dogrulayin
       degilse dogru basligi( actual title ) yazdirin
    3. sayfa URL' sinin facebook icerip icermedigini (contains),
    degilse dogru URL; yi(actual URL ) yazdirin.
    4. sonra Navigate to http:\\www.walmart.com
    5. Walmart sayfa basligignin " Walmart.com" icerip icermedigini dogrulayin
    6. navigate back to facebook
    7.sayfayi refresh yapin
    8. maximize the window yapin
    9. close the browser
​
     */

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        String facebookTitle = driver.getTitle();
        System.out.println("facebook'un Title'i : " + facebookTitle);

        if (facebookTitle.contains("facebook")) {
            System.out.println("facebook'un Title'i : " + facebookTitle);
        }
        else {
            System.out.println("facebook'un dogru basligi : " + facebookTitle);
        }

        String facebookUrl = driver.getCurrentUrl();
        System.out.println("facebook'un URL'si : " + facebookUrl);

        if (facebookUrl.contains("facebook")) {
            System.out.println("istediginiz kelimeyi iceriyor");
        }
        else {
            System.out.println("facebook'un gercek URL'si" + facebookUrl);
        }

        driver.navigate().to("http://walmart.com");
        String walmartTitle = driver.getTitle();
        System.out.println("walmart'in Title'i : " + walmartTitle);

        if (walmartTitle.contains("Walmart.com")) {
            System.out.println("girdiginiz basligi iceriyor");
        }
        else {
            System.out.println("walmart'in gercek Title'i : " + walmartTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();

        driver.quit();

    }
}
