package com.Valtech;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage{

    Utils utils = new Utils();
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.valtech.com/");
    }

    @AfterMethod
    public void closeBrowser(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            utils.captureFailTestScreenShot(driver, result.getName());
        }
        driver.quit();
    }
}
