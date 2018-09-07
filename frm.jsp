<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>



<h1>EMPLOYEES FORM:</h1>
<tr>
<table border="1">
<tr>
<td> FIRSTNAME:</td>
<td><%=request.getParameter("firstname")%></td>
</tr>
<tr>
<td> LASTNAME:</td>
<td><%=request.getParameter("lastname")%></td>
</tr>
<tr>
<td> EMAIL:</td>
<td><%=request.getParameter("email")%></td>
</tr>
<tr>
<td> ADDRESS:</td>
<td><%=request.getParameter("address")%></td>
</tr>
<tr>
<td> GENDER:</td>
<td><%=request.getParameter("gender")%></td>
</tr>
</tr>
</table>



</body>
</html>