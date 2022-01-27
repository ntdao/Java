package tuan05_06.bai02_QLPhongHoc;

import java.util.Comparator;

abstract class DienTichComparator implements Comparator<PhongHoc> {
    public int compareTo(PhongHoc p1, PhongHoc p2) {
        if(p1.getDienTich() == p2.getDienTich()){
            return 0;
        }else if(p1.getDienTich() > p2.getDienTich()){
            return 1;
        }else{
            return -1;
        }
    }
}
