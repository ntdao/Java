package tuan03_04.bai10_QL;

import java.util.Scanner;

public class KhachHang extends People {
    private String kieuXe;

    public KhachHang() {
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.print("Kieu xe: ");
        setKieuXe(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Khach Hang: " + super.toString() +
                ", kieu xe: " + kieuXe;
    }

    public void hien(){
        System.out.printf("%-20s %-20s %-20s\n",
                getTen(), getDiaChi(), getKieuXe());
    }
}
