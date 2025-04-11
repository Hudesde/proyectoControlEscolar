package ProyectoSistemaEscolar.bd.domain;

/**
 *
 * @author alber
 */
public class Union {
    private int id;
    private int id_profesor;
    private int id_alumno;
    private int id_calificacion;

    public Union() {
        id = 0;
        id_profesor = 0;
        id_alumno = 0;
        id_calificacion = 0;
    }

    // Getters y Setters
    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_pr) {
        this.id_profesor = id_pr;
    }

    public int getId() {
        return id;
    }

    public void setId(int idN) {
        this.id = idN;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_calificacion() {
        return id_calificacion;
    }

    public void setId_calificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
    }
}