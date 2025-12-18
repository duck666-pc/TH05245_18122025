package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PhieuGiamGia;
import repostiroy.PhieuGiamGiaRepository;

import java.io.IOException;

@WebServlet("/voucher-management/update")
public class UpdateServlet extends HttpServlet {
    private final PhieuGiamGiaRepository repository = new PhieuGiamGiaRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Integer id = Integer.valueOf(req.getParameter("id"));
            Integer loaiPhieuId = Integer.valueOf(req.getParameter("loai_phieu_id"));
            String ma = req.getParameter("ma");
            String ten = req.getParameter("ten");
            Integer soLuong = Integer.valueOf(req.getParameter("so_luong"));

            String loaiGiam = req.getParameter("loai_giam");
            String dieuKienToiThieu = req.getParameter("dieu_kien_toi_thieu");
            String giaTriToiDa = req.getParameter("gia_tri_toi_da");

            PhieuGiamGia pgg = repository.getById(id);

            if (pgg != null) {
                req.setAttribute("pgg", pgg);
                req.getRequestDispatcher("/WEB-INF/views/update-phieuGiamGia.jsp").forward(req, resp);
            } else {
                resp.sendRedirect(req.getContextPath() + "/groups");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect(req.getContextPath() + "/groups");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            PhieuGiamGia pgg = new PhieuGiamGia();
            pgg.setId(Integer.valueOf(req.getParameter("id")));
            pgg.setLoatPhieuId(Integer.valueOf(req.getParameter("loai_phieu_id")));
            pgg.setMa(req.getParameter("ma"));
            pgg.setTen(req.getParameter("ten"));
            pgg.setSoLuong(Integer.valueOf(req.getParameter("so_luong")));
            pgg.setLoaiGiam(req.getParameter("loai_giam"));
            pgg.setDieuKienToiThieu(req.getParameter("dieu_kien_toi_thieu"));
            pgg.setGiaTriToiDa(req.getParameter("gia_tri_toi_da"));

            repository.update(pgg);
            resp.sendRedirect(req.getContextPath() + "/groups");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect(req.getContextPath() + "/groups");
        }
    }
}

