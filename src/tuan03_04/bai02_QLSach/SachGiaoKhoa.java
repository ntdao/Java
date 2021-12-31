package tuan03_04.bai02_QLSach;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
    private int tinhTrang;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, int tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double thanhTien(){
        if(tinhTrang == 1){
            return getSoLuong()*getDonGia();
        }else{
            return getSoLuong()*getDonGia()*0.5;
        }
    }

    public SachGiaoKhoa nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập tình trạng sách (1 - sách mới, 0 - sách cũ): ");
        tinhTrang = sc.nextInt();
        return new SachGiaoKhoa(getMaSach(),getNgayNhap(),getDonGia(),getSoLuong(),getNhaXuatBan(),tinhTrang);
    }

    public void xuat(){
        String str;
        if(tinhTrang == 0){
            str = "sách cũ";
        }else{
            str = "sách mới";
        }
        System.out.printf("%-15s %-15s %-15.3f %-15d %-20s %-20s %-15.3f\n",
                getMaSach(), getNgayNhap(), getDonGia(),getSoLuong(), getNhaXuatBan(), str, thanhTien());
    }

    @Override
    public String toString() {
        String str;
        if(tinhTrang == 0){
            str = "sách cũ";
        }else{
            str = "sách mới";
        }
        return "Sách giáo khoa: " + super.toString() +
                ", tình trạng: " + str + ", thành tiền: " + thanhTien();
    }
}