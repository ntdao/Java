package tuan03_04.bai13_QLTK;

public class Savings extends Account{
    private double intRate, intAmount;

    private double caculateInterest(){
        return intRate*intAmount;
    }

    public void addInterestToBalance(){
        deposit(caculateInterest());
    }

    public double getInterestAmount(){
        return intAmount + caculateInterest();
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }
}
