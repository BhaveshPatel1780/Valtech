package com.Valtech;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestSuit extends BaseTest{


    HomePage homePage = new HomePage();

    @Test
    public void verifyLatestNewsSectionIsDisplayed(){

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[3]/div[1]/header/h2")).isDisplayed(),"Latest News section is not Displayed");

    }

    @Test
    public void verifyH1TagInEachPateTest() throws InterruptedException {
        homePage.assertH1TagInDesiredPages();
    }


    @Test
    public void contactPageValtechOfficesInTotal() {

        homePage.countValtechOfficesInTotal();
    }

}
