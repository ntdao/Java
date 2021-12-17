package tuan02.bai02_SinhVien;

import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private float diemLT, diemTH;

    public SinhVien() {
    }

    public SinhVien(int id, String name, float diemLT, float diemTH) {
        this.id = id;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTB(){
        return (diemLT + diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name +
                ", diem LT=" + diemLT +
                ", diem TH=" + diemTH +
                ", diem TB = " + diemTB() +
                '}';
    }

    public void hthi(){
        System.out.printf("%-12d %-30s %-8.2f %-8.2f %-8.2f\n", getId(), getName(), getDiemLT(), getDiemTH(), diemTB());
    }
}
