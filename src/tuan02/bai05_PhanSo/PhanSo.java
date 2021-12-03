package tuan02.bai05_PhanSo;

public class PhanSo {
    private int tuSo, mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    public void inPS(){
        if(tuSo == 0){
            System.out.println("0");
        }else if(tuSo == mauSo){
            System.out.println("1");
        } else{
            System.out.println(tuSo + "/" + mauSo);
        }
    }
}
