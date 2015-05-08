package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import pe.edu.cibertec.gchstruts2.bean.UsuarioBean;

public class LoginAction extends ActionSupport 
    implements SessionAware {

    private UsuarioBean usuarioBean;
    private Map<String, Object> mapSesion;

    @Override
    public void validate() {
        if (usuarioBean!=null && usuarioBean.getUsuario()!=null)
        {
            if (usuarioBean.getUsuario().isEmpty())
            {
                addFieldError("nomUser", getText("usuario.vacio"));
            }
            if (usuarioBean.getClave().isEmpty())
            {
                addFieldError("claUser", getText("clave.vacio"));
            }
            if (usuarioBean.getClave().length()<4)
            {
                addFieldError("claUser", getText("clave.longitud"));
            }
        }
    }
    
    public String execute() throws Exception {
        String abc=null;
        abc.equals("abc");
        
        if (usuarioBean.getUsuario().equalsIgnoreCase("Yaddif")
                && usuarioBean.getClave().equals("12345"))
        {
            usuarioBean.setNombre("Yaddif Medina");
            mapSesion.put("usuarioSesion", usuarioBean);
            return SUCCESS;
        }
        else
        {
            addActionError(getText("usuario.valido"));
            return INPUT;
        }
    }

    public String cerrarSesion()
    {
        mapSesion.remove("usuarioSesion");
        Map<String, Object> mapa = 
                ActionContext.getContext().getSession();
        SessionMap map=(SessionMap)mapa;
        map.invalidate();
        return "input";
    }
    
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        mapSesion = map;
    }

    public Map<String, Object> getMapSesion() {
        return mapSesion;
    }

    public void setMapSesion(Map<String, Object> mapSesion) {
        this.mapSesion = mapSesion;
    }
    
}
