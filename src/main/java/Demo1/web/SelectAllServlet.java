package Demo1.web;

import Demo1.pojo.Brand;
import Demo1.servlet.BrandServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    BrandServlet brandServlet=new BrandServlet();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Brand> brandList= brandServlet.SelectAll();
       request.setAttribute("brandList",brandList);
       request.getRequestDispatcher("/brand.jsp").forward(request,response);
//        response.sendRedirect("/brand.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
