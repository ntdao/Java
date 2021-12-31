package tuan03_04.bai03_QLGiaoDich;

import java.util.Scanner;

public class GiaoDich {
    private int maGD, soLuong;
    private String ngayGD;
    private double donGia;
    
    public GiaoDich() {
    }

    public GiaoDich(int maGD, String ngayGD, double donGia, int soLuong) {
        this.maGD = maGD;
        this.soLuong = soLuong;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public GiaoDich nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ma giao dich: ");
        maGD = in.nextInt();
        System.out.print("Ngay giao dich: ");
        ngayGD = in.next();
        System.out.print("Don gia: ");
        donGia = in.nextDouble();
        System.out.print("So luong: ");
        soLuong = in.nextInt();
        return new GiaoDich(maGD,ngayGD,donGia,soLuong);
    }
    public String toString() {
        return "Ma GD: " + maGD  + ", Ngay giao dich: " + ngayGD +
                ", Don gia: " + donGia+ ", So luong: " + soLuong;
    }
}