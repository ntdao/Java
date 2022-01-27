package tuan03_04.bai10_QL;

import java.util.Scanner;

public class Menu {
    private int menu() {
        System.out.println("1. Them\n" +
                "2. Xuat danh sach\n" +
                "3. Thay doi");
        System.out.print("Lua chon: ");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public void run(){
        QuanLy ql = new QuanLy(100);
        while (true) {
            int lc = menu();
            switch (lc) {
                case 1:
                    ql.them();
                    break;
                case 2:
                    ql.hien();
                    break;
                case 3:
                    ql.thayDoi();
                    break;
                default:
                    return;
            }
        }
    }
}
