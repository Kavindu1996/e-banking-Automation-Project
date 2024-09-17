package com.inetbanking.testCases;

import com.inetbanking.pageObjects.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {


    @Test
    public void logIbTest(){
        driver.get(baseURL);

        logger.info("URL is opened");

        LogInPage lp = new LogInPage(driver);
        lp.setUsername(username);
        logger.info("Entered username");

        lp.setPassword(password);
        logger.info("Entered password");

        lp.clickSubmit();

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("Loggin test passed.");
        }
        else {
            Assert.assertTrue(false);
            logger.info("Loggin test failed.");
        }
    }
}
