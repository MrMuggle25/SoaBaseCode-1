<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
     <head>
          <meta charset="utf-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
          <meta name="description" content="">
          <meta name="author" content="">
          <link rel="icon" href="../css/AllianceIcon.ico">
          <title>Alliance Training Evaluation System</title>

          <!-- Bootstrap core CSS -->
          <link href="../lib/cssProject/bootstrap.min.css" rel="stylesheet">
          <link href="../lib/jsProject/ie10-viewport-bug-workaround.css" rel="stylesheet">
          <link href="../css/users.css" rel="stylesheet">
          <script src="../lib/jsProject/ie-emulation-modes-warning.js"></script>
     </head>

     <body>

     <header class="header navbar-fixed-top">
          <img src="../css/header_logo.png" class="logo">
     </header>

     <div class="container-fluid">
          <div class="row">
               <div class="col-sm-3 col-md-2 sidebar">
                    <div class="admin">
                         <img src="../css/user.png" class="userPhoto">
                         <p class="userName">Username</p>
                    </div>
                    
                    <ul class="nav nav-sidebar">
                         <hr />
                         <li class="inactive">
                              <a href="Users.html">
                                   <img src="../css/users_icon_black.png" class="icon">
                                   <span class="sidebar-item">Users</span>
                              </a>
                         </li>
                         <li class="active">
                              <a href="training-programs_list.html">
                                   <img src="../css/stopwatch_icon_white.png" class="icon">
                                   <span class="sidebar-item">Training Programs</span>
                                   <span class="sr-only">(current)</span>
                              </a>
                         </li>
                         <li class="inactive">
                              <a href="#">
                                   <img src="../css/calendar_icon_black.png" class="icon">
                                   <span class="sidebar-item">Calendar</span>
                              </a>
                         </li>
                         <hr />
                         <li class="inactive">
                              <a href="#">
                                   <img src="../css/logout_icon_black.png" class="icon">
                                   <span class="sidebar-item">Log Out</span>
                              </a>
                         </li>
                    </ul>
               </div>
          </div>

          <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main navbar">
               <div class="navbar-header">
                    <div id="navbar" class="collapse">
                         <ul class="nav navbar-nav navbar-right">
                              <li class="active"><a href="users_list.html">Programs</a></li>
                         </ul>
                    </div>
               </div>
          </div>
          
          <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
               
          </div>

          <!-- Bootstrap core JavaScript
          ================================================== -->
          <!-- Placed at the end of the document so the pages load faster -->
          <script type="text/javascript">
               
          </script>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
          <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
           <script src="../../lib/jsProject/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../lib/jsProject/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../lib/jsProject/ie10-viewport-bug-workaround.css"></script>

     </body>
</html>