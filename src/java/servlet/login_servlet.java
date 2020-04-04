/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Db_package.DBConnection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet(name = "login_servlet", urlPatterns = {"/login_servlet"})
public class login_servlet extends HttpServlet {

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name = request.getParameter("name");
        String email = request.getParameter("email");
         String pass = request.getParameter("pass");
         
        try {
            PreparedStatement ps =DBConnection.getConnection().prepareStatement("select * from registration where username =? and email = ? and password = ?");
            ps.setString(1, name);
             ps.setString(2, email);
            ps.setString(3, pass);
            ResultSet rs = ps.executeQuery();
            
             if(rs.next()){
                String name1 = rs.getString("username"); 
                String email1 = rs.getString("email");
                String dept =rs.getString("Dept");
                String mobile =rs.getString("mobile");
                String passs = rs.getString("password");
               
                
                 HttpSession session = request.getSession();
                session.setAttribute("name1", name1);
                session.setAttribute("dept", dept);
                session.setAttribute("email", email1);
                session.setAttribute("mobile", mobile);
                
                request.getRequestDispatcher("userprofile.jsp").forward(request, response);
                String msg2 = "Login Successfull";
            request.setAttribute("msg",msg2);
                
                
            //request.getRequestDispatcher("loginmsg.jsp").forward(request,response);
                 System.out.println("dj");
             }
        } catch (SQLException ex) {
            Logger.getLogger(login_servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
           
 String error = "Loginin Failed.Please try again.";
            request.setAttribute("errorMsg",error);
            request.getRequestDispatcher("message1.jsp").forward(request,response);

    }


}
