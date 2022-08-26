package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
    WebDriver driver;
    @FindBy(id="first-name")
    WebElement firstNameTB;

    public checkoutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    public boolean firstNameTBIsDisplayed(){
        boolean firstNameTBIsDisplayed = firstNameTB.isDisplayed();
        return firstNameTBIsDisplayed;
    }
}
