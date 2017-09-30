package com.Valtech;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {

   private By _aboutPageLink = By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[1]/a/span");
   private By _workPageLink = By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[2]/a/span");
   private By _servicesPageLink = By.xpath("//*[@id=\"navigationMenuWrapper\"]/div/ul/li[3]/a/span");
   private By _pageHeaderTextField = By.xpath("//h1");
   private By _contactPageLink = By.xpath("//a[@id='contacticon']/div/div/div/i");



    public void navigateToDesiredPages(By page, String pageName){

       Utils.clickOnElement(page);
        Assert.assertTrue(Utils.getTextFromElement(_pageHeaderTextField).contains(pageName));
    }

    public void assertH1TagInDesiredPages() throws InterruptedException {

        //Navigates to About Page
        navigateToDesiredPages(_aboutPageLink,"About");
        Thread.sleep(3000);
        //Navigates to Work Page
        navigateToDesiredPages(_workPageLink,"Work");
        Thread.sleep(3000);
        //Navigates to Services Page
        navigateToDesiredPages(_servicesPageLink,"Services");
    }


    public void countValtechOfficesInTotal(){

        //Clicks on ContactPage
        Utils.clickOnElement(_contactPageLink);
        //Counts the Valtech Offices in total
        List<WebElement> webElementList=driver.findElements(By.xpath("//*[@id=\"contactbox\"]/div/div/ul/li"));
        int count=0;
        System.out.println("Valtech offices are present in following countries: ");
        for (WebElement element : webElementList) {
            System.out.println(element.getText());
            count++;
        }
        System.out.println("Total number of Valtech Offices :"+count);
    }
}
