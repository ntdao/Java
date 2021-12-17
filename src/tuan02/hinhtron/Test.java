package tuan02.hinhtron;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        System.out.print("Nhập bán kính hình tròn: ");
        Scanner scanner = new Scanner(System.in);
        hinhTron.setBanKinh(scanner.nextDouble());
        System.out.println(hinhTron);

        HinhTron hinhTron1 = new HinhTron(2.5);
        System.out.println(hinhTron1);
    }
}
