package tuan03_04.bai06_HoaDonThuePhong;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class HoaDon implements IHoaDon{
    private String maHD, tenKH, maPhong;
    private Date ngayHD;
    private double donGia;

    public HoaDon() {
    }

    public HoaDon(String maHD, String tenKH, String maPhong, Date ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getNgayHD() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str = simpleDateFormat.format(ngayHD);
        return str;
    }

    public void setNgayHD(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayHD = calendar.getTime();
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma hoa don: ");
        setMaHD(sc.nextLine());
        System.out.print("Ngay ra hoa don: ");
        setNgayHD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Ten khach hang: ");
        sc.nextLine();
        setTenKH(sc.nextLine());
        System.out.print("Ma phong: ");
        setMaPhong(sc.nextLine());
        System.out.print("Don gia: ");
        setDonGia(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD='" + maHD + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", maPhong='" + maPhong + '\'' +
                ", ngayHD=" + ngayHD +
                ", donGia=" + donGia +
                '}';
    }
}
