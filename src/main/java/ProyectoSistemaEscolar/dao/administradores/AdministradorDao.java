package ProyectoSistemaEscolar.dao.administrador;

public class AdministradorDao {
    private int id_admin;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String correo;
    private String password;

    public AdministradorDao() {
        id_admin = 0;
        nombres = "";
        apellido_paterno = "";
        apellido_materno = "";
        correo = "";
        password = "";
    }

    // Getters y Setters
    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
