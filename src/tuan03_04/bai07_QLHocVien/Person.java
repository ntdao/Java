package tuan03_04.bai07_QLHocVien;

import java.util.Scanner;

public abstract class Person implements IPerson{
    private String hoTen, diaChi;

    public Person() {
    }

    public Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Dia chi: ");
        setDiaChi(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
