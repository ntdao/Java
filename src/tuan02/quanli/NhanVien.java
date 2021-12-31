package tuan02.quanli;

import java.util.Scanner;

public abstract class NhanVien implements INhanVien {
    private String hoTen;
    private double heSoLuong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, double heSoLuong) {
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên:");
        hoTen = sc.nextLine();
        System.out.print("Hệ số lương:");
        heSoLuong = sc.nextDouble();
    }

    @Override
    public void hien(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return hoTen + ", " + heSoLuong;
    }

}
