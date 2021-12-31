package tuan03_04.bai02_QLSach;

import java.util.Scanner;

public class SachThamKhao extends Sach{
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double thanhTien(){
        return getSoLuong()*getDonGia() + thue;
    }

    public SachThamKhao nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Thuế: ");
        thue = sc.nextDouble();
        return new SachThamKhao(getMaSach(),getNgayNhap(),getDonGia(),getSoLuong(),getNhaXuatBan(),thue);
    }

    public void xuat(){
        System.out.printf("%-15s %-15s %-15.3f %-15d %-20s %-20.2f %-15.3f\n",
                getMaSach(), getNgayNhap(), getDonGia(),getSoLuong(), getNhaXuatBan(), getThue(), thanhTien());
    }

    @Override
    public String toString() {
        return "Sách tham khảo: " + super.toString() +
                ", thu: " + thue + ", thành tiền: " + thanhTien();
    }
}