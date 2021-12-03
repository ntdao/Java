package tuan02.bai03_Vehicle;

import java.util.Scanner;

public class Test {
    public static void nhap(Vehicle xe){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten chu xe:");
        xe.setName(sc.nextLine());
        System.out.println("Nhap loai xe:");
        xe.setLoaiXe(sc.nextLine());
        System.out.println("Nhap dung tich:");
        xe.setDungTich(sc.nextInt());
        System.out.println("Nhap gia tri xe:");
        xe.setTriGia(sc.nextFloat());
    }
    public static void main(String[] args) {
        Vehicle[] xe = null;//mang chua xe
        int n = 0;
        do {
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Xuat thong tin");
            System.out.println("3. Thoat");
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhap lua chon:");
            int lc = sc.nextInt();
            switch (lc) {
                case 1:
                    System.out.print("Nhap so luong xe: ");
                    n = sc.nextInt();
                    xe = new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thu " + (i+1));
                        xe[i] = new Vehicle();
                        nhap(xe[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-30s %-20s %12s %20s %20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
                    System.out.println("==============================================================================================================");
                    for (int i = 0; i < n; i++) {
                        xe[i].xuat();
                    }
                    break;
                case 3:
                    return ;
            }
            System.out.println();
        }while(true);
    }
}