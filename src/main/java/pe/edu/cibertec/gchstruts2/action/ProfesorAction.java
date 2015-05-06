package pe.edu.cibertec.gchstruts2.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import pe.edu.cibertec.gchstruts2.bean.ProfesorBean;

public class ProfesorAction 
        extends ActionSupport 
            implements SessionAware {

    private List<ProfesorBean> listaProfes;
    private ProfesorBean profesorActual;
    private Map<String, Object> sesion;
    
    @Override
    public String execute() throws Exception {
        listaProfes = (List<ProfesorBean>)
                sesion.get("listaProfeSess");
        if (listaProfes==null || 
                listaProfes.size()==0)
            cargarProfes();
        return SUCCESS;
    }
    
    public String insertar()
    {
        profesorActual = new ProfesorBean();
        return "datos";
    }
    
    public String grabar()
    {
        listaProfes = (List<ProfesorBean>)
                sesion.get("listaProfeSess");
        if (profesorActual.getCodigo()==0)
            listaProfes.add(profesorActual);
        else
        {
            for (int i = 0; i < listaProfes.size(); i++) {
                ProfesorBean pb = listaProfes.get(i);
                if (pb.getCodigo()==profesorActual.getCodigo())
                {
                    listaProfes.set(i, profesorActual);
                    break;
                }
            }
        }
        return SUCCESS;
    }
    
    public String modificar(){
        System.out.println("El id es = "+
                profesorActual.getCodigo());
        listaProfes = (List<ProfesorBean>)
                sesion.get("listaProfeSess");
        for (ProfesorBean listaProfe : listaProfes) {
            if (profesorActual.getCodigo() == 
                    listaProfe.getCodigo())
            {
                profesorActual = listaProfe;
                break;
            }
        }
        return "datos";
    }
    
    
    private void cargarProfes()
    {
        listaProfes = new ArrayList<>();
        listaProfes.add(new ProfesorBean(1, "Yaddif Medina", 
                new Date(), true));
        listaProfes.add(new ProfesorBean(2, "Juan Perez", 
                new Date(), false));
        listaProfes.add(new ProfesorBean(3, "Marta Sanchez", 
                new Date(), true));
        sesion.put("listaProfeSess", listaProfes);
    }
    

    public List<ProfesorBean> getListaProfes() {
        return listaProfes;
    }

    public void setListaProfes(List<ProfesorBean> listaProfes) {
        this.listaProfes = listaProfes;
    }

    public ProfesorBean getProfesorActual() {
        return profesorActual;
    }

    public void setProfesorActual(ProfesorBean profesorActual) {
        this.profesorActual = profesorActual;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        sesion = map;
    }
    
}
