package tuan02.quanli;

import java.util.Scanner;

public class Test {
    public static int menu(){
        System.out.println("University Staff Management 1.0");
        System.out.println("1. Thêm nhân viên\n"
                + "2. Tìm nhân viên theo tên\n"
                + "3. Tìm nhân viên theo phòng ban/khoa\n"
                + "4. Hiển thị tất cả nhân viên\n"
                + "5. Thoát");
        System.out.print("Chọn chức năng (1,2,3,4 hoặc 5):");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        do {
            int lc = menu();
            switch (lc){
                case 1:
                    ql.nhapCB();
                    break;
                case 2:
                    ql.searchByName();
                    break;
                case 3:
                    ql.search();
                    break;
                case 4:
                    ql.hienThiCB();
                    break;
                case 5:
                    return;
            }
        }while(true);
    }
}
