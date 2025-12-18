package model;

public class PhieuGiamGia {
    public int id;
    public int loatPhieuId;
    public String ma;
    public String ten;
    public int soLuong;
    public String loaiGiam;
    public String dieuKienToiThieu;
    public String giaTriToiDa;

    public PhieuGiamGia() {
        this.id = id;
        this.loatPhieuId = loatPhieuId;
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.loaiGiam = loaiGiam;
        this.dieuKienToiThieu = dieuKienToiThieu;
        this.giaTriToiDa = giaTriToiDa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoatPhieuId() {
        return loatPhieuId;
    }

    public void setLoatPhieuId(int loatPhieuId) {
        this.loatPhieuId = loatPhieuId;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getLoaiGiam() {
        return loaiGiam;
    }

    public void setLoaiGiam(String loaiGiam) {
        this.loaiGiam = loaiGiam;
    }

    public String getDieuKienToiThieu() {
        return dieuKienToiThieu;
    }

    public void setDieuKienToiThieu(String dieuKienToiThieu) {
        this.dieuKienToiThieu = dieuKienToiThieu;
    }

    public String getGiaTriToiDa() {
        return giaTriToiDa;
    }

    public void setGiaTriToiDa(String giaTriToiDa) {
        this.giaTriToiDa = giaTriToiDa;
    }
}
