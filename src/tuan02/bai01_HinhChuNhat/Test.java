package tuan02.bai01_HinhChuNhat;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai va chieu rong:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setDai(a);
        hcn.setRong(b);
        System.out.println(hcn);

        HinhChuNhat hcn1 = new HinhChuNhat(5.5,3.5);
        System.out.println(hcn1);
    }
}
