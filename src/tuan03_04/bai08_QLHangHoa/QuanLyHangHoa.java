package tuan03_04.bai08_QLHangHoa;

import java.util.Scanner;

public class QuanLyHangHoa {
    private HangHoa[] arrHangHoa;
    private int n;
    private static int count;

    public QuanLyHangHoa(int n) {
        this.n = n;
        arrHangHoa = new HangHoa[n];
    }

    // Kiểm tra mã hàng có bị trùng không
    public boolean checkMaHang(String maHang1){
        for (int i = 0; i < count; i++)
            if (arrHangHoa[i].getMaHang().equalsIgnoreCase(maHang1))
                return false;
        return true;
    }

    public void them(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Hàng thực phẩm\n" +
                            "2. Hàng điện máy\n" +
                            "3. Hàng sành sứ\n");
        System.out.print("Lựa chọn: ");
        int temp = sc.nextInt();
        if(count < n) {
            switch (temp) {
                case 1:
                    themHang(1);
                    break;
                case 2:
                    themHang(2);
                    break;
                case 3:
                    themHang(3);
                    break;
                default:
                    return;
            }
        }else{
            System.out.println("Bộ nhớ đầy, không thể thêm!");
        }
    }

    public void themHang(int temp){
        HangHoa hangHoa;
        switch (temp){
            case 1:
                hangHoa = new HangThucPham();
                break;
            case 2:
                hangHoa = new HangDienMay();
                break;
            case 3:
                hangHoa = new HangSanhSu();
                break;
            default:
                return;
        }
        do{
            hangHoa.nhap();
            if(! checkMaHang(hangHoa.getMaHang())){
                System.out.println("Mã hàng bị trùng. Nhập lại thông tin hàng hóa");
            }
        } while(! checkMaHang(hangHoa.getMaHang()));
        arrHangHoa[count] = hangHoa;
        count++;
    }

    public void hien(){
        for(int i = 0; i < count ; i++){
            System.out.println(arrHangHoa[i]);
        }
    }
}
