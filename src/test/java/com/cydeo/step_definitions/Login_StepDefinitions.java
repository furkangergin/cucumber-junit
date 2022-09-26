package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("user enters librarian user name")
    public void user_enters_librarian_user_name() {
        System.out.println("user enters librarian user name");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");


    }

    @When("user enters student user name")
    public void userEntersStudentUserName() {
        System.out.println("user enters student user name");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin user name")
    public void userEntersAdminUserName() {
        System.out.println("user enters admin user name");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
}
