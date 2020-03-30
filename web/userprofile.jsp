<head>
    <title>BootStrap Of Darkchocolate</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
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
    <div class="container">
            
             <%
               String name1 = session.getAttribute("name1").toString();
               session.setAttribute("name1", name1);
               
               String dept = session.getAttribute("name1").toString();
               session.setAttribute("dept", dept);
               
               String email1 = session.getAttribute("email2").toString();
               session.setAttribute("email2", email1);
                
               String mobile = session.getAttribute("mobile").toString();
               session.setAttribute("mobile",mobile);
            %> 
           
            <div class=".col-xs-3 .col-md-offset-3" style="background-color: black;">
                <div class="panel panel-default panel-info Profile">
                    <div class="panel-heading"> <h3 align=""center">My Profile |  ${name1}</h3></div>
                    <div class="panel-body">
                        <div class="form-horizontal">
                            <form>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">UserName</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" name="firstname" value="${name1}" readonly>
                                    </div>
                                    <div class="form-group">
                                    <label class="col-sm-2 control-label">UserName</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" name="firstname" value="${dept}" readonly>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Email</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" value="${email2}" readonly>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">Mobile Number</label>
                                    <div class="col-sm-4">
                                        <input class="form-control" type="text" value="${mobile}" style="width:200px" readonly >
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
    </div>
         </div>
                                    
       
         
    