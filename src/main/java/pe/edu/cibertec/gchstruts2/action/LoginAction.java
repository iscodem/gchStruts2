package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.edu.cibertec.gchstruts2.bean.UsuarioBean;

public class LoginAction extends ActionSupport {

    private UsuarioBean usuarioBean;

    @Override
    public void validate() {
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
    
    
    
    public String execute() throws Exception {
        if (usuarioBean.getUsuario().equalsIgnoreCase("Yaddif")
                && usuarioBean.getClave().equals("12345"))
        {
            usuarioBean.setNombre("Yaddif Medina");
            return SUCCESS;
        }
        else
        {
            addActionError(getText("usuario.valido"));
            return INPUT;
        }
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
}
