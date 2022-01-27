package tuan03_04.bai09_QLXe;

import java.util.Scanner;

public abstract class Xe implements IXe{
    private String name;
    private float triGia;

    public Xe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên chủ xe: ");
        setName(sc.nextLine());
        System.out.print("Trị giá: ");
        setTriGia(sc.nextFloat());
    }

    @Override
    public String toString() {
        return "Xe{" +
                "name='" + name + '\'' +
                ", triGia=" + triGia +
                '}';
    }
}
