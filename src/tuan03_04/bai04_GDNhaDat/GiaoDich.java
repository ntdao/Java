package tuan03_04.bai04_GDNhaDat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich implements IGiaoDich{
    private String maGD;
    private Date ngayGD;
    private double donGia, dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, Date ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str = simpleDateFormat.format(ngayGD);
        return str;
    }

    public void setNgayGD(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayGD = calendar.getTime();
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giao dich: ");
        maGD = sc.nextLine();
        System.out.print("Nhap ngay, thang, nam giao dich: ");
        setNgayGD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Dien tich: ");
        dienTich = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "Ma GD: " + maGD +
                ", Ngay GD: " + getNgayGD() +
                ", Don gia: " + donGia +
                ", Dien tich:" + dienTich;
    }
}
