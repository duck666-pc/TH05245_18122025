package model;

public class PhieuGiamGia {
    private int id;
    private int loatPhieuId;
    private String ma;
    private String ten;
    private int soLuong;
    private String loaiGiam;
    private String dieuKienToiThieu;
    private String giaTriToiDa;

    // Constructor mặc định (không làm gì)
    public PhieuGiamGia() {
    }

    // Constructor đầy đủ
    public PhieuGiamGia(int id, int loatPhieuId, String ma, String ten,
                        int soLuong, String loaiGiam, String dieuKienToiThieu,
                        String giaTriToiDa) {
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