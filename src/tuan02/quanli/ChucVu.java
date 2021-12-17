package tuan02.quanli;

public enum ChucVu {
    TRUONGPHONG(2000.0), PHOPHONG(1000.0), NHANVIEN(500.0);
    private double phuCap;

    ChucVu(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }
}