<%-- 
    Document   : index.jsp
    Created on : 21-sep-2020, 18:09:34
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
        <h1>Entry form</h1> 
        <form name="Name Input Form" action="response.jsp">
            Escriba su nombre:
            <input type="text" name="name"  value=""/>
            <input type="submit" value="OK" />
       <br><br>
            Escriba el ano de ingresooooo
            <input type="text" name="ano"  value=""/>
            <input type="submit" value="OK" />
          <br><br>
            Escriba la fecha de nacimiento
            <input type="text" name="fechadenacimiento"  value=""/>
            <input type="submit" value="OK" />
            <br><br>
            Escriba el semestre en el que ingreso 
             <input type="text" name="semestre"  value=""/>
            <input type="submit" value="OK" />
            
        </form>
    </body>
</html>

