package tuan02.quanli;

public class CanBo {
    private String hoTen;
    private double heSoLuong;

    public CanBo() {
    }

    public CanBo(String hoTen, double heSoLuong) {
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return hoTen + ", " + heSoLuong;
    }
}
