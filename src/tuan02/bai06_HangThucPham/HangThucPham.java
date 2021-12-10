package tuan02.bai06_HangThucPham;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class HangThucPham {
    private String maHang, tenHang;
    private double donGia;
    private Date ngaySX, ngayHH;

    public HangThucPham() {
    }

    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHH) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public Date getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(Date ngayHH) {
        this.ngayHH = ngayHH;
    }

    public boolean ktraHH(){
        Date now = new Date();
        return ngayHH.after(now);
    }

    @Override
    public String toString() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String str = numberFormat.format(donGia);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(ngayHH);
        return "HangThucPham{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", ngaySX='" + ngaySX + '\'' +
                ", ngayHH='" + ngayHH + '\'' +
                '}';
    }
}
