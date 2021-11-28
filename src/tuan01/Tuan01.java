package tuan01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tuan01 {
    // tong 10 so chan dau tien
    public static int bai10() {
        int sum = 0;
        int soChan = 0;
        int i = 0;
        for (i = 0; i < 10; ++i) {
            sum += soChan;
            soChan += 2;
        }
//        while(i < 10){
//            sum += soChan;
//            soChan += 2;
//            i++;
//        }
        return sum;
    }

    // in ra cac so le tu 1 den 99
    public static void bai11() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
    }

    // tong cac so la boi cua 7 (1-100)
    public static int bai12() {
        int sum = 0;
        for (int i = 7; i <= 100; i += 7) {
            sum += i;
        }
        return sum;
    }

    // tong cac so tu 1 den n
    public static int bai13(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    // tong cac so chan tu 2 den n neu n chan
    // tong cac so le tu 1 den n neu n le
    public static int bai14(int n) {
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
        }
        return sum;
    }

    // max, min cua 1 day so
    public static void bai15(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int j : a) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("max cua day so la: " + max);
        System.out.println("min cua day so la: " + min);
    }

    // giai phuong trinh bac 1
    public static void bai16(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.printf("\nPhuong trinh co 1 nghiem x = %.2f" , b / a);
        }
        System.out.println();
    }

    // kiem tra so chan, le, 0
    public static void bai17() {
        System.out.print("Nhap so n bat ki: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Ban vua nhap so 0");
        } else if (n % 2 == 0) {
            System.out.println("Ban vua nhap so chan");
        } else {
            System.out.println("Ban vua nhap so le");
        }
    }

    // boi cua 3 tu 3 - 300
    public static void bai18(){
        System.out.println("Boi cua 3 tu 3-300 la: ");
        for(int i = 3; i <= 300; i+= 3){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // so lan ki tu 'a' xuat hien trong chuoi
    public static void bai19(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("Ki tu 'a' xuat hien " + count + " lan");
    }

    // dem so luomg ki tu la so
    public static void bai20(){
        int count = 0;
        System.out.print("Nhap 1 chuoi bat ki: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
//                count++;
//            }
//        }

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }

        System.out.println("Co " + count + " ki tu la so");
    }

    // tach chuoi su dung StringTokenizer
    public static void bai21(){
        System.out.println("Nhap 1 chuoi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer s = new StringTokenizer(str);
        System.out.println("Chuoi sau khi tach la: ");
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
    }

    // kiem tra so nguyen to
    public static boolean bai22(int m) {
        int count = 0;
        for (int i = 2; i <= m; i++)
            if (m % i == 0) count++;
        return count == 1;
    }

    // uoc chung lon nhat
    public static void bai23() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 2 so a, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        int u = 0;
        for (int i = 1; i <= max / 2; i++) {
            if (a % i == 0 && b % i == 0) {
                u = i;
            }
        }
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + u);
    }
    // su dung phep tru
    public static int gcdTru(int a, int b){
        // nếu a = 0 => ucln(a,b) = b
        // nếu b = 0 => ucln(a,b) = a
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b; // a = a - b
            }else{
                b -= a;
            }
        }
        return a; // return a or b, bởi vì lúc mày a và b bằng nhau
    }
    // su dung phep chia
    public static int gcdChia(int a, int b){
        // Lặp tới khi 1 trong 2 số bằng 0
        while (a*b != 0){
            if (a > b){
                a %= b; // a = a % b
            }else{
                b %= a;
            }
        }
        return a + b; // return a + b, bởi vì lúc này hoặc a hoặc b đã bằng 0.
    }
    // su dung thuat toan Euclid
    public static int gcd(int a, int b) {
        int tmp;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // tong n so nguyen
    public static int bai24(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        System.out.println("Nhap " + n + " so nguyen bat ki:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    // tong cac so nguyen to nho hon n
    public static int bai25(int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(bai22(i)){
                sum += i;
            }
        }
        return sum;
    }

    // tong n so nguyen to dau tien
    public static int bai26(int n){
        int sum = 0;
        int count = 0;
        int i = 1;
        while(count < n){
            if(bai22(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        return sum;
    }

    // n so dau cua day Fibomaci
    public static void bai27(int m){
        int fib1 = 1;
        int fib2 = 1;
        int i = 2;
        System.out.print(m + " so dau tien cua chuoi Fibonaci la: " + fib1 + " " + fib2 + " ");
        while (i <= m) {
            int fib = fib1 + fib2;
            fib2 = fib1;
            fib1 = fib;
            i++;
            System.out.print(fib + " ");
        }
        System.out.println();
    }

    // ve tam giac vuong can rong
    public static void bai28a(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(j == 0 || j == i || i == 7)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // ve hinh 28b
    public static void bai28b(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(i == 0 || j == 0 || i == 8 || j == 8 || i == j || j == 8-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // ve hinh 28c
    public static void bai28c(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if( i == j || j == 8-i || i == 4)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // ve hinh 29a
    public static void bai29a(){
        System.out.println("Nhap vao canh tam giac:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ve hinh 29b
    public static void bai29b(){
        System.out.println("Nhap vao canh cua tam giac:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ve hinh 29c
    public static void bai29c(){
        System.out.println("Nhap vao chieu cao tam giac:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // in ky tu khoang trang
            for(int j = i; j <= n-1; j++) {
                System.out.print("-");
            }

            // in ky tu ngoi sao
            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }

            // xuong dong ke tiep
            System.out.println();
        }
    }

    // ve hinh 29d
    public static void bai29d(){
        System.out.println("Nhap vao chieu cao tam giac:");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = h, n = h;
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= 2 * h - 1; j++)
            {
                if (j == m || j == n || i== h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            m--;
            n++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Tong cua 10 so chan dau tien la: " + bai10());

        System.out.println("Cac so le tu 1 dem 99 la: ");
        bai11();

        System.out.printf("\nTong cac so la boi cua 7 (1 - 100) la: %d\n" , bai12());

        System.out.println("Tong cac so tu 1 den 10 la: " + bai13(10));

        System.out.println("Tong cac so chan tu 0 den 10 la: " + bai14(10));
        System.out.println("Tong cac so le tu 1 den 9 la: " + bai14(9));

        int[] arr = {0, -3, 5, -7, -9};
        bai15(arr);

        bai16(3, 5);

        bai17();

        bai18();

        bai19("Ana Ba Ba");

        bai20();

        bai21();

        System.out.println("Nhap so n bat ki: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(bai22(n)){
            System.out.println(n + " la so nguyen to");
        }
        else{
            System.out.println(n + " khong la so nguyen to");
        }

        bai23();

        System.out.println("Tong " + n + " so nguyen la: " + bai24(n));

        System.out.println("Tong cac so nguyen to nho hon " + n + " la: " + bai25(n));

        System.out.println("Tong " + n + " so nguyen to dau tien la: " + bai26(n));

        bai27(n);

        bai28a();
        System.out.println();
        bai28b();
        System.out.println();
        bai28c();
        System.out.println();

        bai29a();
        System.out.println();
        bai29b();
        System.out.println();
        bai29c();
        System.out.println();
        bai29d();
    }
}