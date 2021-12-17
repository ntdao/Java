package tuan02.hinhtron;

public class HinhTron {
    public static final double PI = 3.14;
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getChuVi(){
        return 2*PI*banKinh;
    }

    public double getDienTich(){
        return PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "Hinh tròn " + "bán kính = " + banKinh +
                ", chu vi " + getChuVi() + ", diện tích " + getDienTich();
    }
}
