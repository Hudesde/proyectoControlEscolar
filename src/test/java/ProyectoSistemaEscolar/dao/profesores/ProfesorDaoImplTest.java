package ProyectoSistemaEscolar.dao.profesores;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alber
 */
import ProyectoSistemaEscolar.bd.domain.Profesor;
import ProyectoSistemaEscolar.bd.mappers.ProfesorMapper;
import java.util.ArrayList;
public class ProfesorDaoImplTest {
    
    public ProfesorDaoImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registrarProfesor method, of class ProfesorDaoImpl.
     */
    @Test
    public void testRegistrarProfesor() {
        ArrayList<Profesor> profes = new ArrayList<>();
        System.out.println("RegistrarProfesor");
        ProfesorDaoImpl instance = new ProfesorDaoImpl();
        Profesor profesor = new Profesor();
        
        profesor.setNombres("Moisses");
        profesor.setApellido_materno("Martinez");
        profesor.setApellido_paterno("Sanchez");
        profesor.setTelefono("953288817");
        profesor.setCorreo("moiki@gmail.com");
        
        assertTrue(instance.registrarProfesor(profesor));
        System.out.println("Nuevo profesor creado correctamenteHola");
        profes = instance.listarProfesor();
        System.out.println("*****Listado de profesores*****");
        for (Profesor prof : profes) {
            System.out.println("Id: "+prof.getId_profesor()+" Nombre: "+prof.getNombres());
        }
    }

    /**
     * Test of actualizarProfesor method, of class ProfesorDaoImpl.
     */
    @Test
    public void testEliminarProfesor() {
        ProfesorDaoImpl instance = new ProfesorDaoImpl();
        int idProfesor = 3; // Cambia este valor al id de un grupo que desees eliminar
        
        System.out.println("Profesor a eliminar con id: " + idProfesor);
        
        assertTrue(instance.eliminarProfesor(idProfesor), "Error en la eliminación.");
    }
    @Test
    public void testActualizarProfesor() {
        Profesor nuevoProfesor = new Profesor();
        ProfesorDaoImpl instance = new ProfesorDaoImpl();
        int id_profesor = 5;
        
        nuevoProfesor.setId_profesor(id_profesor);
        nuevoProfesor.setNombres("Ramon");
        nuevoProfesor.setApellido_paterno("Aragon");
        nuevoProfesor.setApellido_materno("Toledo");
        nuevoProfesor.setTelefono("95981273");
        nuevoProfesor.setCorreo("aatr010423@gs.utm.mx");
        
        System.out.println("Profesor actualizado:");
        System.out.println("Nombre: " + nuevoProfesor.getNombres());
        
        assertTrue(instance.actualizarProfesor(nuevoProfesor), "Error en la actualización");
    }

    /**
     * Test of listarProfesor method, of class ProfesorDaoImpl.
     */
    @Test
    public void testListarProfesor() {
        ArrayList<Profesor> profes = new ArrayList<>();
        System.out.println("ListarProfesor");
        ProfesorDaoImpl instance = new ProfesorDaoImpl();
        profes = instance.listarProfesor();
        assertTrue(!profes.isEmpty());
        System.out.println("Profes listados correctamente");
        System.out.println("*****Listado de profesores*****");
        for (Profesor prof : profes) {
            System.out.println("Id: "+prof.getId_profesor()+"   Nombre: "+prof.getNombres()
            +"   ,Apellido Paterno: "+prof.getApellido_paterno()+"   ,Apellido Materno: "+prof.getApellido_materno()+"  ,Correo: "+prof.getCorreo()
            +"   ,Telefono: "+prof.getTelefono());
        }
    }
    @Test
    public void testAsignarMateriaProfesor() {
        System.out.println("AsignarGrupoAlumno");

        Profesor nuevoProfesor = new Profesor();
        nuevoProfesor.setId_profesor (4);
        nuevoProfesor.setId_materia (1);// Ejemplo de id de alumno

        // Mostrar los grupos disponibles (simulado)
       
            ProfesorMapper alumnoMapper = new ProfesorMapper();
            assertTrue(alumnoMapper.asignarMateriaProfesor(nuevoProfesor), "Error al asignar grupo al alumno.");

        
    }
   
    
}
