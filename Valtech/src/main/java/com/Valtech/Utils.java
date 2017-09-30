package com.Valtech;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{

    //re-usable method for click on Element
    public static void clickOnElement(By by){

        driver.findElement(by).click();
    }



    //Reusable method for getText
    public static String getTextFromElement(By by){     //return type as String - why? to store and return the test we are receving from the element
        String text =  driver.findElement(by).getText();                                                          // so we can reuse the text
        return text;
    }



    //Reusable Method For DateStamp
    public static String dateStamp(){
        DateFormat dateFormat = new SimpleDateFormat("ddMMMyyHHmm");
        Date date = new Date();
        String date1 = dateFormat.format(date);
        return date1;
    }

    //Reusable method for Fail Test Screenshot for Just Maven Project
    public static void captureFailTestScreenShot(WebDriver driver, String screenShotName){

        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
            File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./ScreenShot/" + screenShotName + "." +dateStamp()+ ".png"));
            System.out.println("Screenshot has been taken");
        }
        catch (Exception e){
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }
    }

}
