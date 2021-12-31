package tuan03_04.bai05_HoaDonTienDien;

import java.util.Scanner;

public class Menu {
    public int menu(){
        System.out.println("1. Nhap khach hang\n" +
                "2. Xuat danh sach khach hang\n"+
                "3. Tong so luong khach hang\n" +
                "4. Trung binh thanh tien khach hang nuoc ngoai\n" +
                "5. Cac hoa don thang 9 nam 2013");
        System.out.print("Nhap lua chon: ");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public void run(){
        ListKH list = new ListKH();
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
                    list.trungBinhKHNN();
                    break;
                case 5:
                    list.hoaDon9_2013();
                    break;
                default:
                    return;
            }
        }
    }
}
