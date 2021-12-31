package tuan03_04.bai04_GDNhaDat;

import java.util.Scanner;

public class Test {

    public static int menu(){
        System.out.println("1. Nhap giao dich\n" +
                            "2. Xuat danh sach giao dich\n"+
                            "3. Tong so luong giao dich\n" +
                            "4. Trung binh thanh tien giao dich dat\n" +
                            "5. Cac giao dich thang 9 nam 2013");
        System.out.print("Nhap lua chon: ");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public static void main(String[] args) {
        ListGD list = new ListGD();
        while(true){
            int lc = menu();
            switch (lc){
                case 1:
                    list.nhapThongTinGD();
                    break;
                case 2:
                    list.hienThongTinGD();
                    break;
                case 3:
                    list.tongSoLuongGD();
                    break;
                case 4:
                    list.trungBinhGDDat();
                    break;
                case 5:
                    list.giaoDich9_2013();
                    break;
                default:
                    return;
            }
        }
    }
}
