package ProyectoSistemaEscolar.dao.calificacion;

import ProyectoSistemaEscolar.bd.domain.Calificacion;
import java.util.ArrayList;

/**
 *
 * @autor ADMINISTRACION
 */
public interface CalificacionDao {

    public int crearCalificacion(Calificacion nueva);
    public ArrayList<Calificacion> listarCalificacion();
    public Calificacion listarCalificacionesId(int idC);
    
    public boolean modificarCalificacion(Calificacion nuevaCalif);
    public boolean eliminarCalificacion(int idC);
}
