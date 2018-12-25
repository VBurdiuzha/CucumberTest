package Glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

import java.util.ArrayList;
import java.util.List;

public class CreditCardGlue implements En {

    private static List<cardInfo> cards = new ArrayList<cardInfo>();

    class cardInfo {
        private String balance = null;
        private String withdraw = null;
        private String current = null;
        private String operation = null;

        public cardInfo(String balance, String withdraw, String current, String operation) {
            this.balance = balance;
            this.withdraw = withdraw;
            this.current = current;
            this.operation = operation;
        }

    }


    @Given("^I have card balance$")
    public void iHaveCardBalance(DataTable table){

        cards = table.asList(cardInfo.class);

        for (cardInfo info : cards) {
            System.out.println("There are " + info.balance + " money on my balance");
        }
    }


    @When("^I want withdraw withdraw money from my balance$")
    public void iWantGetInformationAboutCurrentMoneyOnCard() {

        for (cardInfo info : cards) {
            System.out.println("Left " + info.balance + " money on my balance");
        }
    }

    @When("^I want get information about current money on card$")
    public void iWantWithdrawMoneyFromMyBalance() {


        for (cardInfo info : cards) {
            System.out.println(" There are " + info.withdraw + " will be withdraw");

        }
    }

    @Then("^I want to get message about operation$")
    public void iWantToGetMessageAboutOperation() {


        for (cardInfo info : cards) {
            System.out.println("Operation done " + info.operation);
        }
    }
}
