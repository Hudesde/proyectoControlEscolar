/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSistemaEscolar.dao.materias;

/**
 *
 * @author ADMINISTRACION
 */
import ProyectoSistemaEscolar.bd.domain.Materia;
import ProyectoSistemaEscolar.bd.mappers.MateriaMapper;
import java.util.ArrayList;

public class MateriaDaoImpl implements MateriaDao{
    @Override
    public ArrayList<Materia> listarMateriasSolo() {
        MateriaMapper instance = new MateriaMapper();
        return instance.listarMateriasSolo();
    }
    
    @Override
    public int registrarMateriaSolo(Materia nueva){
        MateriaMapper instance = new MateriaMapper();
        return instance.registarMateriaSolo(nueva);
    }
    
    @Override
    public boolean actualizarMateriaSolo(Materia nuevaMateria) {
        MateriaMapper mate = new MateriaMapper();
        return mate.actualizaMateriaSolo(nuevaMateria);
    }
    
    @Override
    public boolean eliminarMateriaSolo(int id) {
        MateriaMapper instance = new MateriaMapper();
        return instance.eliminarMateriaSolo(id);
    }
}
