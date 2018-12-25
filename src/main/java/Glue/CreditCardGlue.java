package Glue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

import java.util.ArrayList;
import java.util.List;

public class CreditCardGlue implements En {

    static class cardInfo {
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


        @Given("^I have card ([^\"]*)$")
        public void iHaveCardBalance(DataTable table) throws  Throwable {

            List<cardInfo> cards = new ArrayList<cardInfo>();
            cards = table.asList(cardInfo.class);

            for (cardInfo info : cards) {
                System.out.println("There are " + info.balance + " money on my balance");
            }


        }


        @When("^I want get information about ([^\"]*) money on card$")
        public void iWantGetInformationAboutCurrentMoneyOnCard(DataTable table) {
            List<cardInfo> cards = new ArrayList<cardInfo>();
            cards = table.asList(cardInfo.class);


            for (CreditCardGlue.cardInfo info : cards) {
                System.out.println("Left " + info.balance + " money on my balance");
            }
        }

        @When("^I want withdraw ([^\"]*) money from my ([^\"]*)$")
        public void iWantWithdrawMoneyFromMyBalance(DataTable table) {

            List<cardInfo> cards = new ArrayList<cardInfo>();
            cards = table.asList(cardInfo.class);

            for (CreditCardGlue.cardInfo info : cards) {
                System.out.println(" There are " + info.withdraw + " will be withdraw");

            }
        }

        @Then("^I want to get message about ([^\"]*)$")
        public void iWantToGetMessageAboutOperation(DataTable table) {

            List<cardInfo> cards = new ArrayList<cardInfo>();
            cards = table.asList(cardInfo.class);

            for (cardInfo info : cards) {
                System.out.println("Operation done " + info.operation);
            }
        }
    }
}