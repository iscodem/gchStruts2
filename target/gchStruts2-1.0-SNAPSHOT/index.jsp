<%-- 
    Document   : index
    Created on : 23/04/2015, 10:45:11 AM
    Author     : Yaddif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de GCH en Struts2</title>
    </head>
    <body>
        <h1>Por favor ingrese sus credenciales</h1>
        
        <s:form action="loginAction">
            <s:textfield label="Usuario" name="usuarioBean.usuario"/>
            <s:fielderror fieldName="nomUser"/>
            <s:password label="Clave" name="usuarioBean.clave"/>
            <s:submit value="ingresar"/>
        </s:form>
        <s:actionerror/>
    </body>
</html>
