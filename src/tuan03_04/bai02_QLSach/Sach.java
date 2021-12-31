package tuan03_04.bai02_QLSach;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach() {
    }

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();
        System.out.print("Ngày nhập: ");
        ngayNhap = sc.nextLine();
        System.out.print("Đơn giá: ");
        donGia = sc.nextDouble();
        System.out.print("Số lượng: ");
        soLuong = sc.nextInt();
        System.out.print("Nhà xuất bản: ");
        sc.nextLine();
        nhaXuatBan = sc.nextLine();
        return new Sach(maSach,ngayNhap,donGia,soLuong,nhaXuatBan);
    }

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
                ", ngày nhập: " + ngayNhap +
                ", đơn giá: " + donGia +
                ", số lượng: " + soLuong +
                ", nhà xuất bản: " + nhaXuatBan;
    }
}
