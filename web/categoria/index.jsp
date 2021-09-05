<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.CategoriaController" %>
<%@page import="models.Categoria" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
           List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
           
           for(Categoria cat : categorias){
               out.println(cat.getNombre() + "<br>");
           }
        %>
    </body>
</html>
