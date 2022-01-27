package tuan03_04.bai08_QLHangHoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HangSanhSu extends HangHoa{
    private String nhaSX;
    private Date ngayNhapKho;
    private static final double VAT = 0.1;

    public HangSanhSu() {
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(int day, int month,int year ) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.ngayNhapKho = calendar.getTime();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhà sản xuất: ");
        setNhaSX(sc.nextLine());
        System.out.print("Ngày, tháng, năm nhập kho: ");
        setNgayNhapKho(sc.nextInt(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
    }

    @Override
    public void hien() {

    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str = simpleDateFormat.format(ngayNhapKho);

        return "Hàng sành sứ: " + super.toString() +
                ", Nhà sản xuất: '" + nhaSX + '\'' +
                ", Ngày nhập kho: " + str +
                ", Đánh giá: " + danhGia();
    }

    public long thoiGianLuuKho(){
        Date today = new Date();
        today.getTime();
        long getDiff = today.getTime() - ngayNhapKho.getTime();
        // using TimeUnit class from java.util.concurrent package
        long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);

        return getDaysDiff;
    }


    @Override
    public String danhGia() {
        String s = null;
        if(getSoLuong() > 50 && thoiGianLuuKho() > 10){
            s = "Bán chậm";
        }
        return s;
    }
}
