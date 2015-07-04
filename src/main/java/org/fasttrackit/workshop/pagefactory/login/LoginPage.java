package org.fasttrackit.workshop.pagefactory.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

    private WebElement email;

    private WebElement password;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailEl;

    @FindBy (how = How.ID, using = "loginButton")
    private WebElement loginButton;

    public void enterEmail(String email) {
        emailEl.sendKeys(email);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void enterValidCredentials(String emailValue, String passValue) {

        email.sendKeys(emailValue);
        password.sendKeys(passValue);
    }
}
