package tuan03_04.bai04_GDNhaDat;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGD {
    private ArrayList<GiaoDich> listGD = new ArrayList<>();
    private static int count1;
    private static int count2;

    public GiaoDich taoGD(int temp){
        switch (temp){
            case 1:
                count1++;
                return new GDDat();
            case 2:
                count2++;
                return new GDNha();
            default:
                return null;
        }
    }

    public void nhapThongTinGD(){
        System.out.println("1. Nhap giao dich dat\n2. Nhap giao dich nha");
        int lc = new Scanner(System.in).nextInt();
        switch (lc){
            case 1:
                GiaoDich giaoDich1 = taoGD(1);
                giaoDich1.nhap();
                listGD.add(giaoDich1);
                break;
            case 2:
                GiaoDich giaoDich2 = taoGD(2);
                giaoDich2.nhap();
                listGD.add(giaoDich2);
                break;
        }
    }

    public void hienThongTinGD(){
        System.out.printf("%-10s %-15s %-15s %-10s %-30s %-20s %-15s\n",
                "Ma GD", "Ngay GD", "Don Gia", "Dien Tich", "Loai Nha/ Loai Dat", "Dia Chi", "Thanh Tien");
        System.out.println("====================================================================================================================");
        for(GiaoDich giaoDich : listGD){
            giaoDich.hien();
        }
    }

    public void tongSoLuongGD(){
        System.out.println("So luong giao dich dat: " + count1);
        System.out.println("So luong giao dich nha: " + count2);
    }

    public void trungBinhGDDat(){
        double sum = 0;
        for(GiaoDich giaoDich: listGD){
            if(giaoDich instanceof GDDat){
                sum += ((GDDat) giaoDich).thanhTien();
            }
        }
        System.out.println("Trung binh thanh tien cua giao dich dat la: " + sum/count1);
    }

    public void giaoDich9_2013(){
        System.out.printf("%-10s %-15s %-15s %-10s %-30s %-20s %-15s\n",
                "Ma GD", "Ngay GD", "Don Gia", "Dien Tich", "Loai Nha/ Loai Dat", "Dia Chi", "Thanh Tien");
        System.out.println("====================================================================================================================");

        for(GiaoDich giaoDich : listGD){
            String[] temp = giaoDich.getNgayGD().split("/");
            if (temp[1].equalsIgnoreCase("09") && temp[2].equalsIgnoreCase("2013")) {
                giaoDich.hien();
            }
        }
    }
}
