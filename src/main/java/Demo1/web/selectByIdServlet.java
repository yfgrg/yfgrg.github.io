package Demo1.web;

import Demo1.pojo.Brand;
import Demo1.servlet.BrandServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectByIdServlet")
public class selectByIdServlet extends HttpServlet {
     BrandServlet brandServlet=new BrandServlet();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String id= request.getParameter("id");
        Brand brand=brandServlet.selectById(Integer.parseInt(id));
        request.setAttribute("brand",brand);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
