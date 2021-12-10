package tuan02.bai04_Account;

import java.util.Scanner;

public class Test {

    static void nhapTK(Account tk) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tai khoan:");
        tk.setSoTK(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten tai khoan:");
        tk.setTenTK(sc.nextLine());
        System.out.println("Nhap so du tai khoan:");
        tk.setTienTrongTK(sc.nextDouble());
    }

    public static void main(String[] args) {
        Account[] a = null;
        int k, n = 0;
        long stk1, stk2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Nhap thong tin khach hang\n"
                    + "2.Xuat thong tin khach hang\n" + "3.Nap tien\n" + "4.Rut tien\n"
                    + "5.Dao han\n" + "6.Chuyen khoan\n" + "7.Thoat");
            System.out.println("Nhap lua chon:");
            int lc = sc.nextInt();
            switch (lc) {
                case 1:
                    System.out.println("Nhap so luong khach hang:");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khach hang so: " + (i+1));
                        a[i] = new Account();
                        nhapTK(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 3:
                    System.out.println("Nhap so tai khoan can nap tien:");
                    stk1 = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk1 == a[i].getSoTK()) {
                            a[i].napTien();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap so tai khoan can rut tien:");
                    stk1 = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk1 == a[i].getSoTK()) {
                            a[i].rutTien();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap so tai khoan can dao han:");
                    stk1 = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk1 == a[i].getSoTK()) {
                            a[i].daoHan();
                        }
                    }
                    break;
                case 6:
                    double chuyen, nhan, tienChuyen;
                    System.out.print("Nhap so tai khoan chuyen tien: ");
                    stk1 = sc.nextLong();
                    System.out.print("Nhap so tai khoan nhan tien: ");
                    stk2 = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        if (stk1 == a[i].getSoTK()) {
                            chuyen = a[i].getTienTrongTK();
                            for (int j = 0; j < n; j++) {
                                if (stk2 == a[j].getSoTK()) {
                                    nhan = a[j].getTienTrongTK();
                                    System.out.print("Nhap so tien can chuyen: ");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setTienTrongTK(chuyen);
                                        a[j].setTienTrongTK(nhan);
                                        System.out.println("Chuyen tien thanh cong!");
                                    } else {
                                        System.out.println("Tai khoan khong du so du!");
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:
                   return;
            }
        } while (true);
    }
}