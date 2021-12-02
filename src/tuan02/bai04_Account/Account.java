package tuan02.bai04_Account;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Account {
    private long soTK;
    private String tenTK;
    private double tienTrongTK;
    public static final float LAISUAT = 0.035f;
    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(long soTK, String tenTK){
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTrongTK = 50;
    }

    public Account(long soTK, String tenTK, double tienTrongTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTrongTK = tienTrongTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getTienTrongTK() {
        return tienTrongTK;
    }

    public void setTienTrongTK(double tienTrongTK) {
        this.tienTrongTK = tienTrongTK;
    }

    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(tienTrongTK);
        return "Account{" +
                "so tai khoan: " + soTK +
                ", ten tai khoan"  + tenTK + '\'' +
                ", so tien trong tai khoan =" + str1 + '}';
    }

    public void napTien(){
        double t;
        do{
            System.out.println("Nhap so tien can nap them:");
            t = sc.nextDouble();
        }while(t < 0);
        this.tienTrongTK += t;
        System.out.println("Nap tien thanh cong!");
    }

    public double rutTien(){
        double phi = 1100d;
        double t;
        System.out.println("Nhap so tien ban muon rut:");
        t = sc.nextDouble();
        if(t <= (tienTrongTK - phi)) {
            this.tienTrongTK -= t + 1100;
            System.out.println("Rut tien thanh cong!");
        }
        else {
            System.out.println("Tai khoan cua ban khong co du so du!");
            return rutTien();
        }
        return t;
    }

    public void daoHan() {
        tienTrongTK = tienTrongTK + tienTrongTK * LAISUAT;
        System.out.println("Dao han 1 thang thanh cong!");
    }

    void inTK() {
        // dinh dang tien VN
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat cur = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = cur.format(tienTrongTK);
        System.out.printf("%-10d %-20s %-20s \n", soTK, tenTK, str1);
    }
}