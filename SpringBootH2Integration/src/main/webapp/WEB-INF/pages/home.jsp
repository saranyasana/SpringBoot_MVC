<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
    </head>
    <body>
       <table bordercolor="Blue" border="2" width="70%" cellpadding="2"> 
       
   <tr><th>Id</th><th>FName</th><th>LName</th></tr>  
   <c:forEach var="cus" items="${list}">   
   <tr>  
   <td >${cus.id}</td>  
   <td>${cus.firstName}</td>  
    <td>${cus.lastName}</td>  
   </tr>  
   </c:forEach>  
   </table>  
    </body>
    </html>