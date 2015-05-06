<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles"
          prefix="tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="cabecera">
            <tiles:insertAttribute name="cabecera"/>
        </div>
        <div id="menu">
            <tiles:insertAttribute name="menu"/>
        </div>
        <div id="cuerpo">
            <tiles:insertAttribute name="cuerpo"/>
        </div>
        <div id="pie">
            <tiles:insertAttribute name="pie"/>
        </div>
    </body>
</html>
