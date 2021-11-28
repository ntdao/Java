package tuan02.bai02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1, sv2, sv3;
        sv1 = new SinhVien(20192745, "Nguyen Thi Dao", 6.0f, 7.5f);
        sv2 = new SinhVien(20190000, "Nguyen AB", 8.5f, 6.0f);
        sv3 = new SinhVien();
        sv3.nhap();

        System.out.printf("%-12s %-30s %-8s %-8s %-8s\n", "MSSV", "Ho ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("=======================================================================");
        sv1.hthi();
        sv2.hthi();
        sv3.hthi();
    }
}
