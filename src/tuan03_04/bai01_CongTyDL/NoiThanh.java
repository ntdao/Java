package tuan03_04.bai01_CongTyDL;

import java.util.Scanner;

public class NoiThanh extends ChuyenXe{
    private double soKm;
    private String soTuyen;

    public NoiThanh() {
    }

    public NoiThanh(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu, double soKm, String soTuyen) {
        super(maChuyenXe, tenTaiXe, soXe, doanhThu);
        this.soKm = soKm;
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void nhap() {
        Scanner in = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so tuyen: ");
        in.nextLine();
        System.out.print("So Km: ");
        this.soKm = in.nextDouble();
    }

    @Override
    public String toString() {
        return "Noi Thanh: " + super.toString() +
                ", so km: " + soKm +
                ", so tuyen: " + soTuyen +
                ", doanh thu: " + this.getDoanhThu();
    }
}
