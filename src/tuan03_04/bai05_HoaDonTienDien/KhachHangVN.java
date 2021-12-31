package tuan03_04.bai05_HoaDonTienDien;

import java.util.Date;
import java.util.Scanner;

public class KhachHangVN extends KhachHang{
    private int doiTuong, dinhMuc;

    public KhachHangVN() {
    }

    public KhachHangVN(String maKH, String hoTen, Date ngayHD, double soLuong, double donGia, int doiTuong, int dinhMuc) {
        super(maKH, hoTen, ngayHD, soLuong, donGia);
        this.doiTuong = doiTuong;
        this.dinhMuc = dinhMuc;
    }

    public String getDoiTuong() {
        String s;
        if(doiTuong == 1){
            s = "sinh hoat";
        }else if(doiTuong == 2){
            s = "kinhh doanh";
        }else{
            s = "san xuat";
        }
        return s;
    }

    public void setDoiTuong(int doiTuong) {
        this.doiTuong = doiTuong;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Doi tuong (1. sinh hoat, 2. kinh doanh, 3. san xuat): ");
        setDoiTuong(sc.nextInt());
        System.out.print("Dinh muc: ");
        setDinhMuc(sc.nextInt());
    }

    @Override
    public void hien() {
        System.out.printf("%-10s %-20s %-20s %-20s %-10.2f %-10.2f %-10d %-15.2f\n",
                getMaKH(), getHoTen(), getNgayHD(), getDoiTuong(), getSoLuong(), getDonGia(), getDinhMuc(), thanhTien());
    }

    @Override
//    Thành tiền được tính như sau:
//            - Nếu số lượng <= định mức thì: thành tiền = số lượng * đơn giá.
//            - Ngược lại thì: thành tiền = đơn giá * định mức + số lượng KW vượt định mức * Đơn giá * 2.5.
    public double thanhTien() {
        if(getSoLuong() <= getDinhMuc()){
            return getSoLuong()*getDonGia();
        }else{
            return getDinhMuc()*getDonGia() + (getSoLuong()-getDinhMuc()) * getDonGia() * 2.5;
        }
    }

    @Override
    public String toString() {
        return "KhachHangVN{" + super.toString() +
                "doiTuong=" + getDoiTuong()+
                ", dinhMuc=" + dinhMuc +
                ", thanhTien=" + thanhTien() +
                '}';
    }
}
