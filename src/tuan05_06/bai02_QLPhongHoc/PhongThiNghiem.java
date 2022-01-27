package tuan05_06.bai02_QLPhongHoc;

import java.util.Scanner;

public class PhongThiNghiem extends PhongHoc{
    private String chuyenNganh;
    private int sucChua;
    private int bonRua;

    public PhongThiNghiem() {
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public int getBonRua() {
        return bonRua;
    }

    public void setBonRua(int bonRua) {
        this.bonRua = bonRua;
    }

    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chuyên ngành: ");
        setChuyenNganh(sc.nextLine());
        System.out.print("Sức chứa: ");
        setSucChua(sc.nextInt());
        System.out.print("Bồn rửa: ");
        setBonRua(sc.nextInt());
    }

    @Override
    public void hien() {

    }

    @Override
    public boolean datChuan() {
        if(super.datChuan()){
            if(bonRua == 0){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "có";
        if(bonRua == 0){
            s = "không";
        }
        return "Phòng thí nghiệm: " + super.toString() +
                ", Chuyên ngành: " + chuyenNganh +
                ", Sức chứa: " + sucChua +
                ", Bồn rửa: " + s;
    }
}
