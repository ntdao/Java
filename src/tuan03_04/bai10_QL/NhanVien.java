package tuan03_04.bai10_QL;

import java.net.PortUnreachableException;
import java.util.Scanner;

public class NhanVien extends People{
    private float luong;
    private String chucVu;

    Scanner scanner = new Scanner(System.in);

    public NhanVien() {
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Chuc vu: ");
        setChucVu(scanner.nextLine());
        System.out.print("Luong: ");
        setLuong(scanner.nextFloat());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "luong=" + luong +
                ", chucVu='" + chucVu + '\'' +
                '}';
    }

    public void hien(){
        System.out.printf("%-20s %-20s %-20s %-20.2f \n",
                getTen(), getDiaChi(), getChucVu(), getLuong());
    }

}
