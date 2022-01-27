package tuan03_04.bai03_QLGiaoDich;

public class QLGD_Array {
    private GiaoDich[] giaoDichs;
    private int n;
    private static int count;
    private int sum1 = 0, sum2 = 0, dem = 0;
    private double sumtien = 0;

    public QLGD_Array(int n) {
        this.n = n;
        giaoDichs = new GiaoDich[n];
    }

    public void nhap(int temp){
        if(count >= n)
            System.out.println("Bo nho day!");
        else {
            if(temp == 1) {
                giaoDichs[count] = new GiaoDichVang();
                GiaoDichVang gdv = new GiaoDichVang();
                gdv.nhap();
                giaoDichs[count] = gdv;
                sum1 += gdv.getSoLuong();
                count++;
            }
            else if(temp == 2){
                giaoDichs[count] = new GiaoDichTienTe();
                GiaoDichTienTe gdtt = new GiaoDichTienTe();
                gdtt.nhap();
                giaoDichs[count] = gdtt;
                sumtien += gdtt.thanhTien();
                sum2 += gdtt.getSoLuong();
                dem++;
                count++;
            }else {
                return;
            }
        }
    }

    public void hienThi(){
        for(int i = 0; i < count; i++){
            System.out.println(giaoDichs[i]);
        }
    }

    public void tongSL(){
        System.out.println("Tong So Luong cua Giao Dich Vang: " + sum1);
        System.out.println("Tong So Luong cua Giao Dich Tien Te:" + sum2);
    }

    public void trungBinh(){
        System.out.println("Trung Binh Thanh Tien Giao Dich Tien Te: " + (sumtien/dem));
    }

    public void giaoDich1ty() {
        int d=0;
        for(int i=0; i< count; i++)
        {
            if(giaoDichs[i].getDonGia()>1000) {
                System.out.println(giaoDichs[i]);
                d++;
            }
        }
        if(d==0)
            System.out.println("Khong co Thong Tin!");
    }
}