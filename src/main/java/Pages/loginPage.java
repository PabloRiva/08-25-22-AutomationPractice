package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    @FindBy(id="user-name")
    WebElement userNameTB;
    @FindBy(id="password")
    WebElement passwordTB;
    @FindBy(id="login-button")
    WebElement LoginBTN;

    @FindBy(tagName = "h3")
    WebElement loginError;

    public loginPage(WebDriver driver ){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setUserNameTB(String username){
        userNameTB.sendKeys(username);
    }
    public void setPasswordTB(String password){
        passwordTB.sendKeys(password);
    }
    public void clickOnLoginBtn(){
        LoginBTN.click();
    }

    public String getLoginErrorMessage(){
        String errorMessage = loginError.getText();
        return  errorMessage;
    }
}
