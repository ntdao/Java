package tuan02.bai07_SinhVien;

import java.util.Scanner;

public class SinhVien {
    private int mssv;
    private String ten;
    private String diaChi;
    private String sdt;

    public SinhVien() {
    }

    public SinhVien(int mssv, String ten, String diaChi, String sdt) {
        this.mssv = mssv;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public boolean setSdt(String sdt) {
        if (sdt != null && sdt.length() == 7 ) {
            if(isNumeric(sdt)){
                this.sdt = sdt;
                return true;
            }
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv=" + mssv +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt=" + sdt +
                '}';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mssv:");
        mssv = sc.nextInt();
        System.out.println("Nhap ho ten:");
        sc.nextLine();
        ten = sc.nextLine();
        System.out.println("Nhap dia chi:");
        diaChi = sc.nextLine();
        while(true){
            System.out.println("Nhap so dien thoai (do dai: 7 chu so):");
            sdt = sc.nextLine();
            boolean check = setSdt(sdt);
            if(check){
                break;
            }
        }
    }

    public void xuat(){
        System.out.printf("%-12d %-30s %-30s %-8s\n",
                getMssv(), getTen(), getDiaChi(), getSdt());
    }
}