package tuan02.quanli;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    private ArrayList<GiaoVien> giaoViens = new ArrayList<>();
    private ArrayList<NhanVien> nhanViens = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void nhapCB(){
        System.out.print("Bạn muốn thêm 1 nhân viên hay 1 giáo viên (Nhập S nếu là nhân viên, T nếu là giáo viên): ");
        String c = sc.nextLine();
        switch (c){
            case "t":
                GiaoVien gv = new GiaoVien();
                giaoViens.add(gv.nhapGV());
                break;
            case "s":
                NhanVien nv = new NhanVien();
                nhanViens.add(nv.nhapNV());
                break;
            default:
                return;
        }
    }

    public void searchByName(){
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        for(GiaoVien gv : giaoViens){
            if(gv.getHoTen().equalsIgnoreCase(name)){
                System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                        "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
                gv.hienThiGV();
            }
        }
        for(NhanVien nv : nhanViens){
            if(nv.getHoTen().equalsIgnoreCase(name)){
                System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                        "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
                nv.hienThiNV();
            }
        }
    }

    public void search(){
        System.out.println("Nhập phòng ban/ khoa:");
        String s = sc.nextLine();
        for(GiaoVien gv : giaoViens){
            if(gv.getKhoa().equalsIgnoreCase(s)){
                System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                        "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
                gv.hienThiGV();
            }
        }
        for(NhanVien nv : nhanViens){
            if(nv.getPhongBan().equalsIgnoreCase(s)){
                System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                        "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
                nv.hienThiNV();
            }
        }
    }

    public void hienThiCB(){
        System.out.printf("%-20s %-10s %-15s %-10s %10s %20s %10s\n",
                "Name", "Fac/Dept", "Deg/Pos", "Sal Ratio", "Allowance", "T.Hours/W.Days", "Salary");
        System.out.println("=======================================================================================================");
        for(GiaoVien gv : giaoViens){
            gv.hienThiGV();
        }
        for(NhanVien nv : nhanViens){
            nv.hienThiNV();
        }
    }
}