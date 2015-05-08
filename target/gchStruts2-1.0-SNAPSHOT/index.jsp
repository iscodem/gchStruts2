<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="sistema.titulo"/> </title>
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
        <h1><s:text name="login.credenciales"/></h1>
        <s:form action="loginAction">
            <s:textfield key="login.usuario" 
                         name="usuarioBean.usuario"/>
            <s:fielderror fieldName="nomUser" />
            <s:password key="login.clave"
                        name="usuarioBean.clave"/>
            <s:fielderror fieldName="claUser" />
            <s:submit value="Ingresar"/>
        </s:form>
        <s:actionerror />
        
        <s:url id="ingles" action="index">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:url id="espanol" action="index">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{ingles}"><s:text name="idioma.ingles"/></s:a>&nbsp;
        <s:a href="%{espanol}"><s:text name="idioma.espanol"/></s:a>
    </body>
</html>
