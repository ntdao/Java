package tuan05_06.bai02_QLPhongHoc;

abstract class DayNhaComparator implements Comparable<PhongHoc>{
    //@Override
    public int compareTo(PhongHoc p1, PhongHoc p2) {
        return p1.getDayNha().compareTo(p2.getDayNha());
    }
}
