
package ProyectoSistemaEscolar.dao.profesores;

import ProyectoSistemaEscolar.bd.domain.Profesor;
import java.util.ArrayList;

/**
 *
 * @author alber
 */
public interface ProfesorDao {
    public boolean registrarProfesor(Profesor nuevoProfe);
    
    public boolean actualizarProfesor(Profesor nuevoProfe);
    public boolean asignarMateriaProfesor(Profesor nuevoProfesor);
    public ArrayList<Profesor> listarProfesor();
    public String listarProfesorMateriaId(int idP);
    public Profesor listarOneProfesor(int idP);
    
    public boolean eliminarProfesor(int id);
}
