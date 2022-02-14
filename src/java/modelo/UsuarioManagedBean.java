package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;

@ManagedBean
@ApplicationScoped
public class UsuarioManagedBean {

    private String nombre;

    public UsuarioManagedBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
