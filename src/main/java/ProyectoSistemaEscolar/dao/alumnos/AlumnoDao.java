package ProyectoSistemaEscolar.dao.alumnos;

import ProyectoSistemaEscolar.bd.domain.Alumno;
import java.util.ArrayList;

/**
 *
 * @author FerGaram
 */
public interface AlumnoDao {
    public ArrayList<Alumno> listarAlumno();
    public Alumno listOneAlumno(int id);
    public int registrarAlumno(Alumno nuevoAlumno);
    public boolean actualizarAlumno(Alumno nuevoAlumno);
    public boolean asignarGrupoAlumno(Alumno nuevoAlumno);
    public boolean eliminarAlumno(int id);
    public int login(String correo, String password);
}     