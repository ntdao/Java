package tuan03_04.bai07_QLHocVien;

import java.util.Scanner;

public class Employee extends Person{
    private double heSoLuong;
    private int soNgay;
    private static final int LUONG = 50;

    public Employee() {
    }

    public Employee(String hoTen, String diaChi, double heSoLuong, int soNgay) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
        this.soNgay = soNgay;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public double tinhLuong(){
        return LUONG*heSoLuong*soNgay;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("He so luong: ");
        setHeSoLuong(sc.nextDouble());
        System.out.print("So ngay lam viec: ");
        setSoNgay(sc.nextInt());
    }

    @Override
    public void hien() {
        System.out.printf("%-20s %-20s %-15.2f %-20d %-20.2f %-20s\n",
                getHoTen(), getDiaChi(), getHeSoLuong(), getSoNgay(), tinhLuong(), danhGia());
    }

    @Override
    public String danhGia() {
        String s;
        if(soNgay >= 28){
            s = "Xuat sac";
        }else if(soNgay >= 21){
            s = "Kha";
        }else if(soNgay >= 14){
            s = "Trung binh";
        }else{
            s = "Yeu";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", heSoLuong=" + heSoLuong +
                ", soNgay=" + soNgay +
                ", tinhLuong=" + tinhLuong() +
                ", danhGia=" + danhGia() +
                '}';
    }
}
