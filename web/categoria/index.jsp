<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de categoria</h1>
        
        <table>
            <thead>
                <tr>
                    <th>Cod</th>
                    <th>Categoria</th>
                    <th>Descripcion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${categorias}" var="cat">
                <tr>
                    <td>${cat.idCategoria}</td>
                    <td>${cat.nombre}</td>
                    <td>${cat.descripcion}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
