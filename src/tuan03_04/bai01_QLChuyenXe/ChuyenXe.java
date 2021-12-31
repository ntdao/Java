package tuan03_04.bai01_QLChuyenXe;

import java.util.Scanner;

public class ChuyenXe {
    private String maChuyenXe, tenTaiXe, soXe;
    private double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu) {
        this.maChuyenXe = maChuyenXe;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaChuyenXe() {
        return maChuyenXe;
    }

    public void setMaChuyenXe(String maChuyenXe) {
        this.maChuyenXe = maChuyenXe;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ma chuyen xe: ");
        this.maChuyenXe = in.nextLine();
        System.out.print("Ho Ten Tai Xe: ");
        this.tenTaiXe = in.nextLine();
        System.out.print("So Xe: ");
        this.soXe=in.nextLine();
        System.out.print("Doanh Thu: ");
        this.doanhThu =in.nextDouble();
    }

    @Override
    public String toString() {
        return "Ma chuyen xe: " + maChuyenXe +
                ", ten tai xe: " + tenTaiXe  +
                ", so xe: " + soXe;
    }
}