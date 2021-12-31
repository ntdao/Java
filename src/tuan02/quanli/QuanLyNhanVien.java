package tuan02.quanli;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<GiaoVien> giaoViens = new ArrayList<>();
    private ArrayList<NhanVienVanPhong> nhanVienVanPhongs = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void nhapCB(){
        System.out.print("Bạn muốn thêm 1 nhân viên hay 1 giáo viên (Nhập S nếu là nhân viên văn phòng, T nếu là giáo viên): ");
        String c = sc.nextLine();
        switch (c){
            case "t":
                GiaoVien gv = new GiaoVien();
                gv.nhap();
                this.giaoViens.add(gv);
                break;
            case "s":
                NhanVienVanPhong nv = new NhanVienVanPhong();
                nv.nhap();
                this.nhanVienVanPhongs.add(nv);
                break;
            default:
                return;
        }
    }

    public void searchByName(){
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
        for(GiaoVien gv : giaoViens){
            if(gv.getHoTen().equalsIgnoreCase(name)){
                gv.hien();
            }
        }
        for(NhanVienVanPhong nv : nhanVienVanPhongs){
            if(nv.getHoTen().equalsIgnoreCase(name)){
                nv.hien();
            }
        }
    }

    public void search(){
        System.out.println("Nhập phòng ban/ khoa:");
        String s = sc.nextLine();
        System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
        for(GiaoVien gv : giaoViens){
            if(gv.getKhoa().equalsIgnoreCase(s)){
                gv.hien();
            }
        }
        for(NhanVienVanPhong nv : nhanVienVanPhongs){
            if(nv.getPhongBan().equalsIgnoreCase(s)){
                nv.hien();
            }
        }
    }

    public void hienThiCB(){
        System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
        System.out.println("=======================================================================================================");
        for(GiaoVien gv : giaoViens){
           gv.hien();
        }
        for(NhanVienVanPhong nv : nhanVienVanPhongs){
            nv.hien();
        }
    }

//    public NhanVien taoNhanVien(String s){
//        switch (s){
//            case "t":
//                return new GiaoVien();
//            case "s":
//                return new NhanVienVanPhong();
//            default:
//                return null;
//        }
//    }
//
//    public void nhapThongTin(INhanVien[] listNV){
//        if(listNV != null){
//            for(INhanVien iNhanVien : listNV){
//                if(iNhanVien != null) {
//                    iNhanVien.nhap();
//                }else{
//                    System.out.println("Nhan vien khong ton tai");
//                }
//            }
//        }
//    }
//
//    public void hienThongTin(INhanVien[] listNV){
//        if(listNV != null){
//            for(INhanVien iNhanVien : listNV){
//                if(iNhanVien != null) {
//                    iNhanVien.hien();
//                }else{
//                    System.out.println("Nhan vien khong ton tai");
//                }
//            }
//        }
//    }
}