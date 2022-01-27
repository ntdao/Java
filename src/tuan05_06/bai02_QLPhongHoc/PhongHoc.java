package tuan05_06.bai02_QLPhongHoc;

import java.util.Scanner;

public abstract class PhongHoc implements IPhongHoc{
    private String maPhong, dayNha;
    private double dienTich;
    private int soDen;

    public PhongHoc() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoDen() {
        return soDen;
    }

    public void setSoDen(int soDen) {
        this.soDen = soDen;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã phòng: ");
        setMaPhong(sc.nextLine());
        System.out.print("Dãy nhà: ");
        setDayNha(sc.nextLine());
        System.out.print("Diện tích: ");
        setDienTich(sc.nextDouble());
        System.out.print("Số bóng đèn: ");
        setSoDen(sc.nextInt());
    }

    public boolean datChuan(){
        if(dienTich/ soDen < 10){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return ", Mã phòng: " + maPhong +
                ", Dãy nhà: " + dayNha +
                ", Diện tích: " + dienTich +
                ", Số bóng đèn: " + soDen;
    }
}
