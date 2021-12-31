package tuan03_04.bai06_HoaDonThuePhong;

import java.util.ArrayList;
import java.util.Scanner;

public class ListHD {
    private ArrayList<HoaDon> listHD = new ArrayList<>();

    private static int count1;
    private static int count2;

    public HoaDon taoHD(int temp){
        switch (temp){
            case 1:
                count1++;
                return new HoaDonTheoGio();
            case 2:
                count2++;
                return new HoaDonTheoNgay();
            default:
                return null;
        }
    }

    public void nhapThongTinHD(){
        System.out.println("1.Hoa don theo gio\n2.Hoa don theo ngay");
        int lc = new Scanner(System.in).nextInt();
        switch (lc){
            case 1:
                HoaDon hoaDon1 = taoHD(1);
                hoaDon1.nhap();
                listHD.add(hoaDon1);
                break;
            case 2:
                HoaDon hoaDon2 = taoHD(2);
                hoaDon2.nhap();
                listHD.add(hoaDon2);
                break;
        }
    }

    public void hienThongTinHD(){
        System.out.println("--------------------------------------------------- Hoa don theo gio ------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-15s %-15s %-15s\n",
                "Ma HD","Ngay HD", "Ten KH",  "Ma phong", "Don Gia", "So gio thue", "Thanh Tien");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for(HoaDon hoaDon : listHD){
            if(hoaDon instanceof HoaDonTheoGio) {
                hoaDon.hien();
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------------- Hoa don theo ngay ------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-15s %-15s %-15s\n",
                "Ma HD","Ngay HD", "Ten KH",  "Ma phong", "Don Gia", "So ngay thue", "Thanh Tien");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for(HoaDon hoaDon : listHD){
            if(hoaDon instanceof HoaDonTheoNgay) {
                hoaDon.hien();
            }
        }
    }

    public void tongSoLuongHD(){
        System.out.println("So luong hoa don theo gio: " + count1);
        System.out.println("So luong hoa don theo ngay: " + count2);
    }

    public void hoaDon9_2013(){
        double sum = 0;
        int count = 0;
        for(HoaDon hoaDon : listHD){
            String[] temp = hoaDon.getNgayHD().split("/");
            if (temp[1].equalsIgnoreCase("09") && temp[2].equalsIgnoreCase("2013")) {
                sum += hoaDon.thanhTien();
                count++;
            }
        }
        System.out.println("Trung binh thanh tien cua hoa don thue phong trong thang 9/2013: " + sum/count);
    }
}
