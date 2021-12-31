package tuan03_04.bai06_HoaDonThuePhong;

import java.util.Scanner;

public class Menu {
    private int menu(){
        System.out.println("\n1. Nhap hoa don\n" +
                "2. Xuat danh sach hoa don\n"+
                "3. Tong so luong hoa don\n" +
                "4. Trung binh thanh tien cua hoa don thue phong trong thang 9/2013\n");
        System.out.print("Nhap lua chon: ");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public void run(){
        ListHD list = new ListHD();
        while(true){
            int lc = menu();
            switch (lc){
                case 1:
                    list.nhapThongTinHD();
                    break;
                case 2:
                    list.hienThongTinHD();
                    break;
                case 3:
                    list.tongSoLuongHD();
                    break;
                case 4:
                    list.hoaDon9_2013();
                    break;
                default:
                    return;
            }
        }
    }
}
