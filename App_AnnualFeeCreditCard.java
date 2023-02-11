package q04;

public class App_AnnualFeeCreditCard {

    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Assignment 01, Question 04: App_AnnualFeeCreditCard");
        System.out.println("Your name: Scott Sheble ");
        System.out.println("Your student id: sashebl");
        System.out.println("============================");

        CreditCard[] wallet = new CreditCard[4];

        //Testing data, the output is available in the question sheet
        //wallet[0] = new AnnualFeeCreditCard("John Martin", "California Savings", "5391 0375 9387 5309", 500, 0.2);
        //wallet[1] = new AnnualFeeCreditCard("Robert Bowman", "Busey Bank", "3485 0399 3395 1954", 350, 0.2);
        //wallet[2] = new AnnualFeeCreditCard("James Thomas", "Bank of America", "5391 0375 1387 5306", 600, 400.5, 0.2);
        //wallet[3] = new AnnualFeeCreditCard("Charles Williams", "TD Bank", "5391 5385 9387 5509", 400, 300.7, 0.2);

        //Data used for the assignment
        //Uncomment the following four lines code, and comment out the above code for array wallet initialization
		wallet[0] = new AnnualFeeCreditCard("John Martin", "California Savings", "5391 0375 9387 5309", 200, 0.2);
		wallet[1] = new AnnualFeeCreditCard("Robert Bowman", "Busey Bank", "3485 0399 3395 1954", 460, 0.2);
		wallet[2] = new AnnualFeeCreditCard("James Thomas", "Bank of America", "5391 0375 1387 5306", 400, 300.7, 0.2);
		wallet[3] = new AnnualFeeCreditCard("Charles Williams", "TD Bank", "5391 5385 9387 5509", 1600, 500.5, 0.2);

        for (int val = 1; val <= 20; val++) {
            wallet[0].charge(4.7 * val);
            wallet[1].charge(3.5 * val);
            wallet[2].charge(2.8 * val);
            wallet[3].charge(1.1 * val);
        }

        for (CreditCard card : wallet) {
            CreditCard.printSummary(card); // calling static method
            if (card.getBalance() > 0) {
            	AnnualFeeCreditCard annualCard = (AnnualFeeCreditCard)card;
            	annualCard.processMonth();
            	CreditCard.printSummary(annualCard);	
            	while (card.getBalance() > 200.0) {
            		card.makePayment(200);
            		System.out.printf("New balance = %.2f\n", card.getBalance());
            	}
            }
            System.out.println("\n");
        }
    }
}


