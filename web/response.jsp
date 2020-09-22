<%-- 
    Document   : response.jsp
    Created on : 21-sep-2020, 18:08:52
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello</h1>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        Nombre:
        <jsp:getProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="ano" />
        Ano de ingreso
        <jsp:getProperty name="mybean" property="ano" />
        <jsp:setProperty name="mybean" property="fechadenacimiento" />
        fecha de nacimiento
        <jsp:getProperty name="mybean" property="fechadenacimiento" />
        <jsp:setProperty name="mybean" property="semestre" />
        semestre
        <jsp:getProperty name="mybean" property="semestre" />
        
     
        
    </body>
     
</html>
