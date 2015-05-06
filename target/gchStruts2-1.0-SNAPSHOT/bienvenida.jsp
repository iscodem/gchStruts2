<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenid@ .... <s:property value="usuarioBean.nombre"/>
        </h1>
        <br>
        <s:a action="profesorAction">Mantenimiento de Profesores</s:a>
    </body>
</html>
