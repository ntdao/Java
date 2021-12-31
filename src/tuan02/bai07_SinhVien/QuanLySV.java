package tuan02.bai07_SinhVien;

import java.util.Scanner;

public class QuanLySV {
    // tao mang sinh vien
    private SinhVien[] sinhViens;
    private int n;
    private static int count;

    public QuanLySV(int n) {
        this.n = n;
        sinhViens = new SinhVien[n];
    }

    public void nhapSV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien muon them:");
        int soSV = sc.nextInt();
        if(soSV > n){
            System.out.println("Khong du bo nho!");
            return;
        }
        do{
            System.out.println("Nhap thong tin sinh vien " + (count + 1));
            SinhVien sv = new SinhVien();
            sv.nhap();
            sinhViens[count] = sv;
            count++;
            soSV--;
        }while(count < n && soSV > 0);
    }

    public void xuatSV(){
        sapXep();
        System.out.printf("%-12s %-30s %-30s %-8s\n", "MSSV", "Ho ten", "Dia chi", "So dien thoai");
        System.out.println("=========================================================================================");
        for(int i = 0; i < count; i++){
            SinhVien sv = sinhViens[i];
            sv.xuat();
        }
    }

    public void sapXep(){
        for(int i = 0; i < count - 1; i++){
            for(int j = i + 1; j < count; j++){
                if(sinhViens[i].getMssv() > sinhViens[j].getMssv()){
                    SinhVien temp = sinhViens[i];
                    sinhViens[i] = sinhViens[j];
                    sinhViens[j] = temp;
                }
            }
        }
    }
}