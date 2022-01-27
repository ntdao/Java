package tuan03_04.bai08_QLHangHoa;

import java.util.Scanner;

public class Menu {
    private int menu(){
        System.out.println("\n1. Thêm 1 hàng hóa vào danh sách\n" +
                "2. Xuất danh sách\n");
        System.out.print("Chọn chức năng: ");
        int lc = new Scanner(System.in).nextInt();
        return lc;
    }

    public void run() {
        QuanLyHangHoa ql = new QuanLyHangHoa(100);
        while (true) {
            int lc = menu();
            switch (lc) {
                case 1:
                    ql.them();
                    break;
                case 2:
                    ql.hien();
                    break;
                default:
                    return;
            }
        }
    }
}
