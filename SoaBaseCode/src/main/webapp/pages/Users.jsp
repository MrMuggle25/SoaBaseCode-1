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
                         <li class="active">
                              <a href="Users.html">
                                   <img src="../css/users_icon_white.png" class="icon">
                                   <span class="sidebar-item">Users</span>
                                   <span class="sr-only">(current)</span>
                              </a>
                         </li>
                         <li class="inactive">
                              <a href="../training-programs_list.html">
                                   <img src="../css/stopwatch_icon_black.png" class="icon">
                                   <span class="sidebar-item">Training Programs</span>
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
                              <li class="active"><a href="Users.html">Users</a></li>
                         </ul>
                    </div>
               </div>
          </div>
          
          <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
               <div class="table-responsive">
                    <table class="table table-striped" id="table">
                         <thead>
                              <tr>
                                   <th>User Id</th>
                                   <th>Name</th>
                                   <th>Gender</th>
                                   <th>Employer</th>
                                   <th>Job Title</th>
                                   <th>Business Group</th>
                                   <th>Unit Head</th>
                                   <th>Email</th>
                                   <th>Contact</th>
                              </tr>
                         </thead>
                         <form action="${pageContext.request.contextPath}/modulename/mylist" method="GET">
                         <tbody id="tableBody">
                              <tr id="userLayout0" class="userTableRow">
                                   <td id="userID0">userId</td>
                                   <td id="userName0">LastName, FirstName MI</td>
                                   <td id="userGender0">[M/F]</td>
                                   <td id="userEmployer0">Employer</td>
                                   <td id="userJobTitle0">JobTitle</td>
                                   <td id="userBusinessGroup0">BusinessGroup</td>
                                   <td id="userUnitHead0">UHead</td>
                                   <td id="userEmail0">Email</td>
                                   <td id="userContact0">Contact</td>
                                   <td class="icons-td">
                                        <img class="edit icon" src="../css/edit.png" onmouseover="this.src='../css/edit_red.png'" onmouseout="this.src='../css/edit.png'">
                                        <img class="delete icon" src="../css/delete.png" onmouseover="this.src='../css/delete_red.png'" onmouseout="this.src='../css/delete.png'">
            
                                   </td>
                              </tr>
                              
                              <button class="add-user-button" onclick="addUser()">Add User</button>
                         </tbody>
                    </table>
               </div>
          </div>

          <!-- Bootstrap core JavaScript
          ================================================== -->
          <!-- Placed at the end of the document so the pages load faster -->
          <script type="text/javascript">
               function addUser() {
                    var userId = 1;
                    var user = document.getElementById("userLayout0");
                    var userClone = user.cloneNode(true);
                    var tb = document.getElementById("tableBody");
                    userClone.id = userId;
                    userId = userId + 1;

                    tb.append(userClone);
               }
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
