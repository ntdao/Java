package tuan03_04.bai03_QLGiaoDich;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGiaoDich {
    private ArrayList<GiaoDichVang> gdVangs = new ArrayList<>();
    private ArrayList<GiaoDichTienTe> gdTiens = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    public void nhapGDV(){
        GiaoDichVang gdv = new GiaoDichVang();
        gdVangs.add(gdv.nhap());
    }

    public void nhapGDTT(){
        GiaoDichTienTe gdtt = new GiaoDichTienTe();
        gdTiens.add(gdtt.nhap());
    }

    public void xuat(){
        for(GiaoDichVang gdv : gdVangs){
            System.out.println(gdv);
        }
        for(GiaoDichTienTe gdtt : gdTiens){
            System.out.println(gdtt);
        }
    }

    public void tongSLGD(){
        int s1 = 0, s2 = 0;
        for(GiaoDichVang gdv : gdVangs){
            s1 += gdv.getSoLuong();
            System.out.println("Tong so luong giao dich vang la: " + s1);
        }
        for(GiaoDichTienTe gdtt : gdTiens){
            s2 += gdtt.getSoLuong();
            System.out.println("Tong so luong giao dich tien te la: " + s2);
        }
    }

    // tinh trung binh thanh tien cua giao dich tien te
    public void trungBinhGDTT(){
        double m = 0;
        for(GiaoDichTienTe gdtt : gdTiens){
            m += gdtt.thanhTien();
        }
        if(m == 0){
            System.out.println("Khong co giao dich tien te nao!");
        }else{
            System.out.println("Trung binh thanh tien cua giao dich tien te la: " + m/gdTiens.size());
        }
    }

    // hien thi cac giao dich co don gia > 1 ty
    public void gdTren1Ty(){
        int m = 0;
        for(GiaoDichVang gdv : gdVangs){
            if(gdv.getDonGia() > 1000000000){
                System.out.println(gdv);
                m++;
            }
        }
        for(GiaoDichTienTe gdtt : gdTiens){
            if(gdtt.getDonGia() > 1000000000){
                System.out.println(gdtt);
                m++;
            }
        }
        if(m == 0){
            System.out.println("Khong co giao dich nao co den gi > 1 ty");
        }
    }

}