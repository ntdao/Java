package tuan03_04.bai03_QLGiaoDich;

import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int maGD, String ngayGD, double donGia, int soLuong, String loaiVang) {
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public double thanhTien(){
        return getSoLuong()*getDonGia();
    }

    public GiaoDichVang nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Loai vang: ");
        loaiVang = sc.nextLine();
        return new GiaoDichVang(getMaGD(),getNgayGD(),getDonGia(),getSoLuong(),loaiVang);
    }

    public String toString(){
        return "Giao dich vang: " + super.toString() +
                ", Loai vang: " + loaiVang + ", Thanh tien: " + thanhTien();
    }
}
