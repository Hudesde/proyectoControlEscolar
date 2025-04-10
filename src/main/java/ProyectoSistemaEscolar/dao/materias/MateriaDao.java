package ProyectoSistemaEscolar.dao.materias;

public class MateriaDao {
    private int id_materia;
    private String nombre;
    private int id_alumno;
    private int id_grupo;
    private int id_calificacion;
    private int calificacion;
    private int id_profesor;

    public MateriaDao() {
        id_materia = 0;
        nombre = "";
        id_alumno = 0;
        id_grupo = 0;
        id_calificacion = 0;
        calificacion = 0;
        id_profesor = 0;
    }

    // Getters y Setters
    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public int getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }
}
