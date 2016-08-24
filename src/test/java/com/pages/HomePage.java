package com.pages;


import com.util.CalendisConstants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.ini4j.Config;

public class HomePage extends PageObject{


    @FindBy(css ="#sign_in_submit_button span")
    private WebElementFacade logInLink;


    @FindBy(css ="input#login-email")
    private WebElementFacade userEmailField;


    @FindBy(css ="input#login-password")
    private WebElementFacade userPassField;

    @FindBy(css ="button#sign_in_now")
    private WebElementFacade loginButton;


    public void clickLoginink(){
        waitFor(logInLink);
        clickOn(logInLink);
    }


    public void adminLogin(){
        waitFor(userEmailField);
        typeInto(userEmailField, CalendisConstants.adminUserEmail);
        typeInto(userPassField, CalendisConstants.adminUserPass);
        clickOn(loginButton);
    }
}
