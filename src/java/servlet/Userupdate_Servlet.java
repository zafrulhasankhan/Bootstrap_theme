/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Db_package.DBConnection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Zafrul Hasan Nasim
 */
@WebServlet(name = "Userupdate_Servlet", urlPatterns = {"/Userupdate_Servlet"})
public class Userupdate_Servlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
         HttpSession session = request.getSession();
         String email = (String) session.getAttribute("email");
         System.out.println(email);
         String name = request.getParameter("name");
        String dept = request.getParameter("dept");
        String mobile = request.getParameter("mobile");
        
        try {
            PreparedStatement ps =DBConnection.getConnection().prepareStatement("update registration set username=?,Dept=?,mobile=? where email=?");
            
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setString(3, mobile);
            ps.setString(4, email);
            ps.executeUpdate();
            
            session.setAttribute("name1", name);
            session.setAttribute("dept", dept);
            session.setAttribute("mobile", mobile);
            String msg="updated Successfully";
            request.setAttribute("msg", msg);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Userupdate_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Userupdate_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("userprofile.jsp").forward(request, response);
    }

  
}
