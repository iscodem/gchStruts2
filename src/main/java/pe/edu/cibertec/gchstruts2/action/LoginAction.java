package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.edu.cibertec.gchstruts2.bean.UsuarioBean;

public class LoginAction extends ActionSupport {

    private UsuarioBean usuarioBean;

    @Override
    public void validate() {
        if (usuarioBean.getUsuario().isEmpty())
        {
            addFieldError("nomUser", "Nombre Usuario vacío");
        }
        if (usuarioBean.getClave().isEmpty())
        {
            addFieldError("claUser", "Clave Usuario vacío");
        }
        if (usuarioBean.getClave().length()<4)
        {
            addFieldError("claUser", "Clave debe ser de más "
                    + "de 4 caracteres");
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
            addActionError("Usuario/Clave no válido!");
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
