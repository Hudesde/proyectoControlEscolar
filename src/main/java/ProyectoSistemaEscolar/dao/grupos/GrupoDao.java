/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoSistemaEscolar.dao.grupos;
 
import ProyectoSistemaEscolar.bd.domain.Alumno;
import ProyectoSistemaEscolar.bd.domain.Grupo;
import java.util.ArrayList;

/**
 *
 * @author Alumnos
 */
public interface GrupoDao {
    
    public int registrarGrupo(Grupo nuevoGrupo);
    
    public boolean modificarGrupo(Grupo nuevoGrupo);
    
    public ArrayList<Grupo> listarGrupo();
    public ArrayList<Alumno> listarAlumnosGrupo(int id);
    
    public ArrayList<Grupo> visualizarPorCarreraGrupo(String carrera);
    public ArrayList<Grupo> visualizarPorSemestreGrupo(String semestre);

    public boolean eliminarGrupo(int id);
    
}
