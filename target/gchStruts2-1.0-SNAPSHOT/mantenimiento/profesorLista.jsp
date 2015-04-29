<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mantenimiento de profesores!</h1>
        <table border="1" align="center" width="50%">
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Fecha de Nacimiento</th>
                <th>Externo</th>
                <th>Acciones</th>
            </tr>
            <tr>
            <s:iterator value="listaProfes">
                <td><s:property value="codigo" /></td>
                <td><s:property value="nombre" /></td>
                <td><s:property value="fechaNac" /></td>
                <td><s:property value="externo" /></td>
                <td>Mod - Eli</td>
            </s:iterator>
            </tr>
        </table>
        
        <s:a action="profesorDatos">Muestra datos</s:a>
    </body>
</html>
