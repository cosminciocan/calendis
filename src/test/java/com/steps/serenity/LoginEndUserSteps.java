package com.steps.serenity;

import com.util.AbstractSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginEndUserSteps extends AbstractSteps{

    @Step
    public void is_on_the_homepage(){
        homePage.open();

    }

    public void wants_to_login() {
        homePage.clickLoginink();
        homePage.adminLogin();
    }

    public void should_be_logged_in() {
        Assert.assertTrue("Not logged in!", loggedInHomePage.checkLoggedIn());
    }
}
