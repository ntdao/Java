package tuan03_04.bai05_HoaDonTienDien;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class KhachHang implements IKhachHang{
    private String maKH, hoTen;
    private Date ngayHD;
    private double soLuong, donGia;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, Date ngayHD, double soLuong, double donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayHD = ngayHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma khach hang: ");
        setMaKH(sc.nextLine());
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Ngay ra hoa don: ");
        setNgayHD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("So luong: ");
        setSoLuong(sc.nextDouble());
        System.out.print("Don gia: ");
        setDonGia(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH='" + maKH + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayHD=" + ngayHD +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
