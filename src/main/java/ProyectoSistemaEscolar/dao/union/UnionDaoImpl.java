package ProyectoSistemaEscolar.dao.union;

/**
 *
 * @author alber
 */

import ProyectoSistemaEscolar.bd.domain.Materia;
import ProyectoSistemaEscolar.bd.domain.Union;
import ProyectoSistemaEscolar.bd.mappers.UnionMapper;
import java.util.ArrayList;
public class UnionDaoImpl implements UnionDao{
    @Override
    public int registrarUnion(Union nueva){
        UnionMapper uni = new UnionMapper();
        return uni.registarUnion(nueva);
    }

    @Override
    public boolean actualizarUnion(Union nuevaUnion) {
        UnionMapper uni = new UnionMapper();
        return uni.actualizaUnion(nuevaUnion);
    }

    @Override
    public ArrayList<Union> listarUniones() {
        UnionMapper instance = new UnionMapper();
        return instance.listarUniones();
    }
    
    @Override
    public String listarGrupoProfe(int id) {
        UnionMapper instance = new UnionMapper();
        return instance.listarGrupoProfe(id);
    }
    
    @Override
    public ArrayList<Union> listarUnionesProfes(int idP) {
        UnionMapper instance = new UnionMapper();
        return instance.listarUnionesProfes(idP);
    }
    @Override
    public boolean eliminarUnionTodas(int id) {
        UnionMapper instance = new UnionMapper();
        return instance.eliminarUnionTodas(id);
    }
    
    @Override
    public ArrayList<ArrayList<String>> listarMateriasTodo() {
        UnionMapper instance = new UnionMapper();
        return instance.listarMateriasTodo();
    }
    
    @Override
    public ArrayList<Union> listarUnionesIdAlumno(int idA) {
        UnionMapper instance = new UnionMapper();
        return instance.listarUnionesIdAlumno(idA);
    }

    @Override
    public boolean eliminarUnion(int id) {
        UnionMapper instance = new UnionMapper();
        return instance.eliminarUnion(id);
    }
}