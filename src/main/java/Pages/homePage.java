package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    WebDriver driver;

    @FindBy(className = "social_facebook")
    WebElement facebookLogo;

    @FindBy(className = "app_logo")
    WebElement appLogo;
    @FindBy(id="react-burger-menu-btn")
    WebElement iconMenu;

    @FindBy(id="react-burger-cross-btn")
    WebElement closeIcon;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public homePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFacebookLink(){
        facebookLogo.click();
    }
    public void clickOnMenuIcon(){
        iconMenu.click();
    }

    public boolean menuIsDisplayed(){
        boolean menuCloseIconIsDisplayed = closeIcon.isDisplayed();
        return menuCloseIconIsDisplayed;
    }

    public boolean appLogoIsDisplayed() {
        boolean appLogoIsDisplayed = appLogo.isDisplayed();
        return appLogoIsDisplayed;
    }

    public void clickOnCartButton(){
        cartIcon.click();
    }

}
