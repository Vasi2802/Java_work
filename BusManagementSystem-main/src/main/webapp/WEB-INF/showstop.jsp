<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="olive">
<h1>Following Stop Created</h1>
<table>
<tr>
<td>
Stop Id 
</td>
<td>
${Id} 
</td>
</tr>
<tr>
<td>
Stop Name
</td>
<td>
${Name} 
</td>
</tr>
<tr>
<td>
<form action="/admin/addingStop">
<input type="submit" value="Create">
</td>
<td>
<form action="">
<input type="submit" value="Cancel">
</td>
</tr>
</table>

</body>
</html>