package tuan05_06.bai02_QLPhongHoc;

import java.util.Scanner;

public class PhongMayTinh extends PhongHoc{
    private int soMayTinh;

    public PhongMayTinh() {
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Số máy tính: ");
        setSoMayTinh(sc.nextInt());
    }

    @Override
    public void hien() {

    }

    @Override
    public boolean datChuan() {
        if(super.datChuan()){
            if(getDienTich()/soMayTinh < 1.5){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Phòng máy tính: " + super.toString() +
                ", Số máy tính: " + soMayTinh;
//                ", Đạt chuẩn: " + s;
    }
}
