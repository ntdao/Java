package tuan03_04.bai01_CongTyDL;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int x;
        Scanner a = new Scanner(System.in);
        ListChuyenXe dscx = new ListChuyenXe();
        do
        {
            System.out.println("Cong ty du lich V - Quan ly chuyen xe");
            System.out.println("1. Them Chuyen Xe Noi Thanh");
            System.out.println("2. Them Chuyen Xe Ngoai Thanh");
            System.out.println("3. Hien thi danh muc Chuyen Xe");
            System.out.println("\nChon chuc nang:");
            x = a.nextInt();
            switch(x)
            {
                case 1:
                    dscx.nhapListCX(1);
                    break;
                case 2:
                    dscx.nhapListCX(2);
                    break;
                case 3:
                    dscx.xuatListCX();
                    break;
                default:
                    return;
            }
        } while(true);
    }
}