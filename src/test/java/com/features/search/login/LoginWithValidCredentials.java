package com.features.search.login;


import com.steps.serenity.LoginEndUserSteps;
import javafx.beans.value.WeakChangeListener;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginWithValidCredentials {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    private LoginEndUserSteps admin;


    @Test
    public void login_to_business_site_with_valid_credentials(){
        admin.is_on_the_homepage();
        admin.wants_to_login();
        admin.should_be_logged_in();
    }




}
