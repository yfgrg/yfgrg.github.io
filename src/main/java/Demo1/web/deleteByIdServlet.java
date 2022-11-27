package Demo1.web;

import Demo1.servlet.BrandServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteByIdServlet")
public class deleteByIdServlet extends HttpServlet {
    BrandServlet brandServlet=new BrandServlet();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id=request.getParameter("id");
        brandServlet.deleteById(Integer.parseInt(id));
        response.sendRedirect("/BrandDemo/selectAllServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
