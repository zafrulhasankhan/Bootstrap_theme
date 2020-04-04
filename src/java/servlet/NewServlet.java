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
@WebServlet(name = "userupdate_servlet", urlPatterns = {"/userupdate_servlet"})
public class userupdate_servlet1 extends HttpServlet {

  @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        String email = (String) session.getAttribute("email");
        String name = request.getParameter("name");
        String dept = request.getParameter("dept");
        
        String mobile = request.getParameter("mobile");
       
        
        try {
            PreparedStatement ps =DBConnection.getConnection().prepareStatement("update registration set username=?, Dept=?, mobile=? where Email='email' ");
            
            ps.setString(1, name);
            ps.setString(2, dept);
            
            ps.setString(3, mobile);
            
           
            ps.executeUpdate();
            System.out.println("i love my country,");
            System.out.println("d,dkmkdm");
            
              String msg ="successfully done";
             request.setAttribute("msg", msg);
             session.setAttribute("name1", name);
            session.setAttribute("dept", dept);
             session.setAttribute("mobile", mobile);
            
             
        } catch (SQLException ex) {
            Logger.getLogger(Userupdate_servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Userupdate_servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        request.getRequestDispatcher("userprofile.jsp").forward(request, response);
    }
}