package tuan03_04.bai07_QLHocVien;

import java.util.Scanner;

public class Customer extends Person{
    private String tenCty;
    private double triGiaHD;

    public Customer() {
    }

    public Customer(String hoTen, String diaChi, String tenCty, double triGiaHD) {
        super(hoTen, diaChi);
        this.tenCty = tenCty;
        this.triGiaHD = triGiaHD;
    }

    public String getTenCty() {
        return tenCty;
    }

    public void setTenCty(String tenCty) {
        this.tenCty = tenCty;
    }

    public double getTriGiaHD() {
        return triGiaHD;
    }

    public void setTriGiaHD(double triGiaHD) {
        this.triGiaHD = triGiaHD;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Ten cong ty: ");
        setTenCty(sc.nextLine());
        System.out.print("Tri gia hoa don: ");
        setTriGiaHD(sc.nextDouble());
    }

    @Override
    public void hien() {
        System.out.printf("%-20s %-20s %-20s %-20.2f %-20s\n",
                getHoTen(), getDiaChi(), getTenCty(), getTriGiaHD(), danhGia());
    }

    @Override
    public String danhGia() {
        String s;
        if(triGiaHD > 30000000){
            s = "Kim cuong";
        }else if(triGiaHD > 20000000){
            s = "Vang";
        }else if(triGiaHD > 10000000){
            s = "Bac";
        }else{
            s = "Dong";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "tenCty='" + tenCty + '\'' +
                ", triGiaHD=" + triGiaHD +
                '}';
    }
}
