<%-- 
    Document   : agecalculator
    Created on : 01-Oct-2021, 5:25:12 PM
    Author     : AponTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
    <body>
        <h1>Age Calculator</h1>
        
        <form method ="POST" action="age">
        <label>Enter your age:</label>
        <input type="text" name="age"> 
        <br>
        
        <input type="submit" value="Age next birthday">
        <br>
        </form>
        
        <p>${message} ${nextAge}</p>
        <a href="/Lab03_SimpleServlet/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
