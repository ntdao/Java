package tuan03_04.bai09_QLXe;

import java.util.Scanner;

public class XeDap extends Xe{

    public XeDap() {
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
    }

    @Override
    public String toString() {
        return "Xe Dap: " + super.toString() + ", Thue: " + getThue();
    }

    @Override
    public void hien() {
        System.out.printf("%30s %20.2f %20.2f", getName(), getTriGia(), getThue());
    }

    @Override
    public double getThue() {
        return 0;
    }
}
