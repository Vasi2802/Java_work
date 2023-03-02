<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <script>
  alert("Stop Created");
  </script>
 <% out.println("inside");%> 
 <% response.sendRedirect("/admin/addingStop");%> 

</html>