package tuan02.quanli;

import java.util.Scanner;

public class GiaoVien extends CanBo{
    private String khoa;
    private TrinhDo trinhDo;
    private int soTiet;

    public GiaoVien() {
    }

    public GiaoVien(String khoa, TrinhDo trinhDo, int soTiet) {
        this.khoa = khoa;
        this.trinhDo = trinhDo;
        this.soTiet = soTiet;
    }

    public GiaoVien(String hoTen, double heSoLuong, String khoa, TrinhDo trinhDo, int soTiet) {
        super(hoTen, heSoLuong);
        this.khoa = khoa;
        this.trinhDo = trinhDo;
        this.soTiet = soTiet;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public double getLuongGV(){
        return super.getHeSoLuong()*730+ trinhDo.getPhuCap()+soTiet*45;
    }

    public GiaoVien nhapGV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên:");
        String hoTen = sc.nextLine();
        System.out.print("Hệ số lương:");
        double heSoLuong = sc.nextDouble();
        System.out.print("Khoa:");
        sc.nextLine();
        String khoa = sc.nextLine();
        System.out.print("Trình độ (1 = Cử nhân, 2 = Thạc sĩ, 3 = Tiến sĩ):");
        int lc = sc.nextInt();
        TrinhDo trinhDo = null;
        switch (lc){
            case 1:
                trinhDo = TrinhDo.CUNHAN;
                break;
            case 2:
                trinhDo = TrinhDo.THACSI;
                break;
            case 3:
                trinhDo = TrinhDo.TIENSI;
                break;
        }
        System.out.print("Số tiết giảng dạy:");
        int soTiet = sc.nextInt();

        return new GiaoVien(hoTen, heSoLuong, khoa, trinhDo, soTiet);
    }

    @Override
    public String toString() {
        return super.getHoTen() + ", " + khoa + ", " + trinhDo + ", "
                + getHeSoLuong() + ", " +  trinhDo.getPhuCap() + ", " + soTiet + ", " + getLuongGV();
    }

    public void hienThiGV(){
        System.out.printf("%-20s %-10s %-15s %-10.1f %10.1f %20d %10.1f\n", getHoTen(), getKhoa(), getTrinhDo(),
                getHeSoLuong(), getTrinhDo().getPhuCap(), getSoTiet(), getLuongGV());
    }
}
