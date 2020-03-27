<!DOCTYPE html>
<html>

<head>
    <title>BootStrap Of Darkchocolate</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link href="css/navbar.css" rel="stylesheet" type="text/css" >
  <link rel="stylesheet" href="css/registration.css">  

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
                            <a href="login1.jsp" class="nav-link"><i class="fas fa-sign-in-alt"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>Sign In</i></b></h4></button></a>
                        </li>
                        <li class="nav-item">
                            <a href="about.jsp" class="nav-link"><i class="fas fa-users"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>About</i></b></h4></button></a>
                        </li>
                        <li class="nav-item">
                            <a href="logout.jsp" class="nav-link"><i class="fas fa-sign-out-alt"></i><button type="button" style="color: white"  class="btn btn-link mb-1"><h4><b><i>Logout</i></b></h4></button></a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
     <div class="main-wrapper">
         <div class="account-page">
             <br><br><h2 class="account-title text-white" align="center"><b>Register</b></h2>

             <div class="container">
                <div class="account-box">
                    <div class="account-wrapper"><br>
                        <div class="account-logo" align="center">
                            <a href="index.html"><img src="image/logo.png" height="90px" alt=""></a>
                        </div><br>
                        

                        <form action="registration_servlet" method="POST">
                           <div class="form-group custom-mt-form-group">
                               <label class="control-label">Username:  </label><i class="bar"></i><br>
                               <input type="text" name="name" placeholder="Your Name" required=""/>
                           </div>
                             <div class="form-group custom-mt-form-group" align="center>
								
								<label class="control-label">Department Name: </label><i class="bar"></i><br>
                             <input type="text" name="dept" placeholder=" Your Department name" required="" />
							</div>
                           <div class="form-group custom-mt-form-group" align="center>
								
								<label class="control-label">Email: </label><i class="bar"></i><br>
                           <input type="text" name="email" placeholder="Your Email ID" required=""/>
							</div>
                            <div class="form-group custom-mt-form-group" align="center >
                                                                
								<label class="control-label">Mobile Number </label><i class="bar"></i><br>
                            <input type="text" name="mobileno" placeholder="Your Mobile Number" required="" />
							</div>
                            
                            <div class="form-group custom-mt-form-group" align="center><br>
								
								<label class="control-label">Password :</label><i class="bar"></i><br>
                            <input type="password" name="pass" placeholder="PassWord" required="" />
							</div>
                            
                             
                            <div class="form-group text-center custom-mt-form-group">
                                <button class="btn btn-primary btn-block account-btn" type="submit">Register</button>
                            </div>
                            <div class="text-center">
                               
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
</body>

</html>