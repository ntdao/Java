package tuan05_06.bai02_QLPhongHoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QLPhongHoc {
    private List<PhongHoc> listPhongHoc = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QLPhongHoc() {
    }

    public void them(){
        System.out.println("1. Thêm phòng lý thuyết\n" +
                "2. Thêm phòng máy tính\n" +
                "3. Thêm phòng thí nghiệm");
        System.out.print("Lựa chọn: ");
        int temp = sc.nextInt();
        switch (temp) {
            case 1:
                themPhong(1);
                break;
            case 2:
                themPhong(2);
                break;
            case 3:
                themPhong(3);
                break;
            default:
                return;
        }
    }

    public void themPhong(int temp){
        PhongHoc p;
        switch (temp){
            case 1:
                p = new PhongLyThuyet();
                break;
            case 2:
                p = new PhongMayTinh();
                break;
            case 3:
                p = new PhongThiNghiem();
                break;
            default:
                return;
        }
        do{
            p.nhap();
            if(! checkMaPhong(p.getMaPhong())){
                System.out.println("Mã phòng bị trùng. Nhập lại thông tin phòng học: ");
            }
        } while(! checkMaPhong(p.getMaPhong()));
        listPhongHoc.add(p);
    }

    // Kiểm tra mã phòng có bị trùng không
    public boolean checkMaPhong(String maPhong){
        System.out.println(listPhongHoc.size());
        for (int i = 0; i < listPhongHoc.size(); i++)
            if (listPhongHoc.get(i).getMaPhong().equalsIgnoreCase(maPhong))
                return false;
        return true;
    }

    public PhongHoc timKiem(){
        System.out.print("Nhập mã phòng: ");
        sc.nextLine();
        String maPhong = sc.nextLine();
        for(PhongHoc p : listPhongHoc){
            if(p.getMaPhong().equals(maPhong)) {
                return p;
            }
        }
        return null;
    }

    public void hien(){
        for(PhongHoc p : listPhongHoc){
            System.out.println(p);
        }
    }

    public void hienPhongDatChuan(){
        for(PhongHoc p : listPhongHoc){
            if(p.datChuan()) {
                System.out.println(p);
            }
        }
    }

    public void sapXepTheoDayNha(){
        for(int i = 0; i < listPhongHoc.size() - 1; i++){
            for(int  j = i+1; j < listPhongHoc.size(); j++){
                PhongHoc p1 = listPhongHoc.get(i);
                PhongHoc p2 = listPhongHoc.get(j);
                if(p1.getDayNha().compareTo(p2.getDayNha()) > 0){
                    PhongHoc temp = p1;
                    p1 = p2;
                    p2 = temp;
                }
            }
        }
        hien();
    }

    public void sapXepTheoDienTich(){
        Collections.sort(listPhongHoc, new DienTichComparator() {
            @Override
            public int compare(PhongHoc p1, PhongHoc p2) {
                if(p1.getDienTich() == p2.getDienTich()){
                    return 0;
                }else if(p1.getDienTich() > p2.getDienTich()){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        hien();
    }

    public void sapXepTheoSoBongDen(){
        Collections.sort(listPhongHoc, new SoBongDenComparator() {
            @Override
            public int compare(PhongHoc p1, PhongHoc p2) {
                if(p1.getSoDen() == p2.getSoDen()){
                    return 0;
                }else if(p1.getSoDen() > p2.getSoDen()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        hien();
    }

    public void capNhatSoMayTinh(){
        PhongHoc p = timKiem();
        if(p instanceof PhongMayTinh) {
            System.out.print("Số máy tính: ");
            ((PhongMayTinh) p).setSoMayTinh(sc.nextInt());
        }
    }

    public void xoa(){
        PhongHoc p = timKiem();
        System.out.print("Bạn có chắc chắn muốn xóa phòng học không? (Y/N): ");
        String lc = sc.nextLine();
        switch (lc){
            case "Y":
                listPhongHoc.remove(p);
                break;
            case "N":
                break;
            default:
                return;
                }
    }

    public int tongSoPhongHoc(){
      return listPhongHoc.size();
    }

    public void phongHoc60May(){
        for(PhongHoc p : listPhongHoc){
            if(p instanceof PhongMayTinh){
                if(((PhongMayTinh) p).getSoMayTinh() == 60){
                    System.out.println(p);
                }
            }
        }
    }
}
