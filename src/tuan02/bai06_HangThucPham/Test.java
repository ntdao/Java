package tuan02.bai06_HangThucPham;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HangThucPham tp = new HangThucPham();
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhập mã hàng : ");
        tp.setMaHang(scanner.nextLine());
//        scanner.nextLine();
        do {
            System.out.println("Nhập tên hàng : ");
            tp.setTenHang(scanner.nextLine());
        } while (tp.kiemTraTenHang(kt));
        System.out.println("Nhập đơn giá : ");
        tp.setDonGia(scanner.nextDouble());
        do {
            System.out.println("Nhập năm,tháng,ngày sản xuất : ");
            tp.setNSX(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            System.out.println("nhập năm,tháng,ngày hết hạn : ");
            tp.setHSD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        } while (tp.kiemTraNgay(th));
        System.out.println(tp);
        tp.kiemTraHSD();
    }
}
