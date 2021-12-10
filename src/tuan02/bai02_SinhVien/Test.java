package tuan02.bai02_SinhVien;

import java.util.Scanner;

public class Test {

    public static SinhVien nhapSV(){
        SinhVien sv = null;
        String name;
        int id;
        float diemLT, diemTH;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mssv:");
        id = sc.nextInt();
        System.out.println("Nhap ho ten:");
        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Nhap diem ly thuyet:");
        diemLT = sc.nextFloat();
        System.out.println("Nhap diem thuc hanh:");
        diemTH = sc.nextFloat();

        sv = new SinhVien(id,name, diemLT,diemTH);
        return sv;
    }

    public static void main(String[] args) {
        SinhVien sv1, sv2, sv3;
        sv1 = new SinhVien(20192745, "Nguyen Thi Dao", 6.0f, 7.5f);
        sv2 = new SinhVien(20190000, "Nguyen AB", 8.5f, 6.0f);
        sv3 = nhapSV();

        System.out.printf("%-12s %-30s %-8s %-8s %-8s\n", "MSSV", "Ho ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("=======================================================================");
        sv1.hthi();
        sv2.hthi();
        sv3.hthi();
    }
}
