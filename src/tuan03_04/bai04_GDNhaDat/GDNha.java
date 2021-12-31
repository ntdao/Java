package tuan03_04.bai04_GDNhaDat;

import java.util.Date;
import java.util.Scanner;

public class GDNha extends GiaoDich{
    private int loaiNha;
    private String diaChi;

    public GDNha() {
    }

    public GDNha(String maGD, Date ngayGD, double donGia, int loaiNha, String diaChi, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        String s;
        if(loaiNha == 1){
            s = "cao cap";
        }else{
            s = "thuong";
        }
        return s;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double thanhTien(){
        if(loaiNha == 1){
            return getDienTich()*getDonGia();
        }else{
            return getDienTich()*getDonGia()*0.9;
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Loai nha (1 - cao cap, 2 - thuong): ");
        loaiNha = sc.nextInt();
        System.out.print("Dia chi: ");
        sc.nextLine();
        diaChi = sc.nextLine();
    }

    @Override
    public void hien() {
        System.out.printf("%-10s %-15s %-15.2f %-10.2f %-30s %-20s %-15.2f\n",
                getMaGD(), getNgayGD(), getDonGia(), getDienTich(), getLoaiNha(), getDiaChi(), thanhTien());
    }

    public String toString(){
        return "Giao dich nha: " + super.toString() +
                ", Loai nha: " + getLoaiNha() + ", Dia chi: " + diaChi + ", Thanh tien: " + thanhTien();
    }
}
