package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {

    WebDriver driver;
    @FindBy(id="continue-shopping")
    WebElement continueShoppingBtn;

    @FindBy(id="checkout")
    WebElement checkoutBtn;

    public cartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public void clickOnContinueShoppingBtn(){
        continueShoppingBtn.click();
    }

    public void clickOnCheckoutBtn(){
        checkoutBtn.click();
    }
}
