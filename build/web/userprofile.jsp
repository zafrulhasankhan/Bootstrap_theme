<head>
    
    <title>BootStrap Of Darkchocolate</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/userprofile.css">
   <style>
           
            
            body
            {
                background-image:url("image/webback3_1.jpeg")
            }
        </style>
</head>

<body>
    <header>
            <!-- ======================================Navigation Bar================================================= -->
            <nav class="navbar navbar-expand-lg navStyle">
                
                <div class="collapse navbar-collapse" id="mainMenu">
                    <ul class="navbar-nav ml-auto navList">
                        <li class="nav-item active"><a href="index.jsp" class="nav-link"><i class="fas fa-align-right"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>Home</i></b></h4></button><span class="sr-only">(current)</span></a></li>
                       
                        <li class="nav-item">
                            <a href="search.jsp" class="nav-link"><i class="fas fa-search"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>Search</i></b></h4></button></a>
                        </li>
                        <li class="nav-item">
                            <a href="login.jsp" class="nav-link"><i class="fas fa-sign-in-alt"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>Sign In</i></b></h4></button></a>
                        </li>
                        <li class="nav-item">
                            <a href="userList_servlet" class="nav-link"><i class="fas fa-users"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i> UserList</i></b></h4></button></a>
                        </li>
                        <li class="nav-item">
                            <a href="logout.jsp" class="nav-link"><i class="fas fa-sign-out-alt"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>Logout</i></b></h4></button></a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
    
            
             <%
               String name1 = session.getAttribute("name1").toString();
               session.setAttribute("name1", name1);
               
               String dept = session.getAttribute("dept").toString();
               session.setAttribute("dept", dept);
               
               String email1 = session.getAttribute("email2").toString();
               session.setAttribute("email2", email1);
                
               String mobile = session.getAttribute("mobile").toString();
               session.setAttribute("mobile",mobile);
            %> 
           
            <br><div class="panel-heading" align="center"> <h3 style="color:white;">  profile  of ${name1}</h3></div>
            <div class="container">
                    
                <br>
                                <div class="form">
                                    <div class="name">
                                         <h5 style="color:white;"> Username : </h5>
                                        <input class="form-control" type="text" name="firstname" value="${name1}" style="width:280px; text-align: center; color: #0000ff" readonly>
                                    </div><br>
                                    
                                        
                                   
                                        <div class="dept">
                                        <h5 style="color:white;"> Department name : </h5>
                                        <input class="form-control" type="text" name="firstname" value="${dept}" style="width:280px; text-align: center;color: #0000ff" readonly>
                                    </div><br>
                              
                                
                                    
                                    <div class="email">
                                        <h5 style="color:white;"> Email : </h5>
                                        <input class="form-control" type="text" value="${email2}" style="width:280px; text-align: center;color: #0000ff" readonly>
                                    </div><br>
                               
                                
                                       <div class="mobile">
                                        <h5 style="color:white;">Mobile Number</h5>
                                        <input class="form-control" type="text" value="${mobile}" style="width:280px; text-align: center; color: #0000ff" readonly >
                                    </div>
                                
                                </div>
                                    <div class="vl"></div>
                                    <div class="profile-image">
                                        <img class="avatar" src="image/user.jpg" alt=""></a>
                                        <input type="file" id="img" name="img" accept="image/yes.png">
                                        
                                    </div>
                                    <div>
                                        <h5> &emsp; ${name1} </h5>
                                        <h5>Dept. of ${dept} </h5>
                                    </div>
                        </div>
                    
                
              </body>
    </html>