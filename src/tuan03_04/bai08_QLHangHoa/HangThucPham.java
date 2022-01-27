package tuan03_04.bai08_QLHangHoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends HangHoa{
    private Date ngaySX, ngayHH;
    private String nhaCC;
    private static final double VAT = 0.05;

    public HangThucPham() {
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public Date getNgayHH() {
        return ngayHH;
    }

    public String getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(String nhaCC) {
        this.nhaCC = nhaCC;
    }

    //Khởi tạo phương thức để nhập năm tháng ngày sản xuất
    public void setNSX( int day, int month,int year ) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngaySX = calendar.getTime();
    }

    //Khởi tạo phương thức để nhập hạn sử dụng
    public void setNHH(int day, int month,int year ) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayHH = calendar.getTime();
    }

    //khởi tạo hàm kiểm tra ngày hết hạn không được nhỏ hơn ngày sản xuất
    public boolean kiemTraNgay() {
        if (ngayHH.compareTo(ngaySX) > 0) {
            return true;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất");
        }
        return false;
    }

    //khởi tạo phương thức kiểm tra hạn sử dụng của sản phẩm đã hết hạn hay còn hạn
    public boolean kiemTraHSD() {
        Date today = new Date();
        if (this.getNgayHH().compareTo(today) < 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        do {
            System.out.print("Ngày, tháng, năm sản xuất: ");
            setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.print("Ngày, tháng, năm hết hạn: ");
            setNHH(sc.nextInt(), sc.nextInt(), sc.nextInt());
        } while(! kiemTraNgay());
        sc.nextLine();
        System.out.print("Nhà cung cấp: ");
        setNhaCC(sc.nextLine());
    }


    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(ngayHH);
        return "Hàng thực phẩm: " + super.toString() +
                ", Ngày sản xuất: " + str1 +
                ", Ngày hết hạn: " + str2 +
                ", Đánh giá: " + danhGia();
    }

    @Override
    public void hien() {
    }

    @Override
    public String danhGia() {
        String s = null;
        if(getSoLuong() > 0 && kiemTraHSD())
            s = "Khó bán";
        return s;
    }
}
