package tuan02.bai03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle();
        Vehicle xe2 = new Vehicle();
        Vehicle xe3 = new Vehicle();
        System.out.println("1. Nhap thong tin");
        System.out.println("2. Xuat thong tin");
        System.out.println("3. Thoat");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap lua chon:");
            int lc = sc.nextInt();
            switch (lc) {
                case 1:
                    xe1.nhap();
                    xe2.nhap();
                    xe3.nhap();
                    break;
                case 2:
                    System.out.printf("%-30s %-20s %12s %20s %20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
                    System.out.println("==============================================================================================================");
                    xe1.xuat();
                    xe2.xuat();
                    xe3.xuat();
                    break;
                case 3:
                    return ;
            }
            System.out.println();
        }while(true);
    }
}