package tuan05_06.bai02_QLPhongHoc;

import java.util.Scanner;

public class Menu {
    public int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Thêm 1 phòng học\n" +
                "2. Tìm kiếm phòng học\n" +
                "3. In danh sách phòng học\n" +
                "4. In danh sách phòng học đạt chuẩn\n" +
                "5. Sắp xếp tăng dần theo dãy nhà\n" +
                "6. Sắp xếp giảm dần theo diện tích\n" +
                "7. Sắp xếp tăng dần theo số bóng đèn\n" +
                "8. Cập nhật số máy tính\n" +
                "9. Xóa phòng học\n" +
                "10. Tổng số phòng học\n" +
                "11. In danh sách các phòng máy có 60 máy");
        System.out.print("Lựa chọn: ");
        int lc = sc.nextInt();
        return lc;
    }

    public void run(){
        QLPhongHoc ql = new QLPhongHoc();
        while (true) {
            int lc = menu();
            switch (lc) {
                case 1:
                    ql.them();
                    break;
                case 2:
                    System.out.println(ql.timKiem());
                    break;
                case 3:
                    ql.hien();
                    break;
                case 4:
                    ql.hienPhongDatChuan();
                    break;
                case 5:
                    ql.sapXepTheoDayNha();
                    break;
                case 6:
                    ql.sapXepTheoDienTich();
                    break;
                case 7:
                    ql.sapXepTheoSoBongDen();
                    break;
                case 8:
                    ql.capNhatSoMayTinh();
                    break;
                case 9:
                    ql.xoa();
                    break;
                case 10:
                    System.out.println(ql.tongSoPhongHoc());
                    break;
                case 11:
                    ql.phongHoc60May();
                    break;
                default:
                    return;
            }
        }

    }
}
