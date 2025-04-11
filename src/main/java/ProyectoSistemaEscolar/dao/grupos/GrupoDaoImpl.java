/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSistemaEscolar.dao.grupos;

import ProyectoSistemaEscolar.bd.domain.Alumno;
import ProyectoSistemaEscolar.bd.domain.Grupo;
import ProyectoSistemaEscolar.bd.mappers.GrupoMapper;
import java.util.ArrayList;
/**
 *
 * @author Refut
 */


public class GrupoDaoImpl implements GrupoDao{
    
    @Override
    public int registrarGrupo(Grupo nuevoGrupo){
        GrupoMapper instance = new GrupoMapper();
        return instance.registarGrupo(nuevoGrupo);
    }
    @Override
    public boolean modificarGrupo(Grupo nuevoGrupo){
        GrupoMapper instance = new GrupoMapper();
        return instance.modificarGrupo(nuevoGrupo);
    }
    @Override
    public ArrayList<Grupo> listarGrupo(){
        GrupoMapper instance = new GrupoMapper();
        return instance.listarGrupo();
    }
        
    @Override
    public ArrayList<Alumno> listarAlumnosGrupo(int id){
        GrupoMapper instance = new GrupoMapper();
        return instance.listarAlumnosGrupo(id);
    }
    @Override
    public ArrayList<Grupo> visualizarPorCarreraGrupo(String Something){
        GrupoMapper instance = new GrupoMapper();
        return instance.visualizarPorCarreraGrupo(Something);
    }
    @Override
    public ArrayList<Grupo> visualizarPorSemestreGrupo(String Something){
        GrupoMapper instance = new GrupoMapper();
        return instance.visualizarPorSemestreGrupo(Something);
    }
    @Override
    public boolean eliminarGrupo(int id){
        GrupoMapper instance = new GrupoMapper();
        return instance.eliminarGrupo(id);
    }
    
}
