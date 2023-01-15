package models;

import type.LoaiKhach;

public class Customer extends Person{
    private String maKhachHang;
    private LoaiKhach loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, int soCMND, int sdt, String email, String maKhachHang) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, sdt, email);
        this.maKhachHang = maKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return super.toString()+"\t Mã khách hàng:"+maKhachHang+"\tLoại khách: "+loaiKhach+"\tĐịa chỉ: "+diaChi;
    }
}
