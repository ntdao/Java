package tuan02.bai03_Vehicle;

import java.util.Scanner;

public class Vehicle {
        private String name;
        private String loaiXe;
        private int dungTich;
        private float triGia;

        public Vehicle() {
        }

        public Vehicle(String name, String loaiXe, int dungTich, float triGia) {
            this.name = name;
            this.loaiXe = loaiXe;
            this.dungTich = dungTich;
            this.triGia = triGia;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLoaiXe() {
            return loaiXe;
        }

        public void setLoaiXe(String loaiXe) {
            this.loaiXe = loaiXe;
        }

        public int getDungTich() {
            return dungTich;
        }

        public void setDungTich(int dungTich) {
            this.dungTich = dungTich;
        }

        public float getTriGia() {
            return triGia;
        }

        public void setTriGia(float triGia) {
            this.triGia = triGia;
        }

        public double thue(){
            if(dungTich < 100){
                return triGia/100;
            }else if(dungTich < 200){
                return 3*triGia/100;
            }else{
                return 5*triGia/100;
            }
        }

        public void xuat(){
            System.out.printf("%-30s %-20s %12d %20.2f %20.2f\n", this.getName(), this.getLoaiXe(), this.getDungTich(), this.getTriGia(), thue());
        }
    }