<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Register Page</h1>
<form:form action="save"    modelAttribute="student">
<form:input path="name"/>
<form:input path="address"/>
<form:input path="phone"/>
<input type="submit" value="Register">
</form:form>

</body>
</html>