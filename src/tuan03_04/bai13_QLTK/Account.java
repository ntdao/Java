package tuan03_04.bai13_QLTK;

import java.util.Scanner;

public class Account {
    private double balance;
    private String acct_id;

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    // rut tien
    public boolean withdraw(double amount){
        int phi = 100;
        if(amount > (balance + phi)){
            return false;
        }else{
            balance -= amount + phi;
            return true;
        }
    }

    // gui tien
    public void deposit(){
        System.out.println("Nhap so tien can gui:");
        double amount = new Scanner(System.in).nextDouble();
        balance += amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
