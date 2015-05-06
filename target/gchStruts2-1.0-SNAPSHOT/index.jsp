<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login al Sistema</title>
        <s:head/>
        <style type="text/css">
            .label {
                font-size: 12px;
                color: blue;
                font-family: arial;
            }
        </style>
    </head>
    <body>
        <h1>Ingrese sus credenciales:</h1>
        <s:form action="loginAction">
            <s:textfield label="Usuario" 
                         name="usuarioBean.usuario"/>
            <s:fielderror fieldName="nomUser" />
            <s:password label="Clave"
                        name="usuarioBean.clave"/>
            <s:fielderror fieldName="claUser" />
            <s:submit value="Ingresar"/>
        </s:form>
        <s:actionerror />
    </body>
</html>
