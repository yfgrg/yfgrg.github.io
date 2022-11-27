package Demo1.web;

import Demo1.pojo.Brand;
import Demo1.servlet.BrandServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
    BrandServlet brandServlet=new BrandServlet();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Brand brand=new Brand();
        brand.setBrandName(request.getParameter("brandName"));
        brand.setCompanyName(request.getParameter("companyName"));
        brand.setOrdered(Integer.parseInt(request.getParameter("ordered")));
        brand.setDescription(request.getParameter("description"));
        brand.setStatus(Integer.parseInt(request.getParameter("status")));
        brandServlet.addData(brand);
        response.sendRedirect("/BrandDemo/selectAllServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
