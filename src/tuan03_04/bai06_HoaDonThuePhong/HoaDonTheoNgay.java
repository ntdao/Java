package tuan03_04.bai06_HoaDonThuePhong;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon{
    private double soNgay;

    public HoaDonTheoNgay() {
    }

    public HoaDonTheoNgay(String maHD, String tenKH, String maPhong, Date ngayHD, double donGia, double soNgay) {
        super(maHD, tenKH, maPhong, ngayHD, donGia);
        this.soNgay = soNgay;
    }

    public double getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(double soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so ngay thue: ");
        setSoNgay(sc.nextDouble());
    }

    @Override
    public void hien() {
        System.out.printf("%-10s %-20s %-20s %-20s %-15.2f %-15.2f %-15.2f\n",
                getMaHD(), getNgayHD(), getTenKH(), getMaPhong(), getDonGia(), getSoNgay(), thanhTien());
    }

// Thành tiền = số ngày thuê * đơn giá.
// Nếu số ngày >7 thì giảm 20% đơn giá cho những ngày còn lại
    @Override
    public double thanhTien() {
        if(soNgay <= 7){
            return soNgay*getDonGia();
        }else{
            return 7*getDonGia() + (soNgay-7)*getDonGia()*0.8;
        }
    }

    @Override
    public String toString() {
        return "HoaDonTheoNgay{" + super.toString() +
                ", soNgay=" + soNgay +
                ", thanhTien" + thanhTien() +
                '}';
    }
}
