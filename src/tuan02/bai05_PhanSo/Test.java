package tuan02.bai05_PhanSo;

import java.util.Scanner;
import java.lang.Math;

public class Test {
    static void nhapPS(PhanSo p){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        p.setTuSo(sc.nextInt());
        do {
            System.out.print("Nhap mau so: ");
            p.setMauSo(sc.nextInt());
        } while(p.getMauSo() == 0);
    }

    static PhanSo toiGianPS(PhanSo p){
        int num1 = Math.abs(p.getTuSo()), num2 = Math.abs(p.getMauSo());
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return new PhanSo(p.getTuSo() / num2,p.getMauSo() / num2);
    }

    static PhanSo nghichDaoPS(PhanSo p){
        return new PhanSo(p.getMauSo(), p.getTuSo());
    }

    static PhanSo cong(PhanSo p1, PhanSo p2){

        return new PhanSo(p1.getTuSo()*p2.getMauSo() + p1.getMauSo()*p2.getTuSo(), p1.getMauSo()*p2.getMauSo());
    }

    static PhanSo tru(PhanSo p1, PhanSo p2){

        return new PhanSo(p1.getTuSo()*p2.getMauSo() - p1.getMauSo()*p2.getTuSo(), p1.getMauSo()*p2.getMauSo());
    }

    static PhanSo nhan(PhanSo p1, PhanSo p2){

        return new PhanSo(p1.getTuSo()*p2.getTuSo(), p1.getMauSo()*p2.getMauSo());
    }

    static PhanSo chia(PhanSo p1, PhanSo p2){

        return new PhanSo(p1.getTuSo()*p2.getMauSo(), p1.getMauSo()*p2.getTuSo());
    }

    static void soSanh(PhanSo p1, PhanSo p2){
        float ps1 = (float) p1.getTuSo()/p1.getMauSo();
        float ps2 = (float) p2.getTuSo()/p2.getMauSo();
        if(ps1 == ps2){
            System.out.println("Hai phan so bang nhau");
        }else if(ps1 > ps2){
            System.out.println("Phan so 1 lon hon");
        }else{
            System.out.println("Phan so 2 lon hon");
        }
    }

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        nhapPS(p1);
        nhapPS(p2);
//        System.out.println("Phan so 1 sau khi toi gian la: " + toiGianPS(p1));
//        System.out.println("Phan so 2 sau khi toi gian la: " + toiGianPS(p2));
//
//        System.out.print("Phan so nghich dao cua phan so 1 la: ");
//        toiGianPS(nghichDaoPS(p1)).inPS();

        System.out.print("Tong hai phan so la: ");
        toiGianPS(cong(p1,p2)).inPS();
        System.out.println("Hieu hai phan so la: " + toiGianPS(tru(p1,p2)));
        System.out.println("Tich hai phan so la: " + toiGianPS(nhan(p1,p2)));
        System.out.println("Thuong hai phan so la: " + toiGianPS(chia(p1,p2)));
        soSanh(p1,p2);
    }
}