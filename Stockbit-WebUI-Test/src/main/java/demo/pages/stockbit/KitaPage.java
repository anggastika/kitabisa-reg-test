package demo.pages.stockbit;

import demo.pages.base.BasePageObject;
import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public class KitaPage extends BasePageObject {

    String parentWindow = getDriver().getWindowHandle();

    public void inputUsername(String username) {
        typeOn(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[1]/div/div/input"), username);
    }

    public void inputFullname(String fullname) {
        typeOn(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[2]/div/div/input"), fullname);
    }

    public void clickBtnDaftar() {
        clickOn(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[4]"));
    }

    public String getUsernameWarning() {
        return getDriver().findElement(By.id("username")).getAttribute("validationMessage");
    }

    public String getPasswordWarning() {
        return getDriver().findElement(By.id("password")).getAttribute("validationMessage");
    }

    public boolean isBtnLoginDisplayed() {
        return isPresent(By.id("loginbutton"));
    }

    public void clickLoginWithGoogleButton() {
        clickOn(By.cssSelector("input.login-goog"));
    }

    public void clickLoginWithFacebookButton() {
        clickOn(By.cssSelector("a.login-fb"));
    }

    public void switchToNewlyOpenedWindow() {
        Set<String> windows = getDriver().getWindowHandles();
        for (String window : windows)
            getDriver().switchTo().window(window);
    }

    public void inputFacebookEmail(String email) {
        typeOn(By.id("email"), email);
    }

    public void inputFacebookPassword(String password) {
        typeOn(By.id("pass"), password);
    }

    public void clickFacebookLoginButton() {
        clickOn(By.cssSelector("input[value='Log In']"));
    }

    public void inputGoogleEmail(String email) {
        typeOn(By.id("identifierId"), email);
    }

    public void clickGoogleNextButton() {
        clickOn(By.xpath("//span[text()='Next' or text()='Berikutnya']//parent::button"));
    }

    public void inputGooglePassword(String password) {
        typeOn(By.cssSelector("input[type='password']"), password);
    }

    public void switchToParentWindow() {
        getDriver().switchTo().window(parentWindow);
    }

    public void userCloseAvatarPopup(){
        //if (isPresent(By.xpath("//div[@class='rateUsWrap']"))){
        //    clickOn(By.xpath("//div[@class='rateUs']//div[@class='RateUsClose']"));
        //}

        try {
            if (isPresent(By.cssSelector(".ant-modal-content"))) {
                clickOn(By.cssSelector(".skip-btn"));

            }
        }
        catch (Exception e) {
            return;
        }
    }

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(WebdriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/header/div/div/span")))
                .isDisplayed();
    }

    public boolean isOnWelPage() {
        WebDriverWait wait = new WebDriverWait(WebdriverInstance.webdriver, 15);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/main/main/div[2]/h1[1]")))
                .isDisplayed();
    }

    public void clickMenu(By by) {
        if (!isVisible(by)) clickOn(By.className("navmore"));
        clickOn(by);
    }

    public void clickMasuk() {
        clickOn(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/p/a"));
    }

    public void clickLanjutkan() {
        clickOn(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[2]/button"));
    }


    public String getAlertMessage() {
//        return getText(By.cssSelector(".sysmsg-content"));
        return getText(By.xpath("//div[@class='sysmsg-content']/div"));
//        return getText(By.xpath("//div[@class='sysmsg']"));
    }



    public String getSuccessAlertMessage() {
        return getText(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[1]/div/span"));
    }

    public String getAlertFullName(){
        return getText(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[2]/form/div[2]/div/span"));
    }

    public void clickMenuLogin() {
        clickOn(By.className("login-ldn"));
    }

    public void clickBtnFb() {clickOn(By.xpath("//*[@id=\"button-facebook\"]"));}

    public void clickBtnGo() {clickOn(By.xpath("//*[@id=\"button-google\"]"));}

}
