package org.fasttrackit.workshop.Preferences;


import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.utils.Utils;


public class PreferencesView {

    private WebLocator window = new WebLocator().setId("preferences-win");

    private Button preferencesButton = new Button().setText("Preferences");
   // private TextField currentPassword = new TextField().setLabel("Current Password");
    private TextField currentPassword = new TextField().setLabel("Current Password");
    private TextField newPassword = new TextField().setLabel("New Password");
    private TextField confirmNewPassword = new TextField().setLabel("Repeat Password");
    private Button saveButton = new Button().setText("Save");


    public static void main(String[] args) {
        PreferencesView preferencesWindow = new PreferencesView();
        System.out.println(preferencesWindow.saveButton.getPath());
        System.out.println(preferencesWindow.window.getPath());
    }

    public void open() {
        preferencesButton.click();

    }

    public void typeCurrentPassword(String validPassword) {
        Utils.sleep(200);
        currentPassword.setValue(validPassword);
    }


    public void typeNewPassword(String password) {
        newPassword.setValue(password);
    }

    public void typeConfirmPassword(String newPassword) {
        confirmNewPassword.setValue(newPassword);
        Utils.sleep(200);
    }
}
