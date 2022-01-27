package tuan03_04.bai08_QLHangHoa;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class HangHoa implements IHangHoa{
    private String maHang, tenHang;
    private int soLuong;
    private double donGia;

    public HangHoa() {
    }

    public String getMaHang() {
        return maHang;
    }

    //khởi tạo phương thức kiểm tra tên hàng không được để trống
    public boolean kiemTraMaHang() {
        if (maHang.isEmpty()) {
            System.out.println("Mã hàng không được để trống!");
        } else {
            return false;
        }
        return true;
    }

    //khởi tạo phương thức kiểm tra tên hàng không được để trống
    public boolean kiemTraTenHang() {
        if (this.tenHang.isEmpty()) {
            System.out.println("Tên hàng không được để trống!");
        } else {
            return false;
        }
        return true;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        Scanner sc = new Scanner(System.in);
        if(soLuong >= 0) {
            this.soLuong = soLuong;
        }else{
            System.out.println("Số lượng phải >= 0");
            System.out.print("Số lượng tồn: ");
            setSoLuong(sc.nextInt());
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        Scanner sc = new Scanner(System.in);
        if(donGia > 0) {
            this.donGia = donGia;
        }else{
            System.out.println("Đơn giá phải > 0");
            System.out.print("Đơn giá: ");
            setDonGia(sc.nextDouble());
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Mã hàng: ");

//            sc.nextLine();
            maHang = sc.nextLine();
        } while (kiemTraMaHang());
        do {
            System.out.print("Tên hàng : ");
            setTenHang(sc.nextLine());
        } while (kiemTraTenHang());
        System.out.print("Số lượng tồn: ");
        setSoLuong(sc.nextInt());
        System.out.print("Đơn giá: ");
        setDonGia(sc.nextDouble());
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String str = numberFormat.format(getDonGia());

        return "Mã hàng: '" + maHang + '\'' +
                ", Tên hàng: '" + tenHang + '\'' +
                ", Số lượng tồn kho: " + soLuong +
                ", Đơn giá: " + str;
    }
}
