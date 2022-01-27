package tuan03_04.bai07_QLHocVien;

import java.util.Scanner;

public class QuanLy {
    private Person[] listP;
    private int n;
    private static int count;

    public QuanLy(int n) {
        this.n = n;
        listP = new Person[n];
    }

//    public Person taoPerson(int temp){
//        switch (temp){
//            case 1:
//                count++;
//                return new Student();
//            case 2:
//                count++;
//                return new Employee();
//            case 3:
//                count++;
//                return new Customer();
//            default:
//                return null;
//        }
//    }

    public void them(){
        System.out.printf("1. Them 1 sinh vien\n" +
                            "2. Them 1 nhan vien\n" +
                            "3. Them 1 khach hang\n");
        System.out.print("Lua chon: ");
        int temp = new Scanner(System.in).nextInt();
        if(count < n){
            switch (temp){
                case 1:
                    Person person1 = new Student();
                    person1.nhap();
                    listP[count] = person1;
                    count++;
                    break;
                case 2:
                    Person person2 = new Employee();
                    person2.nhap();
                    listP[count] = person2;
                    count++;
                    break;
                case 3:
                    Person person3 = new Customer();
                    person3.nhap();
                    listP[count] = person3;
                    count++;
                    break;
                default:
                    return;
            }
        }else{
            n = (int) (1.5 * n);
        }
    }

    public void xoa(){
        System.out.print("Nhap ho ten cua nguoi can xoa: ");
        String name = new Scanner(System.in).nextLine();
        int j = 0;
        for(int i = 0; i < count; i++){
            if(!(listP[i].getHoTen().equals(name))){
                listP[j] = listP[i];
                j++;
            }
        }
        count = j;
    }

    public void sapXep(){
        for(int i = 0; i < count - 1; i++){
            for(int j = i + 1; j < count; j++){
                if(listP[i].getHoTen().compareTo(listP[j].getHoTen()) > 0){
                    Person temp = listP[i];
                    listP[i] = listP[j];
                    listP[j] = temp;
                }
            }
        }
    }

    public void hien(){
        System.out.println("-------------------------------------- Danh sach sinh vien ---------------------------------------");
        System.out.printf("%-20s %-20s %-15s %-15s %-15s %-20s\n",
                "Ho ten", "Dia chi", "Diem mon 1", "Diem mon 2", "Diem TB", "Danh gia");
        for(int i = 0; i < count; i++){
            if(listP[i] instanceof Student){
                listP[i].hien();
            }
        }
        System.out.println();

        System.out.println("------------------------------------------- Danh sach cong nhan ---------------------------------------------");
        System.out.printf("%-20s %-20s %-15s %-20s %-20s %-20s\n",
                "Ho ten", "Dia chi", "He so luong", "So ngay lam viec", "Luong", "Danh gia");
        for(int i = 0; i < count; i++){
            if(listP[i] instanceof Employee){
                listP[i].hien();
            }
        }
        System.out.println();

        System.out.println("------------------------------------ Danh sach khach hang ------------------------------------");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n",
                "Ho ten", "Dia chi", "Ten cong ty", "Tri gia hoa don", "Danh gia");
        for(int i = 0; i < count; i++){
            if(listP[i] instanceof Customer){
                listP[i].hien();
            }
        }
    }
}
