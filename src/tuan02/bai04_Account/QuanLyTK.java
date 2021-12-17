package tuan02.bai04_Account;

import java.util.Scanner;

public class QuanLyTK {
    private Account[] accounts = new Account[50];
    static int count = 0;
    Scanner sc = new Scanner(System.in);

    public void nhap(){
        int n = 0;
        do {
            System.out.println("Nhap so luong tai khoan:");
            n = sc.nextInt();
        }while(n <= 0);
        do{
            System.out.println("Nhap thong tin tai khoan " + (count+1));
            Account account = new Account();
            account.nhapTK();
            accounts[count] = account;
            count++;
        }while (count < n);
    }

    public void xuat(){
        System.out.printf("%-10s %-20s %-20s\n", "So TK", "Ten TK", "So tien trong TK");
        for (int i = 0; i < count; i++){
            Account account = accounts[i];
            account.inTK();
        }
    }

    public void nap(){
        System.out.println("Nhap so tai khoan can nap tien:");
        long stk = sc.nextLong();
        for (int i = 0; i < count; i++) {
            Account account = accounts[i];
            if (stk == account.getSoTK()) {
                account.napTien();
            }
        }
    }

    public void rut(){
        System.out.println("Nhap so tai khoan can rut tien:");
        long stk = sc.nextLong();
        for (int i = 0; i < count; i++) {
            Account account = accounts[i];
            if (stk == account.getSoTK()) {
                account.rutTien();
            }
        }
    }

    public void daoHanTK(){
        System.out.println("Nhap so tai khoan can dao han:");
        long stk = sc.nextLong();
        for (int i = 0; i < count; i++) {
            Account account = accounts[i];
            if (stk == accounts[i].getSoTK()) {
                accounts[i].daoHan();
            }
        }
    }

    public void chuyen(){
        double chuyen, nhan, tienChuyen;
        System.out.print("Nhap so tai khoan chuyen tien: ");
        long stk1 = sc.nextLong();
        System.out.print("Nhap so tai khoan nhan tien: ");
        long stk2 = sc.nextLong();
        for (int i = 0; i < count; i++) {
            Account account1 = accounts[i];
            if (stk1 == account1.getSoTK()) {
                chuyen = account1.getTienTrongTK();
                for (int j = 0; j < count; j++) {
                    Account account2 = accounts[j];
                    if (stk2 == account2.getSoTK()) {
                        nhan = account2.getTienTrongTK();
                        System.out.print("Nhap so tien can chuyen: ");
                        tienChuyen = sc.nextDouble();
                        if (tienChuyen <= chuyen) {
                            chuyen = chuyen - tienChuyen;
                            nhan = nhan + tienChuyen;
                            account1.setTienTrongTK(chuyen);
                            account2.setTienTrongTK(nhan);
                            System.out.println("Chuyen tien thanh cong!");
                        } else {
                            System.out.println("Tai khoan khong du so du!");
                        }
                    }
                }
            }
        }
    }

}
