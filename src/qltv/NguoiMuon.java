package qltv;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class NguoiMuon extends Sach{
    private String name, address;
    private int age;
    private String email;
    private int sdt;
    private String ngayMuon;
    private String ngayHetHan;

    public NguoiMuon(String tenSach, String tacGia, String nhaXuatBan, String ngayXuatBan, int soLuong, String theLoai, String tinhTrang,
                     String name, String address, int age, String email, int sdt, String ngayMuon, String ngayHetHan) {
        super(tenSach, tacGia, nhaXuatBan, ngayXuatBan, soLuong, theLoai, tinhTrang);
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.sdt = sdt;
        this.ngayMuon = ngayMuon;
        this.ngayHetHan = ngayHetHan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}
