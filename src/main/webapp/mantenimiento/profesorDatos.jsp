
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mantenimiento de profesores</h1>
        <s:form action="profesorAction" method="post">
            <s:textfield label="Nombres" name="profesorActual.nombre" />
            <s:textfield label="Fec. Nacimiento" name="profesorActual.fechaNac" />
            <s:checkbox label="Externo?" name="profesorActual.externo" />
            
            <s:submit value="Grabar" mothod="grabar"/>
        </s:form>
    </body>
</html>
