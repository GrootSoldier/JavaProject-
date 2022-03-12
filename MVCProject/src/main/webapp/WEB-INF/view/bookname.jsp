<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bookname" method="get">
<select name="name">
<%
List<BookEntity> list= (List<BookEntity>)request.getAttribute("booklist");
for(BookEntity be : list ){
%>
<option value="<%=be.getName() %>"><%=be.getName() %></option>
<%} %>
</select>
<input type="submit" value="show">
</form>
</body>
</html>