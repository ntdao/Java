package tuan05_06.bai02_QLPhongHoc;

import java.util.Comparator;

abstract class SoBongDenComparator implements Comparator<PhongHoc> {
    public int compareTo(PhongHoc p1, PhongHoc p2) {
        if(p1.getSoDen() == p2.getSoDen()){
            return 0;
        }else if(p1.getSoDen() > p2.getSoDen()){
            return 1;
        }else{
            return -1;
        }
    }
}
