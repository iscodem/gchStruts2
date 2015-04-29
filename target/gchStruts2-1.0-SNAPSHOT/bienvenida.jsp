<%-- 
    Document   : bienvenida
    Created on : 23/04/2015, 10:39:56 AM
    Author     : Yaddif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido al Sistema</title>
    </head>
    <body>
        <h1>Bienvenid@!</h1>
         <h2><s:property value="usuarioBean.nombre" /></h2>
         
         <br>
         <s:a action="profesorAction">Mantenimiento Profesores</s:a>
    </body>
</html>
