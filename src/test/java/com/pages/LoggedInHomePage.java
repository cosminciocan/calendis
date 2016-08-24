package com.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoggedInHomePage extends PageObject{

    @FindBy(css = "a#nav-disconect")
    private WebElementFacade logOutButton;



    public boolean checkLoggedIn(){
        return logOutButton.isDisplayed();
    }

}
