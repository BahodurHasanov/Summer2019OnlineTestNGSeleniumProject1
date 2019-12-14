package tests.vytrack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;
import utils.Driver;

public class LoginPageTest1 extends TestBase {


    @Test(description = "Verify that page title is a 'Dashboard'")



    public void Test1(){


        LoginPage loginPage= new LoginPage();

        loginPage.login("storemanager85", "UserUser123");

        WebDriverWait wait = new WebDriverWait(Driver.get(), 25);

        wait.until(ExpectedConditions.titleIs("Dashboard"));



        Assert.assertEquals(Driver.get().getTitle(), "Dashboard");

    }


}
