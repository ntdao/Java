package tuan02.bai04_Account;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        QuanLyTK quanLyTK = new QuanLyTK();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Nhap thong tin khach hang\n"
                                + "2.Xuat thong tin khach hang\n"
                                + "3.Nap tien\n"
                                + "4.Rut tien\n"
                                + "5.Dao han\n"
                                + "6.Chuyen khoan");
            System.out.println("Chon chuc nang:");
            int lc = sc.nextInt();
            switch (lc) {
                case 1:
                    quanLyTK.nhap();
                    break;
                case 2:
                    quanLyTK.xuat();
                    break;
                case 3:
                    quanLyTK.nap();
                    break;
                case 4:
                    quanLyTK.rut();
                    break;
                case 5:
                    quanLyTK.daoHanTK();
                    break;
                case 6:
                    quanLyTK.chuyen();
                    break;
                default:
                   return;
            }
        } while (true);
    }
}