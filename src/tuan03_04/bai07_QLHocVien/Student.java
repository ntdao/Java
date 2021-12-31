package tuan03_04.bai07_QLHocVien;

import java.util.Scanner;

public class Student extends Person{
    private float diem1, diem2;

    public Student() {
    }

    public Student(String hoTen, String diaChi, float diem1, float diem2) {
        super(hoTen, diaChi);
        this.diem1 = diem1;
        this.diem2 = diem2;
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

    public float diemTB(){
        return (diem1+diem2)/2;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Diem mon hoc 1: ");
        setDiem1(sc.nextFloat());
        System.out.print("Diem mon hoc 2: ");
        setDiem2(sc.nextFloat());
    }

    @Override
    public void hien() {
        System.out.printf("%-20s %-20s %-15.2f %-15.2f %-15.2f %-20s\n",
                getHoTen(), getDiaChi(), getDiem1(), getDiem2(), diemTB(), danhGia());
    }

    @Override
    public String danhGia() {
        String s;
        if(diemTB() >= 8.5){
            s = "Gioi";
        }else if(diemTB() >= 6.5){
            s = "Kha";
        }else if(diemTB() >= 5.0){
            s = "Trung binh";
        }else {
            s = "Yeu";
        }
        return s;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", diem1=" + diem1 +
                ", diem2=" + diem2 +
                ", diemTB=" + diemTB() +
                ", danhGia=" + danhGia() +
                '}';
    }
}
