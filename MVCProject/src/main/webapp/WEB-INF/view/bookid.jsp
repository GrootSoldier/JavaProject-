<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bookid" method="get">
<select name="id">
<%
List<BookEntity> list= (List<BookEntity>)request.getAttribute("booklist");
for(BookEntity be : list ){
%>
<option value="<%=be.getId() %>"><%=be.getId() %></option>
<%} %>
</select>
<input type="submit" value="show">
</form>
</body>
</html>