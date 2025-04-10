package ProyectoSistemaEscolar.dao.alumnos;

public class AlumnoDao {
    private int id_alumno;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int matricula;
    private String correo;
    private String password;

    public AlumnoDao() {
        id_alumno = 0;
        nombre = "";
        apellido_paterno = "";
        apellido_materno = "";
        matricula = 0;
        correo = "";
        password = "";
    }

    // Getters y Setters
    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
