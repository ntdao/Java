package tuan02.bai05_PhanSo;

import java.util.Scanner;

public class Main {
    static void nhapPS(PhanSo p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        p.setTuSo(sc.nextInt());
        do {
            System.out.println("Nhap mau so:");
            p.setMauSo(sc.nextInt());
        } while(p.getMauSo() == 0);
    }
    static PhanSo toiGianPS(PhanSo p){
        int num1 = p.getTuSo(), num2 = p.getMauSo();
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

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        PhanSo p2 = new PhanSo();
        nhapPS(p1);
        nhapPS(p2);
        System.out.println("Phan so 1 sau khi toi gian la:" + toiGianPS(p1));
        System.out.println("Nghich dao phan so 1:" + nghichDaoPS(p1));
        System.out.println("Phan so 1 sau khi toi gian la:" + toiGianPS(p2));
        PhanSo p3 = cong(p1,p2);
        System.out.println("Tong hai phan so la:" + toiGianPS(p3));
        System.out.println("Hieu hai phan so la:" + toiGianPS(tru(p1,p2)));
        System.out.println("Tich hai phan so la:" + toiGianPS(nhan(p1,p2)));
        System.out.println("Thuong hai phan so la:" + toiGianPS(chia(p1,p2)));
    }
}