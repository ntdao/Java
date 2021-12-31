package tuan03_04.bai07_QLHocVien;

import java.util.Scanner;

public class Menu {
    private int menu(){
        System.out.println("\n1. Them 1 nguoi vao danh sach\n" +
                "2. Xuat danh sach\n"+
                "3. Sap xep danh sach theo thu tu ho ten\n" +
                "4. Xoa 1 nguoi khoi danh sach\n");
        System.out.print("Chon chuc nang: ");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public void run(){
        QuanLy quanLy = new QuanLy(100);
        while(true){
            int lc = menu();
            switch (lc){
                case 1:
                    quanLy.them();
                    break;
                case 2:
                    quanLy.hien();
                    break;
                case 3:
                    quanLy.sapXep();
                    break;
                case 4:
                    quanLy.xoa();
                    break;
                default:
                    return;
            }
        }
    }
}
