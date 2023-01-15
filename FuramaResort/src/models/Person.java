package models;

import type.TrinhDo;
import type.ViTri;

public abstract class Person {
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected int soCMND;
    protected int sdt;
    protected String email;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int sdt, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.sdt = sdt;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Họ tên:"+hoTen+"\tNgày sinh:"+ngaySinh+"\tGiới tính:"+gioiTinh+"\tSố CMND:"
                +soCMND+"\tSố Điện Thoại:"+sdt+"\tEmail:";
    }
}
