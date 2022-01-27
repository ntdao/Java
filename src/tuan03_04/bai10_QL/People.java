package tuan03_04.bai10_QL;

import java.util.Scanner;

public abstract class People implements IPeople{
    private String ten, diaChi;

    public People() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten: ");
        setTen(scanner.nextLine());
        System.out.print("Dia chi: ");
        setDiaChi(scanner.nextLine());
    }
}
