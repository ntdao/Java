package tuan03_04.bai13_QLTK;

public class OverdraftAccount extends Account{
    private double odLimit, overdraft, availableBalance;

    public double getOdLimit() {
        return odLimit;
    }

    public void setOdLimit(double odLimit) {
        this.odLimit = odLimit;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
}
