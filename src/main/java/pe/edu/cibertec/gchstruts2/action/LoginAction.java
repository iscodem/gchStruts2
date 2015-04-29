package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.edu.cibertec.gchstruts2.bean.UsuarioBean;

/**
 *
 * @author Yaddif
 */
public class LoginAction extends ActionSupport {

    private UsuarioBean usuarioBean;

    @Override
    public void validate(){
        if(usuarioBean.getUsuario().isEmpty()){
            addFieldError("nomUser", "Nombre de usuario vacio...");
        }
        if(usuarioBean.getClave().isEmpty()){
            addFieldError("nomUser", "clave vacio...");
        }
    }
    
    @Override
    public String execute() throws Exception {
        if(usuarioBean.getUsuario().equals("david")&&usuarioBean.getClave().equals("1234")){
            usuarioBean.setNombre("David Porras");
        return SUCCESS;
        }else{
            addActionError("usuario/clave son incorrectos...");
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
