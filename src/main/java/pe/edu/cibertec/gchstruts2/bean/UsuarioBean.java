package pe.edu.cibertec.gchstruts2.bean;

public class UsuarioBean {

    private int codigo;
    private String nombre;
    private String usuario;
    private String clave;

    public UsuarioBean() {
    }

    public UsuarioBean(int codigo, String nombre, String usuario, String clave) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
