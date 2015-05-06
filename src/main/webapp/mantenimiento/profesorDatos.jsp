<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="/struts-dojo-tags" prefix="sd" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <s:head />
        <sd:head />
    </head>
    <body>
        <h1>Mantenimiento de Profesores</h1>
        <s:form action="profesorAction" method="post">
            <s:textfield label="Nombre" 
                         name="profesorActual.nombre"/>
            <!--s:textfield label="Fec.Nacimiento" 
                         name="profesorActual.fechaNac"/-->
            <sd:datetimepicker 
                name="profesorActual.fechaNac"
                label="Fec.Nacimiento" 
                displayFormat="dd/MM/yyyy"
                />

            <s:checkbox label="Externo?" 
                        name="profesorActual.externo"/>
            <s:submit value="Grabar" method="grabar" />
            &nbsp;&nbsp;&nbsp;
            <s:submit value="Regresar" />
            <s:hidden name="profesorActual.codigo"/>
        </s:form>
    </body>
</html>
