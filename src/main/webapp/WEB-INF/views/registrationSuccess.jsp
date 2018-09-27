<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>

<html>
<head>
<%@ page isELIgnored="false"%>
</head>
<body>
   <h2>Submitted Employee Information</h2>
   <table>
       <tr>
           <td>FirstName :</td>
           <td>${firstname}</td>
       </tr>
         <tr>
                   <td>LastName :</td>
                   <td>${lastname}</td>
               </tr>
                 <tr>
                           <td>Username :</td>
                           <td>${username}</td>
                       </tr>
                         <tr>
                                   <td>Password :</td>
                                   <td>${password}</td>
                               </tr>
       <tr>
           <td>Email:</td>
           <td>${email}</td>
       </tr>
   </table>
</body>