package models;

import type.KieuThue;

public abstract class Facility {
        protected String tenDichVu;
        protected double dienTichSuDung;
        protected double chiPhiThue;
        protected int soLuongNguoiToiDa;
        protected KieuThue kieuThue;

        public Facility() {
        }

        public Facility(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue) {
                this.tenDichVu = tenDichVu;
                this.dienTichSuDung = dienTichSuDung;
                this.chiPhiThue = chiPhiThue;
                this.soLuongNguoiToiDa = soLuongNguoiToiDa;
                this.kieuThue = kieuThue;
        }

        public String getTenDichVu() {
                return tenDichVu;
        }

        public void setTenDichVu(String tenDichVu) {
                this.tenDichVu = tenDichVu;
        }

        public double getDienTichSuDung() {
                return dienTichSuDung;
        }

        public void setDienTichSuDung(double dienTichSuDung) {
                this.dienTichSuDung = dienTichSuDung;
        }

        public double getChiPhiThue() {
                return chiPhiThue;
        }

        public void setChiPhiThue(double chiPhiThue) {
                this.chiPhiThue = chiPhiThue;
        }

        public int getSoLuongNguoiToiDa() {
                return soLuongNguoiToiDa;
        }

        public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
                this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        }

        public KieuThue getKieuThue() {
                return kieuThue;
        }

        public void setKieuThue(KieuThue kieuThue) {
                this.kieuThue = kieuThue;
        }

        @Override
        public String toString() {
                return "Tên dịch vụ:"+tenDichVu+"\tDiện tích sử dụng:"+dienTichSuDung+"\tChi phí thuê:"
                        +chiPhiThue+"\tSố lượng người tối đa:"+soLuongNguoiToiDa+ "\tKiểu thuê: "+kieuThue;
        }
}
