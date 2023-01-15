package models;

import type.KieuThue;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soPhong;

    public House() {
    }

    public House(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String tieuChuanPhong, int soPhong) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soPhong = soPhong;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    @Override
    public String toString() {
        return super.toString()+"\tTiêu chuẩn phòng: "+tieuChuanPhong+"\tSố phòng: "+soPhong;
    }
}
