package tuan03_04.bai01_CongTyDL;

import java.util.Scanner;

public class NgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;

    public NgoaiThanh() {
    }

    public NgoaiThanh(String maChuyenXe, String tenTaiXe, String soXe, double doanhThu, String noiDen, int soNgay) {
        super(maChuyenXe, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public void nhap()
    {
        Scanner in = new Scanner(System.in);
        super.nhap();
        System.out.print("Noi Den: ");
        this.noiDen = in.nextLine();
        System.out.print("So Ngay: ");
        this.soNgay = in.nextInt();
    }

    @Override
    public String toString() {
        return "Ngoai thanh: " + super.toString() +
                ", noi den: " + noiDen +
                ", so ngay: " + soNgay +
                ", doanh thu:" + this.getDoanhThu();
    }
}