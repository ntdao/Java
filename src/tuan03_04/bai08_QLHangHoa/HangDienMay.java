package tuan03_04.bai08_QLHangHoa;

import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private int baoHanh;
    private double congSuat;
    private static final double VAT = 0.1;

    Scanner sc = new Scanner(System.in);

    public HangDienMay() {
    }

    public int getBaoHanh() {
        return baoHanh;
    }

    public void setBaoHanh(int baoHanh) {
        if(baoHanh >= 0) {
            this.baoHanh = baoHanh;
        }else{
            System.out.println("Thời gian bảo hành phải >= 0");
            System.out.print("Thời gian bảo hành (tính theo tháng): ");
            setBaoHanh(sc.nextInt());
        }
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        if(congSuat > 0) {
            this.congSuat = congSuat;
        }else{
            System.out.println("Công suất phải > 0");
            System.out.print("Công suất (KW): ");
            setCongSuat(sc.nextDouble());
        }
    }

    public void nhap() {
        super.nhap();
        System.out.print("Thời gian bảo hành (tính theo tháng): ");
        setBaoHanh(sc.nextInt());
        System.out.print("Công suất (KW): ");
        setCongSuat(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public void hien() {

    }

    @Override
    public String toString() {
        return "Hàng điện máy: " + super.toString() +
                ", Bảo hành: " + baoHanh +
                ", Công suất: " + congSuat +
                ", Đánh giá: " + danhGia();
    }

    @Override
    public String danhGia() {
        String s = null;
        if(getSoLuong() < 3){
            s = "Bán được";
        }
        return s;
    }
}
