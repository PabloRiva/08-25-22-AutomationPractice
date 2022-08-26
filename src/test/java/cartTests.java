import Pages.cartPage;
import Pages.checkoutPage;
import Pages.homePage;
import Pages.loginPage;
import Utilities.driverManager;
import org.junit.Assert;
import org.junit.Test;

public class cartTests extends baseTest{
    @Test
    public void verifyCheckOutButtonIsWorkin(){
        loginPage loginPage = new loginPage(driverManager.getDriver());
        loginPage.setUserNameTB("standard_user");
        loginPage.setPasswordTB("secret_sauce");
        loginPage.clickOnLoginBtn();
        homePage homePage = new homePage(driverManager.getDriver());
        homePage.clickOnCartButton();
        cartPage cartPage = new cartPage(driverManager.getDriver());
        cartPage.clickOnCheckoutBtn();
        checkoutPage checkoutPage = new checkoutPage(driverManager.getDriver());
        Assert.assertTrue(checkoutPage.firstNameTBIsDisplayed());
    }

}
