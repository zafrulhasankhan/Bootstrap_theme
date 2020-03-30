<!-- 
    Document   : userlist
    Created on : Mar 22, 2020, 11:31:27 PM
    Author     : Zafrul Hasan Nasim
-->

<%@page import="java.util.ArrayList"%>
<%@page import="Db_package.user"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
      <link rel="stylesheet" href="css/userlist.css">
     <style>
           
            
            body
            {
                background-image:url("image/webback3_1.jpeg")
                    
            }
        </style>
    </head>
    <body>
        
        <div class="heading" align="center">
            <h2>See all User</h2>
        </div>
             
             
        
        <div class="table-responsive">
                            <table class="table">
                                <thead class="theading">
                                    <tr >
                                        <th class="hname" style="border: 3px solid red;"><h5>UserName</h5></th>
                                        <th class="hdept" style="border: 3px solid red;"><h5>Department Name</h5></th>
                                        <th class="hemail" style="border: 3px solid red;"><h5>Email</h5></th>
                                        <th class="hmobile" style="border: 3px solid red;"><h5>Mobile Number</h5></th>
                                        
                                        
                                    </tr>
                                </thead><br>
                                <tbody>
        <%
                ArrayList<user> userlist =(ArrayList) request.getAttribute("userlist");
                
                int i = 0;
                for(user u : userlist){
                    i++;
                
        %>
        <tr>
            <td class="bname"><%= u.getName()%></td>
            <td class="bdept"><%= u.getDept()%></td>
        <td class="bemail"><%= u.getEmail()%></td>
        <td class="bmobile"><%= u.getMobile()%></td>
        
        
        
      </tr>  
      <%
      }
      %>
      
    </tbody>
                            
    </table>
        </div>
      <div class="home">
          <a href="index.jsp" style="color: white; align-content: right; "><h5>Home</h5></a>
      </div>
        
    </body>
</html>
