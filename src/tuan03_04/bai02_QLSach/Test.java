package tuan03_04.bai02_QLSach;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListSach list = new ListSach();
        int lc;
        do{
            System.out.println("1. Them sach\n" +
                                "2. Xuat danh sach\n" +
                                "3. Tong thanh tien\n" +
                                "4. Trung binh cong don gia cua sach tham khao\n" +
                                "5. Tim sach giao khoa theo ten nha xuat ban");
            System.out.println("Chon chuc nang:");
            lc = sc.nextInt();
            switch (lc){
                case 1:
                    list.nhap();
                    break;
                case 2:
                    list.xuat();
                    break;
                case 3:
                    list.tongThanhTien();
                    break;
                case 4:
                    list.trungBinh();
                    break;
                case 5:
                    list.timNXB();
                    break;
                default:
                    return;
            }
        }while(true);

    }
}
