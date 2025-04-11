package ProyectoSistemaEscolar.bd.domain;

/**
 *
 * @author alber
 */
public class Profesor {
    private int id_profesor;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String telefono;
    private String correo;
    private int id_materia;

    public Profesor() {
        id_profesor = 0;
        nombres = "";
        apellido_paterno = "";
        apellido_materno = "";
        telefono = "";
        correo = "";
        id_materia = 1;
    }
    
    public Profesor crearObjeto(int id, String[] datos) {
        Profesor nuevo = new Profesor();
        nuevo.id_profesor = id;
        nuevo.nombres = datos[0];
        nuevo.apellido_paterno = datos[1];
        nuevo.apellido_materno = datos[2];
        nuevo.telefono = datos[3];
        nuevo.correo = datos[4];
        return nuevo;
    }

    // Getters y Setters
    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
    
    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_m) {
        this.id_materia = id_m;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }    
        
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
