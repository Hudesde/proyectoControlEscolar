package ProyectoSistemaEscolar.dao.union;

/**
 *
 * @author alber
 */

import ProyectoSistemaEscolar.bd.domain.Union;
import java.util.ArrayList;
public interface UnionDao {
    public ArrayList<Union> listarUniones();
    public ArrayList<Union> listarUnionesProfes(int idP);
    public String listarGrupoProfe(int id);
    
    public int registrarUnion(Union nueva);
    
    
    public boolean actualizarUnion(Union nuevaMateria);
    public boolean eliminarUnion(int id);
    public boolean eliminarUnionTodas(int id);
    
    public ArrayList<Union> listarUnionesIdAlumno(int idA);
    public ArrayList<ArrayList<String>> listarMateriasTodo();
}
