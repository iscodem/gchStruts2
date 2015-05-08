<%@taglib uri="/struts-tags" prefix="s" %>
<header>
    <hgroup>
        <table width="100%">
            <tr>
                <td width="70%" align="left">
<h1><s:text name="bienvenida"/> .... 
    <s:property value="#session.usuarioSesion.nombre"/>
</h1></td>
<td width="30%" align="right">
    <s:a action="loginAction" method="cerrarSesion">
        <s:text name="sesion.cerrar"/></s:a>
</td>
    </tr>
</table>
    </hgroup>
</header>