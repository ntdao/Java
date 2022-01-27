package tuan05_06.bai02_QLPhongHoc;

import java.util.Scanner;

public class PhongLyThuyet extends PhongHoc{
    private int mayChieu;

    public PhongLyThuyet() {
    }

    public int getMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(int mayChieu) {
        this.mayChieu = mayChieu;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Số máy chiếu: ");
        setMayChieu(sc.nextInt());
    }

    @Override
    public void hien() {

    }

    @Override
    public boolean datChuan() {
        if(super.datChuan()){
            if (mayChieu == 0) {
                return false;
            }else {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = null;
        if(mayChieu == 0){
            s = "không có";
        }else{
            s = "có";
        }
        return "Phòng lý thuyết: " + super.toString() +
                ", Máy chiếu: " + s;
    }
}
