package q04;

public class AnnualFeeCreditCard extends CreditCard {
    private double apr;

    public AnnualFeeCreditCard (String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal);
        this.apr = rate;
    }

    public AnnualFeeCreditCard (String cust, String bk, String acnt, int lim, double rate) {
        super(cust, bk, acnt, lim);
        this.apr = rate;
    }

    @Override
    public boolean charge (double price) {
        if (!super.charge(price)) {
            balance += 10;
            return false;
        }
        return true;
    }

    public void processMonth() {
        double monthlyFactor = Math.pow(1 + apr, 1.0 / 12);
        balance *= monthlyFactor;
    }

}
