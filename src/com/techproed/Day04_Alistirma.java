package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_Alistirma {
    /*
    1. Bir class oluşturun : GoogleSearchTest
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    A.google web sayfasına gidin. https://www.google.com/
            b. Search(ara) “city bike”
    c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
    d. “Shopping” e tıklayın.
    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

     */


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/EMre/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://google.com");

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        WebElement goruntulemeSayisi = driver.findElement(By.id("result-stats"));
        String goruntulemeYazisi = goruntulemeSayisi.getText();
        System.out.println("görüntülenme yazisi : " + goruntulemeYazisi);

        WebElement alisverisLinki = driver.findElement(By.className("hide-focus-ring"));
        alisverisLinki.click();




























    }
}
