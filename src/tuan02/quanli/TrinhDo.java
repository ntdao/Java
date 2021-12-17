package tuan02.quanli;

public enum TrinhDo {
    CUNHAN(300.0), THACSI(500.0), TIENSI(1000.0);
    private double phuCap;

    TrinhDo(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getPhuCap() {
        return phuCap;
    }
}
