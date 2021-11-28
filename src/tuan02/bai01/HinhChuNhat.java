package tuan02.bai01;

public class HinhChuNhat {
        private double cDai, cRong;

        public double getcDai() {
            return cDai;
        }

        public void setcDai(double cDai) {
            this.cDai = cDai;
        }

        public double getcRong() {
            return cRong;
        }

        public void setcRong(double cRong) {
            this.cRong = cRong;
        }

        public double chuVi(double a, double b){
            return 2*(a+b);
        }

        public double dienTich(double a, double b){
            return a*b;
        }

        @Override
        public String toString() {
            return "HinhChuNhat {" +
                    "chieu dai = " + cDai +
                    ", chieu rong = " + cRong +
                    ", chu vi = " + chuVi(cDai, cRong) +
                    ", dienTich = " + dienTich(cDai, cRong) +
                    '}';
        }
}
