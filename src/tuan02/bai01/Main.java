package tuan02.bai01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai va chieu rong:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.setcDai(a);
        hcn.setcRong(b);
        System.out.println(hcn);
    }
}
