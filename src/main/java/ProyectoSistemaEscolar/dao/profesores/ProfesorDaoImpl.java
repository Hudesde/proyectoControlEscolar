package ProyectoSistemaEscolar.dao.profesores;

/**
 *
 * @author alber
 */
import ProyectoSistemaEscolar.bd.domain.Profesor;
import ProyectoSistemaEscolar.bd.mappers.ProfesorMapper;
import java.util.ArrayList;
public class ProfesorDaoImpl implements ProfesorDao{

    boolean actualizar;
    
    @Override
    public boolean registrarProfesor(Profesor nuevo){
        //Profesor nuevo = new Profesor();
        
        ProfesorMapper profe = new ProfesorMapper();
        
        /*if(profe.registarProfesor(nuevo))
            System.out.println("Nuevo profesor creado correctamente");
        else
            System.out.println("Hubo un fallo");*/
        //System.out.println("Lo que trae el objeto: "+nuevo.getNombres());
        return profe.registarProfesor(nuevo);
    }
    @Override
    public boolean actualizarProfesor(Profesor profeNuevo){
        ProfesorMapper profe = new ProfesorMapper();
        /*if(profe.actualizarProfesor(profeNuevo))
            System.out.println("Actualizacion correcta");
        else
            System.out.println("Hubo un fallo");*/
        return profe.actualizarProfesor(profeNuevo);
    }
    @Override
    public ArrayList<Profesor> listarProfesor(){
        ArrayList<Profesor> profes = new ArrayList<>();
        ProfesorMapper pruebilla = new ProfesorMapper();
        profes = pruebilla.listarProfesor();
        return profes;
    }
    
    @Override
        public String listarProfesorMateriaId(int idP){
        ProfesorMapper pruebilla = new ProfesorMapper();
        return pruebilla.listarProfesorMateriaId(idP);
    }
    
    @Override
    public Profesor listarOneProfesor(int idP){
        ProfesorMapper pruebilla = new ProfesorMapper();
        return pruebilla.listarOneProfesor(idP);
    }
    
    @Override
    public boolean eliminarProfesor(int id){
        ProfesorMapper instance = new ProfesorMapper();
        return instance.eliminarProfesor(id);
    }

    @Override
    public boolean asignarMateriaProfesor(Profesor nuevoProfesor) {
         ProfesorMapper instance = new ProfesorMapper();
        return instance.asignarMateriaProfesor(nuevoProfesor);
    }
}
