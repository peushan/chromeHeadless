package com.taskschedular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    private WebDriver driver;


   @Test
   public void luanchBrowser(){
       System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
       ChromeOptions options = new ChromeOptions();
       //options.addArguments("headless");
       options.addArguments("window-size=1400,600");
       driver = new ChromeDriver(options);
       String baseUrl = "https://www.google.com/";
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get(baseUrl);
       System.out.println("Chrome works and browser opened");

   }
}
