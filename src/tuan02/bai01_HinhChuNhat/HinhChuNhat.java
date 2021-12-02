package tuan02.bai01_HinhChuNhat;

public class HinhChuNhat {
    private double dai, rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double tinhChuVi(){
        return 2*(dai + rong);
    }

    public double tinhDienTich(){
        return dai * rong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + " chieu dai=" + dai + ", chieu rong=" + rong
                + ", chu vi = " + tinhChuVi() + ", dien tich = " + tinhDienTich() + '}';
    }
}
