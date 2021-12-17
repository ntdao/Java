package tuan02.bai08_CD;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCD ql = new QuanLyCD(10);
        int lc;
        do {
            System.out.println("1. Thêm CD\n" +
                    "2. Số lượng CD\n" +
                    "3. Tổng giá thành của các CD\n" +
                    "4. Sắp xếp danh sách giảm dần theo giá thành\n" +
                    "5. Sắp xếp danh sách tăng dần theo tựa CD\n" +
                    "6. Hiển thị danh sách CD");
            System.out.println("Nhập lựa chọn:");
            lc = sc.nextInt();
            switch (lc) {
                case 1:
                    ql.themCD();
                    break;
                case 2:
                    System.out.println("So luong CD la:" + ql.soLuong());
                    break;
                case 3:
                    System.out.println("Tong gia thanh cac CD la:" + ql.tongGiaThanh());
                    break;
                case 4:
                    ql.sapXepTheoGia();
                    ql.xuatCD();
                    break;
                case 5:
                    ql.sapXepTheoTen();
                    ql.xuatCD();
                    break;
                case 6:
                    ql.xuatCD();
                    break;
                default:
                    return;

            }
        }while(true);

    }
}
