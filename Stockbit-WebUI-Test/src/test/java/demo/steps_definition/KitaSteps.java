package demo.steps_definition;

import demo.pages.stockbit.KitaPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class KitaSteps {

    KitaPage kitaPage = new KitaPage();

    @Given("User is on kitabisa register page")
    public void userIsOnLandingPage() {
        Assert.assertTrue(kitaPage.isOnPage());
    }

    @When("User click masuk")
    public void userClickMenuLogin() {
        kitaPage.clickMasuk();
    }

    @When("User click button Lanjutkan")
    public void userClickButtonLanjutkan() {kitaPage.clickLanjutkan();}

    @And("User input username as {string}")
    public void userInputUsernameAs(String username) {
        kitaPage.inputUsername(username);
    }

    @And("User input fullname as {string}")
    public void userInputPasswordAs(String fullname) {
        kitaPage.inputFullname(fullname);
    }

    @And("User click button daftar")
    public void userClickButtonDaftar() {
        kitaPage.clickBtnDaftar();
    }

    @Then("User get alert {string}")
    public void userGetAlert(String alert) {
        Assert.assertEquals(alert, kitaPage.getSuccessAlertMessage());
    }

    @Then("User get alert fullname {string}")
    public void userGetAlerFullname(String alert2) {
        Assert.assertEquals(alert2,kitaPage.getAlertFullName());
    }


    @Then("User is on homepage")
    public void userIsOnHomepage() {
        Assert.assertTrue(kitaPage.isOnPage());
    }

    @Then("User is on welcome page")
    public void userIsOnWelcomePage() {
        Assert.assertTrue(kitaPage.isOnWelPage());
    }

    @Then("User gets error {string}")
    public void userGetsError(String error) {
        Assert.assertEquals(error, kitaPage.getAlertMessage());
    }

    @Then("User gets warning on username field {string}")
    public void userGetsWarningOnUsernameField(String warning) {
        //Assert.assertEquals(warning, loginPage.getUsernameWarning());
    }

    @Then("Button login is still visible")
    public void buttonLoginIsStillVisible() {
        Assert.assertTrue(kitaPage.isBtnLoginDisplayed());
    }

    @Then("User gets warning on password field {string}")
    public void userGetsWarningOnPasswordField(String warning) {
        Assert.assertEquals(warning, kitaPage.getPasswordWarning());
    }

    @When("User click login with Facebook button")
    public void userClickLoginWithFacebookButton() {
        kitaPage.clickLoginWithFacebookButton();
    }

    @When("User changes to other window")
    public void userChangesToOtherWindow() {
        kitaPage.switchToNewlyOpenedWindow();
    }

    @When("User input facebook email {string}")
    public void userInputFacebookEmail(String email) {
        kitaPage.inputFacebookEmail(email);
    }

    @When("User input facebook password {string}")
    public void userInputFacebookPassword(String password) {
        kitaPage.inputFacebookPassword(password);
    }

    @When("User click facebook login button")
    public void userClickFacebookLoginButton() {
        kitaPage.clickFacebookLoginButton();
    }

    @When("User changes back to parent window")
    public void userChangesBackToParentWindow() {
        kitaPage.switchToParentWindow();
    }

    @When("User click login with Google button")
    public void userClickLoginWithGoogleButton() {
        kitaPage.clickLoginWithGoogleButton();
    }

    @When("User input Google email {string}")
    public void userInputGoogleEmail(String email) {
        kitaPage.inputGoogleEmail(email);
    }

    @When("User click Google next button")
    public void userClickGoogleNextButton() {
        kitaPage.clickGoogleNextButton();
    }

    @When("User input Google password {string}")
    public void userInputGooglePassword(String password) {
        kitaPage.inputGooglePassword(password);
    }

    @And("User close profile avatar popup")
    public void userCloseProfile(){kitaPage.userCloseAvatarPopup();}

    @And("User click daftar dengan facebook")
    public void userClickDaftarWithFb() {kitaPage.clickBtnFb();}

    @And("User click daftar dengan google")
    public void userClickDaftarWithGo() {kitaPage.clickBtnGo();}
}
