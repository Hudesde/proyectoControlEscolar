package ProyectoSistemaEscolar.bd.domain;

/**
 *
 * @author ADMINISTRACION
 */
public class Materia {
        private int id;
    private String nombre;

    public Materia() {
        id = 0;
        nombre = "";
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}