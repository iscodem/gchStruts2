<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mantenimiento de Profesores</h1>
        <table border="1" align="center" width="50%">
            <tr>
                <th>Código</th>
                <th>Nombre</th>
                <th>Fec.Nacimiento</th>
                <th>Externo?</th>
                <th>Acciones</th>
            </tr>
            <s:iterator value="listaProfes">
            <tr>
                <td><s:property value="codigo" /></td>
                <td><s:property value="nombre" /></td>
                <td><s:property value="fechaNac" /></td>
                <td><s:property value="externo" /></td>
                <td>
                    <s:url action="profesorAction"
                           method="modificar"
                           id="urlMod">
                        <s:param name="profesorActual.codigo"
                                 value="codigo">
                        </s:param>
                    </s:url>
                    <s:a href="%{urlMod}">Mod</s:a>
                    - Eli</td>
            </tr>
            </s:iterator>
        </table>
        <s:a action="profesorAction" method="insertar">Crear Profesor</s:a>
    </body>
</html>
