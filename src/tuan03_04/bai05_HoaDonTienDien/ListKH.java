package tuan03_04.bai05_HoaDonTienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class ListKH {
    private ArrayList<KhachHang> listKH = new ArrayList<>();

    private static int count1;
    private static int count2;

    public KhachHang taoHD(int temp){
        switch (temp){
            case 1:
                count1++;
                return new KhachHangVN();
            case 2:
                count2++;
                return new KhachHangNN();
            default:
                return null;
        }
    }

    public void nhapThongTinHD(){
        System.out.println("1.Khach hang Viet Nam\n2.Khach hang nuoc ngoai");
        int lc = new Scanner(System.in).nextInt();
        switch (lc){
            case 1:
                KhachHang khachHang1 = taoHD(1);
                khachHang1.nhap();
                listKH.add(khachHang1);
                break;
            case 2:
                KhachHang khachHang2 = taoHD(2);
                khachHang2.nhap();
                listKH.add(khachHang2);
                break;
        }
    }

    public void hienThongTinHD(){
        System.out.println("---------------------------------------- Khach hang Viet Nam --------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-10s %-10s %-10s %-15s\n",
                "Ma KH", "Ho Ten", "Ngay ra HD", "Doi Tuong KH", "So Luong", "Don Gia", "Dinh Muc", "Thanh Tien");
        System.out.println("=====================================================================================================================");
        for(KhachHang khachHang : listKH){
            if(khachHang instanceof KhachHangVN) {
                khachHang.hien();
            }
        }
        System.out.println();
        System.out.println("---------------------------------------- Khach hang nuoc ngoai -------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-10s %-10s %-15s\n",
                "Ma KH", "Ho Ten", "Ngay ra HD", "Quoc Tich", "So Luong", "Don Gia", "Thanh Tien");
        System.out.println("==========================================================================================================");
        for(KhachHang khachHang : listKH){
            if(khachHang instanceof KhachHangNN) {
                khachHang.hien();
            }
        }
    }

    public void tongSoLuongHD(){
        System.out.println("So luong khach hang Viet Nam: " + count1);
        System.out.println("So luong khach hang nuoc ngoai: " + count2);
    }

    public void trungBinhKHNN(){
        double sum = 0;
        for(KhachHang khachHang : listKH){
            if(khachHang instanceof KhachHangNN){
                sum += ((KhachHangNN) khachHang).thanhTien();
            }
        }
        System.out.println("Trung binh thanh tien cua khach hang nuoc ngoai la: " + sum/count2);
    }

    public void hoaDon9_2013(){
        for(KhachHang khachHang : listKH){
            String[] temp = khachHang.getNgayHD().split("/");
            if (temp[1].equalsIgnoreCase("09") && temp[2].equalsIgnoreCase("2013")) {
                System.out.println(khachHang);
            }
        }
    }
}
