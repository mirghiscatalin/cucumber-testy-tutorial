package org.fasttrackit.workshop.login;

import com.sdl.selenium.web.WebLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginView {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginView.class);

    private WebLocator email = new WebLocator().setId("email");
    private WebLocator password = new WebLocator().setId("password");
    private WebLocator emailEl = new WebLocator().setId("emailEl");
    private WebLocator loginButton = new WebLocator().setId("loginButton");
    private WebLocator error = new WebLocator().setId("error");

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

    public WebLocator getWebElement() {
        return error;
    }
}
