<%-- 
    Document   : arithmeticcalculator
    Created on : 01-Oct-2021, 5:39:42 PM
    Author     : AponTran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first_digit" value="${firstDigit}">
            <br>
            <label>Second: </label>
            <input type="text" name="second_digit" value="${secondDigit}">
            <br>
            <input type="submit" name="selectedOperation" value="+">
            <input type="submit" name="selectedOperation" value="-">
            <input type="submit" name="selectedOperation" value="*">
            <input type="submit" name="selectedOperation" value="%">
        </form>
        <p>Result: ${message}</p>
        <a href= "age">Age Calculator</a>
    </body>
</html>
