package tuan02.quanli;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
    private String phongBan;
    private ChucVu chucVu;
    private int soNgayCong;

    public NhanVienVanPhong(){
    }

    public NhanVienVanPhong(String hoTen, double heSoLuong, String phongBan, ChucVu chucVu, int soNgayCong) {
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

    public double phuCap(){
        return chucVu.getPhuCap();
    }

    @Override
    public double tinhLuong(){
        return super.getHeSoLuong()*730+ phuCap()+soNgayCong*30;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Phòng ban:");
        phongBan = sc.nextLine();
        System.out.print("Chức vụ (1 = Trưởng phòng, 2 = Phó phòng, 3 = Nhân viên):");
        int cv = sc.nextInt();
        switch (cv){
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
        soNgayCong = sc.nextInt();
    }

    @Override
    public String toString() {
        return getHoTen() + ", " + phongBan + ", " + chucVu + ", " + ", " + getHeSoLuong()
                + ", " + chucVu.getPhuCap() + ", " + soNgayCong + ", " + tinhLuong();
    }

    @Override
    public void hien(){
        System.out.printf("%-20s %-10s %-15s %-10.1f %10.1f %20d %10.1f\n", super.getHoTen(), phongBan, chucVu,
                super.getHeSoLuong(), phuCap(), soNgayCong, tinhLuong());
    }
}
