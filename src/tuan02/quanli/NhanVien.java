package tuan02.quanli;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String phongBan;
    private ChucVu chucVu;
    private int soNgayCong;

    public NhanVien(){
    }

    public NhanVien(String phongBan, ChucVu chucVu,int soNgayCong) {
        this.phongBan = phongBan;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
    }

    public NhanVien(String hoTen, double heSoLuong, String phongBan, ChucVu chucVu, int soNgayCong) {
        super(hoTen, heSoLuong);
        this.phongBan = phongBan;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public double getLuongNV(){
        return super.getHeSoLuong()*730+ chucVu.getPhuCap()+soNgayCong*30;
    }

    public NhanVien nhapNV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên:");
        String hoTen = sc.nextLine();
        System.out.print("Hệ số lương:");
        double heSoLuong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Phòng ban:");
        String phongBan = sc.nextLine();
        System.out.print("Chức vụ (1 = Trưởng phòng, 2 = Phó phòng, 3 = Nhân viên):");
        int lc = sc.nextInt();
        ChucVu chucVu = null;
        switch (lc){
            case 1:
                chucVu = ChucVu.TRUONGPHONG;
                break;
            case 2:
                chucVu = ChucVu.PHOPHONG;
                break;
            case 3:
                chucVu = ChucVu.NHANVIEN;
                break;
        }
        System.out.print("Số ngày công:");
        int soNgayCong = sc.nextInt();

        return new NhanVien(hoTen, heSoLuong, phongBan, chucVu, soNgayCong);
    }

    @Override
    public String toString() {
        return getHoTen() + ", " + phongBan + ", " + chucVu + ", " + ", " + getHeSoLuong()
                + ", " + chucVu.getPhuCap() + ", " + soNgayCong + ", " + getLuongNV();
    }

    public void hienThiNV(){
        System.out.printf("%-20s %-10s %-15s %-10.1f %10.1f %20d %10.1f\n", getHoTen(), getPhongBan(), getChucVu(),
                getHeSoLuong(), getChucVu().getPhuCap(), getSoNgayCong(), getLuongNV());
    }
}
