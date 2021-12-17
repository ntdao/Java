package tuan02.quanli;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLyCanBo ql = new QuanLyCanBo();
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            System.out.println("University Staff Management 1.0");
            System.out.println("1. Thêm nhân viên\n"
                                + "2. Tìm nhân viên theo tên\n"
                                + "3. Tìm nhân viên theo phòng ban/khoa\n"
                                + "4. Hiển thị tất cả nhân viên\n"
                                + "5. Thoát");
            System.out.print("Chọn chức năng (1,2,3,4 hoặc 5):");
            lc = sc.nextInt();
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
