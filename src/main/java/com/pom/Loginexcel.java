package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Loginexcel {

	 private WebDriver driver;

	    public Loginexcel(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void enterUsername(String username) {
	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
	        passwordField.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	        loginButton.click();
	    }
}
