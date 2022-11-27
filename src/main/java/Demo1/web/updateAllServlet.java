package Demo1.web;

import Demo1.pojo.Brand;
import Demo1.servlet.BrandServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateAllServlet")
public class updateAllServlet extends HttpServlet {
    BrandServlet brandServlet=new BrandServlet();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Brand brand=new Brand();
        brand.setId(Integer.parseInt(request.getParameter("id")));
        brand.setBrandName(request.getParameter("brandName"));
        brand.setCompanyName(request.getParameter("companyName"));
        brand.setOrdered(Integer.parseInt(request.getParameter("ordered")));
        brand.setDescription(request.getParameter("description"));
        brand.setStatus(Integer.parseInt(request.getParameter("status")));
        brandServlet.updateAll(brand);
        response.sendRedirect("/BrandDemo/selectAllServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
