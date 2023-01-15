package models;

import type.KieuThue;

public class Room extends Facility{
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, KieuThue kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return super.toString()+"\tDịch vụ miễn phí đi kèm: "+dichVuMienPhiDiKem;
    }
}
