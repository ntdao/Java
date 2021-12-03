package qltv;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    static void nhapSach(Sach sach) {
        System.out.print("Nhap ten sach: ");
        sach.setTenSach(scanner.nextLine());
        System.out.print("Nhap tac gia:");
        sach.setTacGia(scanner.nextLine());
        System.out.print("Nhap ten nha xuat ban: ");
        sach.setNgayXuatBan(scanner.nextLine());
        System.out.print("Nhap ngay xuat ban:");
        sach.setNgayXuatBan(scanner.nextLine());
        System.out.print("Nhap the loai:");
        sach.setTheLoai(scanner.nextLine());
        System.out.print("Nhap so luong: ");
        sach.setSoLuong(scanner.nextInt());
    }

    static void muonSach(NguoiMuon p){
        System.out.print("Nhap ten nguoi muon:");
        p.setName(scanner.nextLine());
        System.out.print("Nhap tuoi:");
        scanner.nextLine();
        p.setAge(scanner.nextInt());
        System.out.print("Nhap dia chi:");
        p.setAddress(scanner.nextLine());
        System.out.print("Nhap so dien thoai");
        scanner.nextLine();
        p.setSdt(scanner.nextInt());
        System.out.print("Nhap email:");
        p.setEmail(scanner.nextLine());
        System.out.print("Nhap so sach muon:");
        int n = scanner.nextInt();
        Sach[] sach = new Sach[n];
        for(int i = 0; i < n; i++){
            System.out.println("Quyen " + i+1);
            sach[i] = new Sach();
            nhapSach(sach[i]);
        }
        System.out.print("Nhap ngay muon:");
        p.setNgayMuon(scanner.nextLine());
        System.out.println("Ngay het han:");

    }


}
