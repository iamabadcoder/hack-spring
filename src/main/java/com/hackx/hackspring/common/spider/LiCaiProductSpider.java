package com.hackx.hackspring.common.spider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by hackx on 9/25/16.
 */
public class LiCaiProductSpider {

    static String licaiIndex = "https://licai.lianjia.com/licai";

    public void startSpider() {
        WebDriver driver = initDriver();
        driver.get(licaiIndex);


    }

    private WebDriver initDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }


}
