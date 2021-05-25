package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;

    @BeforeTest
    public void setup(){                                    //TRY TO USE UTILITY CLASS
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
        //driver.quit();
        driver.close();
    }

}
