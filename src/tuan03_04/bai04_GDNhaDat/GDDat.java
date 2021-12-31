package tuan03_04.bai04_GDNhaDat;

import java.util.Date;
import java.util.Scanner;

public class GDDat extends GiaoDich{
    private String loaiDat;

    public GDDat() {
    }

    public GDDat(String maGD, Date ngayGD, double donGia, String loaiDat, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double thanhTien(){
        if(loaiDat.equals("A")){
            return getDienTich()*getDonGia()*1.5;
        }else{
            return getDienTich()*getDonGia();
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Loai dat (A, B, C): ");
        loaiDat = sc.nextLine();
    }

    @Override
    public void hien() {
        System.out.printf("%-10s %-15s %-15.2f %-10.2f %-30s %-20s %-15.2f\n",
                getMaGD(), getNgayGD(), getDonGia(), getDienTich(), getLoaiDat(),"", thanhTien());
    }

    @Override
    public String toString() {
        return "Giao dich dat: " + super.toString() +
                ", Loai dat: " + loaiDat + ", Thanh tien: " + thanhTien();
    }
}
