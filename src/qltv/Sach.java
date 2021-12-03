package qltv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Sach {
    private String tenSach, tacGia, nhaXuatBan;
    private String ngayXuatBan;
    private int soLuong;
    private String theLoai;
    private String tinhTrang; // con hay khong
    Scanner scanner = new Scanner(System.in);

    public Sach() {
        super();
    }

    public Sach(String tenSach, String tacGia, String nhaXuatBan, String ngayXuatBan, int soLuong, String theLoai, String tinhTrang) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.ngayXuatBan = ngayXuatBan;
        this.theLoai = theLoai;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String toString() {
        return "Ten sach: " + this.tenSach + ", ten tac gia:" + this.tacGia + ", ten nha xuat ban: " + this.nhaXuatBan
                + ", ngay xuat ban" + this.ngayXuatBan + ", the loai: " + this.theLoai + ", so luong: " + this.soLuong;
    }
}
