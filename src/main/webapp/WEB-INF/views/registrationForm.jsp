<html>
<head>
<title>BORAJI.COM</title>
</head>
<body>
  <h1>User Registration Form</h1>
  <hr />
  <form method="post" action="display" modelAttribute="login">
     <table>
        <tr>
           <td>First Name</td>
           <td><input type="text" name="firstName" /></td>
        </tr>
        <tr>
           <td>Last Name</td>
           <td><input type="text" name="latName" /></td>
        </tr>
        <tr>
           <td>Username</td>
           <td><input type="text" name="username" /></td>
        </tr>
        <tr>
           <td>Password</td>
           <td><input type="Password" name="password" /></td>
        </tr>
        <tr>
           <td>Email</td>
           <td><input type="email" name="email" /></td>
        </tr>
        <tr>
           <td></td>
           <td><input type="submit" value="Submit"></td>
        </tr>
     </table>
  </form>
</body>
</html>