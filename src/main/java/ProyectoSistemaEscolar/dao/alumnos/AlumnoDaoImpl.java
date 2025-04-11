/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSistemaEscolar.dao.alumnos;

import ProyectoSistemaEscolar.bd.domain.Alumno;
import ProyectoSistemaEscolar.bd.mappers.AlumnoMapper;
import java.util.ArrayList;

/**
 *
 * @author Alumnos
 */
public class AlumnoDaoImpl implements AlumnoDao {

    @Override
    public ArrayList<Alumno> listarAlumno() {
        AlumnoMapper instance = new AlumnoMapper();
        return instance.listarAlumno();
    }
    
    @Override
    public Alumno listOneAlumno(int id) {
        AlumnoMapper instance = new AlumnoMapper();
        return instance.listOneAlumno(id);
    }

    @Override
    public int registrarAlumno(Alumno nuevoAlumno) {
        AlumnoMapper instance = new AlumnoMapper();
        return instance.registrarAlumno(nuevoAlumno);
    }

    @Override
    public boolean actualizarAlumno(Alumno nuevoAlumno) {
        AlumnoMapper instance = new AlumnoMapper();
        return instance.actualizarAlumno(nuevoAlumno);
    }

    @Override
    public boolean eliminarAlumno(int id) {
        AlumnoMapper instance = new AlumnoMapper();
        return instance.eliminarAlumno(id);
    }

    @Override
    public int login(String correo, String password) {
        AlumnoMapper instance = new AlumnoMapper();
        return instance.login(correo, password);
    }

    @Override
    public boolean asignarGrupoAlumno(Alumno nuevoAlumno) {
       AlumnoMapper instance = new AlumnoMapper();
        return instance.asignarGrupoAlumno(nuevoAlumno);
    }
    
}
