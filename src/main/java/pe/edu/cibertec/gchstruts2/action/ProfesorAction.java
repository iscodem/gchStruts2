
package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pe.edu.cibertec.gchstruts2.bean.ProfesorBean;

public class ProfesorAction extends ActionSupport {
    
    private List<ProfesorBean> listaProfes;
    private ProfesorBean profesorActual;

    public List<ProfesorBean> getListaProfes() {
        return listaProfes;
    }

    public void setListaProfes(List<ProfesorBean> listaProfes) {
        this.listaProfes = listaProfes;
    }
    
    public String execute() throws Exception{
        cargarProfes();
        return SUCCESS;
    }
    
    public String grabar(){
        System.out.println(profesorActual);
        return SUCCESS;
    }
    
    private void cargarProfes(){
        listaProfes=new ArrayList();
        listaProfes.add(new ProfesorBean(1,"PRIMERO",new Date(), true));
        listaProfes.add(new ProfesorBean(2,"SEGUNDO",new Date(), true));
        listaProfes.add(new ProfesorBean(3,"TERCERO",new Date(), true));
    }
}
