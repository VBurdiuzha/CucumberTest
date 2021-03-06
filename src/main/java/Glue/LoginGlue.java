package Glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;

import java.util.ArrayList;
import java.util.List;

public class LoginGlue implements En {

    @And("^I enter the ([^\"]*) and ([^\"]*)$")
    public void iEnterTheUsernameAndPassword(String username, String password) {
        System.out.println("The name is : " + username);
        System.out.println("The password is : " + password);
    }

     class User{
        private String username;
        private String password;

        public User(String userName, String passWord){
            // create constructors
            this.username = userName;
            this.password = passWord;
        }
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage()  {
        System.out.println("Navigate to the login page\n");
    }

    @And("^I click login button$")
    public void iClickLoginButton()  {
        System.out.println("\nClick login button");
    }

    @And("^I enter the data of person$")
    public void iEnterTheDataOfPerson(DataTable table){
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for(User user:users) {
            System.out.println("The name is : " + user.username);
            System.out.println("The password is : " + user.password);
        }
    }

    @Then("^I should see the form page$")
    public void iShouldSeeTheUserformPage() {
        System.out.println("\nI should see page with form");
    }

}
