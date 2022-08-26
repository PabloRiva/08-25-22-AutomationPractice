import Pages.cartPage;
import Pages.homePage;
import Pages.loginPage;
import Utilities.driverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class homeTests extends baseTest{


    @Test
    public void verifyMenuButtonIsWorking(){
        loginPage loginPage = new loginPage(driverManager.getDriver());
        loginPage.setUserNameTB("standard_user");
        loginPage.setPasswordTB("secret_sauce");
        loginPage.clickOnLoginBtn();
        homePage homePage = new homePage(driverManager.getDriver());
        homePage.clickOnMenuIcon();
        Assert.assertTrue(homePage.menuIsDisplayed());
    }

    @Test
    public void verifyContinueShoppingBtnIsWorking(){
        loginPage loginPage = new loginPage(driverManager.getDriver());
        loginPage.setUserNameTB("standard_user");
        loginPage.setPasswordTB("secret_sauce");
        loginPage.clickOnLoginBtn();
        homePage homePage = new homePage(driverManager.getDriver());
        homePage.clickOnCartButton();
        cartPage cartPage = new cartPage(driverManager.getDriver());
        cartPage.clickOnContinueShoppingBtn();
        Assert.assertTrue(homePage.appLogoIsDisplayed());
    }






}
