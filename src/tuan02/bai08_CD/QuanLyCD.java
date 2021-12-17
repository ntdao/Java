package tuan02.bai08_CD;

import java.util.Scanner;

public class QuanLyCD {
    private CD[] cds;
    private int n;
    static int count;

    public QuanLyCD() {
    }

    public QuanLyCD(int n) {
        this.cds = new CD[n];
        this.n = n;
    }

//    public void nhapCD(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so luong CD:");
//        n = sc.nextInt();
//        for(int i = 0; i < n; i++){
//            System.out.println("Nhap thong tin CD thu " + (i+1));
//            CD cd = cds[i];
//            cd.nhap();
//            count++;
//        }
//    }

    public void xuatCD(){
        System.out.printf("%-15s %-30s %-20s %-15s %15s\n", "Ma CD" , "Tua CD", "Ca sy", "So bai hat", "Gia thanh");
        System.out.println("====================================================================================================");
        for (int i = 0; i < count; i++){
            cds[i].xuat();
        }
    }

    public void sapXepTheoGia(){
        for(int i = 0; i < count - 1; i++){
            for(int  j = i+1; j < count; j++){
                if(cds[i].getGiaThanh() < cds[j].getGiaThanh()){
                    CD temp = cds[i];
                    cds[i] = cds[j];
                    cds[j] = temp;
                }
            }
        }
    }

    public void sapXepTheoTen(){
        for(int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (cds[i].getTuaCD().compareTo(cds[j].getTuaCD()) > 0) {
                    CD temp = cds[i];
                    cds[i] = cds[j];
                    cds[j] = temp;
                }
            }
        }
    }

    public boolean checkMaCD(int maCD1){
        for (int i = 0; i < count; i++)
            if (cds[i].getMaCD() == maCD1)
                return false;
        return true;
    }

    public void themCD(){
        Scanner sc = new Scanner(System.in);
        CD newCD = new CD();
        if(count < n) {
            int maCD1;
            do {
                System.out.println("Nhap ma CD:");
                maCD1 = sc.nextInt();
            }while(!checkMaCD(maCD1));

            newCD.setMaCD(maCD1);
            System.out.println("Nhap tua CD:");
            sc.nextLine();
            newCD.setTuaCD(sc.nextLine());
            System.out.println("Nhap ca sy:");
            newCD.setCaSy(sc.nextLine());
            while (true) {
                System.out.println("Nhap so bai hat:");
                int soBai = sc.nextInt();
                boolean check = newCD.setSoBai(soBai);
                if (check) {
                    break;
                }
            }
            while (true) {
                System.out.println("Nhap gia thanh:");
                double giaThanh = sc.nextDouble();
                boolean check = newCD.setGiaThanh(giaThanh);
                if (check) {
                    break;
                }
            }
            cds[count] = newCD;
            count++;
        }

    }

    public double tongGiaThanh(){
        double gia = 0;
        if(count == 0){
            return 0;
        }
        for(int i = 0; i < count; i++){
             gia += cds[i].getGiaThanh();
        }
        return gia;
    }

    public int soLuong(){
        return count;
    }
}
