package tuan02.bai08_CD;

import java.util.Scanner;

public class CD {
    private  int maCD;
    private String tuaCD, caSy;
    private int soBai;
    private double giaThanh;

    public CD() {
    }

    public CD(int maCD, String tuaCD, String caSy, int soBai, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBai = soBai;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBai() {
        return soBai;
    }

    public boolean setSoBai(int soBai) {
        if(soBai > 0) {
            this.soBai = soBai;
            return true;
        }else{
            return false;
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public boolean setGiaThanh(double giaThanh) {
        if(giaThanh > 0) {
            this.giaThanh = giaThanh;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", caSy='" + caSy + '\'' +
                ", soBai=" + soBai +
                ", giaThanh=" + giaThanh +
                '}';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma CD:");
        maCD = sc.nextInt();
        System.out.println("Nhap tua CD:");
        tuaCD = sc.nextLine();
        System.out.println("Nhap ca sy:");
        caSy = sc.nextLine();
        while(true){
            System.out.println("Nhap so bai hat:");
            soBai = sc.nextInt();
            boolean check = setSoBai(soBai);
            if(check){
                break;
            }
        }
        while(true){
            System.out.println("Nhap gia thanh:");
            giaThanh = sc.nextDouble();
            boolean check = setGiaThanh(giaThanh);
            if(check){
                break;
            }
        }
    }

    public void xuat(){
        System.out.printf("%-15d %-30s %-20s %-15d %15f\n",
                getMaCD(), getTuaCD(), getCaSy(), getSoBai(), getGiaThanh());
    }
}