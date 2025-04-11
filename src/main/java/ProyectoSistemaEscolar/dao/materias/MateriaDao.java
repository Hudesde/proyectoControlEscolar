package ProyectoSistemaEscolar.dao.materias;
import ProyectoSistemaEscolar.bd.domain.Materia;

import java.util.ArrayList;

public interface MateriaDao {    
    public ArrayList<Materia> listarMateriasSolo();
    public int registrarMateriaSolo(Materia nueva);
    public boolean actualizarMateriaSolo(Materia nuevaMateria);
    public boolean eliminarMateriaSolo(int id);
}
