<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<title>display</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
  font-family: Arial, Helvetica, sans-serif;
 
}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
  color: white;
 
}
.topnav2 {
  overflow: hidden;
  background-color: #344;
  color: white;
 
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Style the content */
.content {
  background-color: #ddd;
  padding: 10px;
  height: 600px; /* Should be removed. Only for demonstration */
}

/* Style the footer */
.footer {
  background-color: #f1f1f1;
  padding: 10px;
}
</style>
</head>
<body>

<div class="topnav">
  <p><a href="/library/home">HOME</a></p>
  <p><a href="/library/add">ADD BOOK</a></p>
 </div>
  <div class="topnav2">
 <h1> <p  align="center" >SOPRA STERIA LIBRARY</p></h1>
  
</div>

<div class="content">
  <table border="1" cellpadding="5" ALIGN="center">
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Author</th>
                <th>Borrow Status</th>
                <th>Borrow </th>
                <th>Return </th>
            </tr>
             
            <c:forEach var="user" items="${libraries}">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.author}" /></td>
                    <td><c:out value="${user.status}" /></td>
                    <td>
                    
                    <a href="/library/borrow/${user.id}">borrow</a>
                    
                    
                    </td>
                    <td><a href="/library/return/${user.id}">return</a></td>
                </tr>
            </c:forEach>
            
            
		
            
        </table>
</div>

<div class="footer">

</div>

</body>
</html>