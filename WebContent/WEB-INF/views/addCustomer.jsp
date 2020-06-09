<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action  ="save_customer" method = "post"> 
Customer Name:<input type ="text" name ="name"/>
Customer lastName: <input type  = "text" name = "lastName"/>
Customer Email: <input type  = "email" name = "email"/>
Customer UserName: <input type ="text"  name ="userName"/>
Customer Password:<input type = "password" name ="password"/>
Customer DOB:<input type  = "date" name ="dob" />
<input type = "submit" value ="Login"/>

</form>
</body>
</html>

