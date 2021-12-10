package tuan02.bai06_HangThucPham;

import java.util.Date;
import java.util.Scanner;

public class Test {
    static HangThucPham nhapHang(){
        HangThucPham hangThucPham = null;
        String maHang, tenHang;
        Date ngaySX, ngayHH;
        double donGia;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap ngay san xuat: ");

        System.out.print("Nhap ngay het han: ");


        hangThucPham = new HangThucPham(maHang,tenHang,donGia, ngaySX,ngayHH);
        return hangThucPham;
    }

    public static void main(String[] args) {
        HangThucPham h = new HangThucPham("123","com",12340,"2021-2-12", "2021-3-12");
        System.out.println(h);
    }
}
