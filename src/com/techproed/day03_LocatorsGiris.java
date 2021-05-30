package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day03_LocatorsGiris {
            // 1. http://a.testaddressbook.com/sign_in adresine gidiniz.
            // 2. email textbox,password textbox, and signin button elementlerini locate ediniz..
            // 3. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
            // 4. Username : testtechproed@gmail.com
            // 5. Password : Test1234!
            // 6. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfa yüklenene kadar en fazla 5 saniye bekler
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/");

        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>

        // sign-in linkini id attribute ile bulur
        WebElement signInLinki = driver.findElement(By.id("sign-in"));

        // singInLinki tiklar
        signInLinki.click();

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        // password kutusunu id attribute ile bulur
        WebElement passwordKutusu = driver.findElement(By.id("session_password"));
        // password kutusunu doldurur
        passwordKutusu.sendKeys("Test1234!");

        // sign in butonunu name attribute ile bulur
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        // dogru sayfada olup olmadigimizi onaylattik
        String testaddressbookUrl = driver.getCurrentUrl();
        System.out.println("testaddress'in URL'si : " + testaddressbookUrl);

        if (testaddressbookUrl.contains("http://a.testaddressbook.com/")) {
            System.out.println("basarili");
        }
        else {
            System.out.println("dogru URL : " + testaddressbookUrl);
        }

        driver.quit();


    }
}
