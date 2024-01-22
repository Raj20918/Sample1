package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	@Given("Open url")
	public void open_url() {
	 System.out.println("url");
	}

	@When("Validate the username {string}")
	public void validate_the_username(String string) {
	   System.out.println(string);
	}

	@When("Validate the password {string}")
	public void validate_the_password(String string) {
	  System.out.println(string);
	}

	@When("Click the login button")
	public void click_the_login_button() {
	   System.out.println("login");
	}

	@Then("Open home page")
	public void open_home_page() {
	  System.out.println("password");
	}






}
