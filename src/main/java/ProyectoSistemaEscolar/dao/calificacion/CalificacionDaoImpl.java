package ProyectoSistemaEscolar.dao.calificacion;

import ProyectoSistemaEscolar.bd.domain.Calificacion;
import ProyectoSistemaEscolar.bd.mappers.CalificacionMapper;
import java.util.ArrayList;

/**
 *
 * @autor ADMINISTRACION
 */
public class CalificacionDaoImpl implements CalificacionDao {

    @Override
    public int crearCalificacion(Calificacion nueva) {
        CalificacionMapper calif = new CalificacionMapper();
        return calif.anadeCalif(nueva);
    }

    @Override
    public boolean modificarCalificacion(Calificacion nuevaCalif) {
        CalificacionMapper calif = new CalificacionMapper();
        return calif.actualizaCalif(nuevaCalif);
    }

    @Override
    public ArrayList<Calificacion> listarCalificacion() {
        CalificacionMapper instance = new CalificacionMapper();
        return instance.listarCalificaciones();
    }
    @Override
    public Calificacion listarCalificacionesId(int idC) {
        CalificacionMapper instance = new CalificacionMapper();
        return instance.listarCalificacionesId(idC);
    }
    
    @Override
    public boolean eliminarCalificacion(int idC){
        CalificacionMapper instance = new CalificacionMapper();
        return instance.eliminarCalificacion(idC);
    }
}
