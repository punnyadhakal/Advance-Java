<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration form</title>
</head>
<body>
<form action  ="update_customer" method = "post"> 
Customer Id:<input type ="number" name="id" value="${cus.id}" readonly = "readonly"/>
Customer Name:<input type ="text" name ="name" value ="${cus.name }"/>
Customer lastName: <input type  = "text" name = "lastName" value = "${cus.lastName}"/>
Customer Email: <input type  = "email" name = "email" value ="${cus.email}"/>
Customer UserName: <input type ="text"  name ="userName" value ="${cus.userName}"/>
Customer Password:<input type = "password" name ="password" value ="${cus.password}"/>
Customer DOB:<input type  = "date" name ="dob" value ="${cus.dob}" />
<input type = "submit" value ="Login"/>
</form>

</body>
</html>