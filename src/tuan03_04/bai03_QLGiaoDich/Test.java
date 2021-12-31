package tuan03_04.bai03_QLGiaoDich;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lc;
        ListGiaoDich list = new ListGiaoDich();
        QLGD_Array ql = new QLGD_Array(100);

        do {
            System.out.println("1. Them giao dich vang\n" +
                    "2. Them giao dich tien te\n" +
                    "3. Xuat danh sach giao dich\n" +
                    "4. Tong so luong giao dich\n" +
                    "5. Trung binh thanh tien cua giao dich tien te\n" +
                    "6. Danh sach giao dich co don gia > 1 ty");
            System.out.println("Nhap lua chon:");
            lc = sc.nextInt();

            switch (lc){
                case 1:
                    list.nhapGDV();
//                    ql.nhap(1);
                    break;
                case 2:
                    list.nhapGDTT();
//                    ql.nhap(2);
                    break;
                case 3:
                    list.xuat();
//                    ql.hienThi();
                    break;
                case 4:
                    list.tongSLGD();
//                    ql.tongSL();
                    break;
                case 5:
                    list.trungBinhGDTT();
//                    ql.trungBinh();
                    break;
                case 6:
                    list.gdTren1Ty();
//                    ql.giaoDich1ty();
                    break;
                default:
                    return;
            }
        }while(true);
    }
}
