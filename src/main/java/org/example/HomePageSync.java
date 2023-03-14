package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePageSync {

//Facebook
@FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

@FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement pass;

@FindBy(xpath = "//*[@id=\"u_0_5_+C\"]")
    WebElement click;


public void FacebookEmail(String emailText) {
    email.click();
    email.sendKeys(emailText);
}

public void FacebookPass(String password){
    pass.click();
    pass.sendKeys(password, Keys.ENTER);
    ;
}










}
