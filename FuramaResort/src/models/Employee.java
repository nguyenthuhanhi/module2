package models;

import type.TrinhDo;
import type.ViTri;

public class Employee extends Person{
    private String maNhanVien;
    private TrinhDo trinhDo;
    private ViTri viTri;
    private int luong;

    public Employee() {
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int sdt, String email, String maNhanVien, TrinhDo trinhDo, ViTri viTri, int luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, sdt, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString()+"\tMã nhân viên:"+maNhanVien+"\t Trình Độ:"+trinhDo+"\tVị trí:"+viTri+"\t Lương:"+luong;
    }
}
