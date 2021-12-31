package tuan03_04.bai02_QLSach;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSach {
    private ArrayList<SachGiaoKhoa> sachGiaoKhoas = new ArrayList<>();
    private ArrayList<SachThamKhao> sachThamKhaos = new ArrayList<>();

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - sach giao khoa, 2- sach tham khao");
        int lc = sc.nextInt();
        switch (lc){
            case 1:
                SachGiaoKhoa sgk = new SachGiaoKhoa();
                sachGiaoKhoas.add(sgk.nhap());
                break;
            case 2:
                SachThamKhao stk = new SachThamKhao();
                sachThamKhaos.add(stk.nhap());
                break;
            default:
                return;
        }
    }

    public void xuat(){
        System.out.printf("%-15s %-15s %-15s %-15s %-20s %-20s %-15s\n",
                "Ma sach", "Ngay nhap", "Don Gia", "So luong", "Nha xuat ban", "Tinh trang/ Thue", "Thanh tien");
        System.out.println("========================================================================================================================");
        for (SachGiaoKhoa sgk : sachGiaoKhoas) {
            sgk.xuat();
        }
        for (SachThamKhao stk : sachThamKhaos) {
            stk.xuat();
        }

    }

    public void tongThanhTien(){
        int m = 0;

        for (SachGiaoKhoa sgk : sachGiaoKhoas) {
            m += sgk.thanhTien();
        }
        System.out.println("Tong thanh tien sgk la: " + m);

        for (SachThamKhao stk : sachThamKhaos) {
            m += stk.thanhTien();
        }
        System.out.println("Tong thanh tien stk la: " + m);
    }

    public void trungBinh(){
        int m = 0;
        for (SachThamKhao stk : sachThamKhaos) {
            m += stk.getDonGia();
        }
        if(m != 0){
            System.out.println("Trung binh don gia stk la: " + m/(sachThamKhaos.size()));
        }
    }

    public void timNXB(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nha xuat ban:");
        String nxb = sc.nextLine();
        for (SachGiaoKhoa sgk : sachGiaoKhoas) {
            if(nxb.compareTo(sgk.getNhaXuatBan()) == 0){
                System.out.println(sgk);
            }
        }
    }
}
