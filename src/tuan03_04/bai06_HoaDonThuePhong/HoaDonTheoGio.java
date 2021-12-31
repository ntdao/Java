package tuan03_04.bai06_HoaDonThuePhong;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon{
    private double soGio;

    public HoaDonTheoGio() {
    }

    public HoaDonTheoGio(String maHD, String tenKH, String maPhong, Date ngayHD, double donGia, double soGio) {
        super(maHD, tenKH, maPhong, ngayHD, donGia);
        this.soGio = soGio;
    }

    public double getSoGio() {
        return soGio;
    }

    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("So gio thue: ");
        setSoGio(sc.nextDouble());
    }

    @Override
    public void hien() {
        System.out.printf("%-10s %-20s %-20s %-20s %-15.2f %-15.2f %-15.2f\n",
                getMaHD(), getNgayHD(), getTenKH(), getMaPhong(), getDonGia(), getSoGio(), thanhTien());
    }

//    Thành tiền = số giờ thuê * đơn giá.
//    Nếu trường hợp số giờ> 24 tiếng và < 30 tiếng thì cũng chỉ tính 24 giờ.
//    Nếu trường hợp số giờ là > 30 tiếng thì không dùng loại hóa đơn theo giờ.
    @Override
    public double thanhTien() {
        if(soGio <= 24){
            return soGio*getDonGia();
        }else if(soGio < 30){
            return  24 * getDonGia();
        }else{
            System.out.println("Khong dung hoa don theo ngay");
            HoaDon hoaDon = new HoaDonTheoNgay();
            hoaDon.thanhTien();
            return 0;
        }
    }

    @Override
    public String toString() {
        return "HoaDonTheoGio{" + super.toString() +
                ", soGio=" + soGio +
                ", thanhTien" + thanhTien() +
                '}';
    }
}
