package tuan03_04.bai05_HoaDonTienDien;

import java.util.Date;
import java.util.Scanner;

public class KhachHangNN extends KhachHang{
    private String quocTich;

    public KhachHangNN() {
    }

    public KhachHangNN(String maKH, String hoTen, Date ngayHD, double soLuong, double donGia, String quocTich) {
        super(maKH, hoTen, ngayHD, soLuong, donGia);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Quoc tich: ");
        setQuocTich(sc.nextLine());
    }

    @Override
    public void hien() {
        System.out.printf("%-10s %-20s %-20s %-20s %-10.2f %-10.2f %-15.2f",
                getMaKH(), getHoTen(), getNgayHD(), getQuocTich(), getSoLuong(), getDonGia(), thanhTien());
    }

    @Override
    public double thanhTien() {
        return getSoLuong()*getDonGia();
    }
}
