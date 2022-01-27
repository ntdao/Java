package tuan03_04.bai10_QL;

import java.util.Scanner;

public class SinhVien extends People{
    private float diem1, diem2;

    Scanner scanner = new Scanner(System.in);

    public SinhVien() {
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float tongDiem(){
        return diem1 + diem2;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Diem mon 1: ");
        setDiem1(scanner.nextFloat());
        System.out.print("Diem mon 2: ");
        setDiem2(scanner.nextFloat());
    }

    @Override
    public String toString() {
        return "Sinh Vien: " + super.toString() +
                ", diem mon 1 = " + diem1 +
                ", diem mon 2 = " + diem2 +
                ", tong diem = " + tongDiem();
    }

    public void hien(){
        System.out.printf("%-20s %-20s %-15.2f %-15.2f %-15.2f\n",
                getTen(), getDiaChi(), getDiem1(), getDiem2(), tongDiem());
    }

}
