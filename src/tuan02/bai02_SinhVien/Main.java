package tuan02.bai02_SinhVien;

import java.util.Scanner;

public class Main {

    public static void nhap(SinhVien sv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mssv:");
        sv.setId(sc.nextInt());
        System.out.println("Nhap ho ten:");
        sc.nextLine();
        sv.setName(sc.nextLine());
        System.out.println("Nhap diem ly thuyet:");
        sv.setDiemLT(sc.nextFloat());
        System.out.println("Nhap diem thuc hanh:");
        sv.setDiemTH(sc.nextFloat());
    }

    public static void main(String[] args) {
        SinhVien sv1, sv2, sv3;
        sv1 = new SinhVien(20192745, "Nguyen Thi Dao", 6.0f, 7.5f);
        sv2 = new SinhVien(20190000, "Nguyen AB", 8.5f, 6.0f);
        sv3 = new SinhVien();
        nhap(sv3);

        System.out.printf("%-12s %-30s %-8s %-8s %-8s\n", "MSSV", "Ho ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("=======================================================================");
        sv1.hthi();
        sv2.hthi();
        sv3.hthi();
    }
}
