package repostiroy;

import helper.DbConnector;
import model.PhieuGiamGia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhieuGiamGiaRepository {

    public int update(PhieuGiamGia model) throws Exception {
        String sql = "UPDATE phieu_giam_gia SET loai_phieu_id = ?, ma = ? WHERE id = ?";

        try (Connection conn = DbConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            return pstmt.executeUpdate();
        }
    }


    public PhieuGiamGia getById(Integer id) throws Exception {
        String sql = "SELECT * FROM phieu_giam_gia WHERE id = ?";

        try (Connection conn = DbConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                PhieuGiamGia pgg = new PhieuGiamGia();
                pgg.setId(rs.getInt("id"));
                pgg.setLoatPhieuId(rs.getInt("loai_phieu_id"));
                pgg.setMa(rs.getString("ma"));
                pgg.setTen(rs.getString("ten"));
                pgg.setSoLuong(rs.getInt("so_luong"));
                pgg.setLoaiGiam(rs.getString("loai_giam"));
                pgg.setDieuKienToiThieu(rs.getString("dieu_kieu_toi_thieu"));
                pgg.setGiaTriToiDa(rs.getString("gia_tri_toi_da"));
                return pgg;
            }
        }
        return null;
    }


    public List<PhieuGiamGia> getAll() throws Exception {
        List<PhieuGiamGia> pggl = new ArrayList<>();
        String sql = "SELECT * FROM phieu_giam_gia" ;

        try (Connection conn = DbConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                PhieuGiamGia pgg = new PhieuGiamGia();
                pgg.setId(rs.getInt("id"));
                pgg.setLoatPhieuId(rs.getInt("loai_phieu_id"));
                pgg.setMa(rs.getString("ma"));
                pgg.setTen(rs.getString("ten"));
                pgg.setSoLuong(rs.getInt("so_luong"));
                pgg.setLoaiGiam(rs.getString("loai_giam"));
                pgg.setDieuKienToiThieu(rs.getString("dieu_kieu_toi_thieu"));
                pgg.setGiaTriToiDa(rs.getString("gia_tri_toi_da"));
                PhieuGiamGia phieuGiamGia = new PhieuGiamGia();
                pggl.add(pgg);
            }
        }
        return pggl;
    }

}
