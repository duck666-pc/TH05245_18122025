package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.PhieuGiamGia;
import repostiroy.PhieuGiamGiaRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(value = {"/groups“, ”/voucher-management/groups"})
public class ViewServlet extends HttpServlet {
    private final PhieuGiamGiaRepository repository = new PhieuGiamGiaRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<PhieuGiamGia> pggl = repository.getAll();
            req.setAttribute("pggl", pggl);
            req.getRequestDispatcher("/WEB-INF/views/list-PhieuGiamGia.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

