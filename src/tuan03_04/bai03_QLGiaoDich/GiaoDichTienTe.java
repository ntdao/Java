package tuan03_04.bai03_QLGiaoDich;

import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
    private float tiGia;
    private int loaiTienTe;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(int maGD, String ngayGD, double donGia, int soLuong, float tiGia, int loatTienTe) {
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loatTienTe;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public int getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    public double thanhTien(){
        if(loaiTienTe == 3){
            return getSoLuong()*getDonGia();
        }else{
            return getSoLuong()*getDonGia()*getTiGia();
        }
    }

    public GiaoDichTienTe nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Ti gia:");
        tiGia = sc.nextFloat();
        System.out.print("Loai tien te (1- USD, 2-Euro, 3- Viet Nam): ");
        loaiTienTe = sc.nextInt();
        return new GiaoDichTienTe(getMaGD(),getNgayGD(),getDonGia(),getSoLuong(),tiGia,loaiTienTe);
    }

    public String toString(){
        String loaiTien;
        if(loaiTienTe == 1){
            loaiTien = "USD";
        }else if(loaiTienTe == 2){
            loaiTien = "Euro";
        }else{
            loaiTien = "VND";
        }

        return "Giao dich tien te: " + super.toString() +
                ", Ti gia: " + tiGia + ", Loai tien te: " + loaiTien + ", Thanh tien: " + thanhTien();
    }
}
