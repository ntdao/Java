package tuan03_04.bai10_QL;

import java.util.Scanner;

public class QuanLy {
    private People[] listP;
    private int n;
    private static int count;

    Scanner scanner = new Scanner(System.in);

    public QuanLy(int n) {
        this.n = n;
        listP = new People[n];
    }

    public void them() {
        System.out.printf("1. Them 1 sinh vien\n" +
                "2. Them 1 nhan vien\n" +
                "3. Them 1 khach hang\n");
        System.out.print("Lua chon: ");
        int temp = scanner.nextInt();
        if (count < n) {
            switch (temp) {
                case 1:
                    People p1 = new SinhVien();
                    p1.nhap();
                    listP[count] = p1;
                    count++;
                    break;
                case 2:
                    People p2 = new NhanVien();
                    p2.nhap();
                    listP[count] = p2;
                    count++;
                    break;
                case 3:
                    People p3 = new KhachHang();
                    p3.nhap();
                    listP[count] = p3;
                    count++;
                    break;
                default:
                    return;
            }
        } else {
            System.out.println("Bo nho day, khong the them!");
        }
    }

    public void hien () {
        System.out.println("----------------------------- Danh sach sinh vien ----------------------------------");
        System.out.printf("%-20s %-20s %-15s %-15s %-15s\n",
                "Ho ten", "Dia chi", "Diem mon 1", "Diem mon 2", "Tong Diem");
        for (int i = 0; i < count; i++) {
            if (listP[i] instanceof SinhVien) {
                listP[i].hien();
            }
        }
        System.out.println();

        System.out.println("----------------------- Danh sach nhan vien --------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s\n",
                "Ho ten", "Dia chi", "Chuc vu", "Luong");
        for (int i = 0; i < count; i++) {
            if (listP[i] instanceof NhanVien) {
                listP[i].hien();
            }
        }
        System.out.println();

        System.out.println("---------------- Danh sach khach hang ------------------");
        System.out.printf("%-20s %-20s %-20s\n",
                "Ho ten", "Dia chi", "Kieu xe ban");
        for (int i = 0; i < count; i++) {
            if (listP[i] instanceof KhachHang) {
                listP[i].hien();
            }
        }
    }

    public void thayDoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Thay doi thong tin 1 sinh vien\n" +
                "2. Thay doi thong tin 1 nhan vien");
        System.out.print("Lua chon: ");
        int lc = scanner.nextInt();
        People p = timKiem();

        switch (lc){
            case 1:
                if(p instanceof  SinhVien){
                    thayDoiSV((SinhVien) p);
                }
                break;
            case 2:
                if (p instanceof NhanVien) {
                    thayDoiNV((NhanVien) p);
                }
                break;
            default:
                return;
        }
    }

    private void thayDoiSV(SinhVien sv) {
        System.out.println("Thay doi diem mon 1 - chon 0\n" +
                "Thay doi diem mon 2 - chon 1");
        System.out.print("Lua chon: ");
        int lc = scanner.nextInt();
        switch (lc){
            case 0:
                System.out.print("Diem mon 1: ");
                sv.setDiem1(scanner.nextFloat());
                break;
            case 1:
                System.out.print("Diem mon 2: ");
                sv.setDiem2(scanner.nextFloat());
                break;
            default:
                return;
        }
    }

    private void thayDoiNV(NhanVien nv){
        System.out.println("Thay doi luong - chon 0\n" +
                "Thay doi chuc vu - chon 1");
        System.out.print("Lua chon: ");
        int lc = scanner.nextInt();

        switch (lc){
            case 0:
                System.out.print("Luong: ");
                nv.setLuong(scanner.nextFloat());
                break;
            case 1:
                System.out.print("Chuc vu: ");
                nv.setChucVu(scanner.nextLine());
                break;
            default:
                return;
        }
    }

    public People timKiem(){
        System.out.print("Nhap ho ten: ");
        String name = new Scanner(System.in).nextLine();
        for(int i = 0; i < count; i++){
            if(listP[i].getTen().equals(name)){
                return listP[i];
            }
        }
        return null;
    }
}
