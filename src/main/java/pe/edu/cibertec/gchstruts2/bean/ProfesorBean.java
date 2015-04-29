
package pe.edu.cibertec.gchstruts2.bean;

import java.util.Date;

public class ProfesorBean {
    int codigo;
    String nombre;
    Date fechaNac;
    boolean externo;

    public ProfesorBean(int codigo, String nombre, Date fechaNac, boolean externo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.externo = externo;
    }

    public ProfesorBean() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isExterno() {
        return externo;
    }

    public void setExterno(boolean externo) {
        this.externo = externo;
    }
    
}
