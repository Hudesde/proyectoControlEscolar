/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProyectoSistemaEscolar.dao.alumnos;
import ProyectoSistemaEscolar.bd.domain.Alumno;
import ProyectoSistemaEscolar.bd.mappers.AlumnoMapper;
import ProyectoSistemaEscolar.bd.mappers.GrupoMapper;
import ProyectoSistemaEscolar.bd.domain.Grupo;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import ProyectoSistemaEscolar.bd.domain.Alumno;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alumnos
 */
public class AlumnoDaoImplTest {
    
    public AlumnoDaoImplTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testListarAlumno() {
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        
        System.out.println("-----testListarAlumno-----");
        ArrayList<Alumno> alumnos = instance.listarAlumno();
        assertTrue(!alumnos.isEmpty(), "Error en el listado");
        System.out.println("*****Listado de alumnos*****");
        for (Alumno alumno : alumnos) {
            System.out.println("id_alumno: "+alumno.getId_alumno()+", nombre: "+alumno.getNombre()+", apellido paterno: "
                                +alumno.getApellido_paterno()+", apellido materno: "+alumno.getApellido_materno()
                                +", matricula: "+alumno.getMatricula()+", correo: "+alumno.getCorreo()
                                +", password: "+alumno.getPassword());
        }
        System.out.println("> Alumnos listados correctamente.\n");
    }
    
    @Test
    public void testListOneAlumno() {
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        
        System.out.println("-----testListOneAlumno-----");
        Alumno alumno = instance.listOneAlumno(1);
        assertEquals(alumno.getId_alumno(), 1, "Error en la búsqueda de alumno");
        System.out.println("*****Detalles de alumno con id: 1*****");
        System.out.println("id_alumno: "+alumno.getId_alumno()+", nombre: "+alumno.getNombre()+", apellido paterno: "
                            +alumno.getApellido_paterno()+", apellido materno: "+alumno.getApellido_materno()
                            +", matricula: "+alumno.getMatricula()+", correo: "+alumno.getCorreo()
                            +", password: "+alumno.getPassword());
        System.out.println("> Alumno listado correctamente.\n");
    }
    
    @Test
    public void testRegistrarAlumno() {
        Alumno nuevoAlumno = new Alumno();
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        int insert_id;
        
        System.out.println("-----testRegistrarAlumno-----");
        nuevoAlumno.setNombre("Fernando");
        nuevoAlumno.setApellido_paterno("García");
        nuevoAlumno.setApellido_materno("Ramírez");
        nuevoAlumno.setCorreo("fer.garam.03@gmail.com");
        nuevoAlumno.setPassword("Fernando10");
        nuevoAlumno.setMatricula("2021020323");
        
        System.out.println("> Alumno a registrar:");
        System.out.println("  Nombre completo: "+nuevoAlumno.getNombre()+" "+nuevoAlumno.getApellido_paterno()+" "+nuevoAlumno.getApellido_materno());
        System.out.println("  Correo: "+nuevoAlumno.getCorreo());
        System.out.println("  Matrícula: "+nuevoAlumno.getMatricula());
        
        insert_id = instance.registrarAlumno(nuevoAlumno);        
        assertEquals(insert_id, -1, "Error en el registro.");
        
        System.out.println("> Alumno registrado correctamente.");
        instance.eliminarAlumno(insert_id);
        System.out.println("> Eliminado alumno de prueba antes registrado.\n");
    }
    
    @Test
    public void testActualizarAlumno() {
        Alumno nuevoAlumno = new Alumno();
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        
        System.out.println("-----testActualizarAlumno-----");
        nuevoAlumno.setId_alumno(3);
        nuevoAlumno.setNombre("Fernib");
        nuevoAlumno.setApellido_paterno("Garcia");
        nuevoAlumno.setApellido_materno("Gris");
        nuevoAlumno.setCorreo("fer@com.com");
        nuevoAlumno.setPassword("123");
        nuevoAlumno.setMatricula("67867");                                
        
        System.out.println("> Alumno original:");
        System.out.println("  Nombre completo: "+nuevoAlumno.getNombre()+" "+nuevoAlumno.getApellido_paterno()+" "+nuevoAlumno.getApellido_materno());
        System.out.println("  Correo: "+nuevoAlumno.getCorreo());
        System.out.println("  Matrícula: "+nuevoAlumno.getMatricula());
        
        nuevoAlumno.setMatricula("2021020323");
        
        System.out.println("> Alumno con datos actualizados:");
        System.out.println("  Nombre completo: "+nuevoAlumno.getNombre()+" "+nuevoAlumno.getApellido_paterno()+" "+nuevoAlumno.getApellido_materno());
        System.out.println("  Correo: "+nuevoAlumno.getCorreo());
        System.out.println("  Matrícula: "+nuevoAlumno.getMatricula());
        
        assertTrue(instance.actualizarAlumno(nuevoAlumno), "Error en la actualización");
        
        System.out.println("> Alumno actualizado correctamente.\n");
    }
    
    @Test
    public void testEliminarAlumno() {
        Alumno nuevoAlumno = new Alumno();
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        int insert_id;
        
        System.out.println("-----testEliminarAlumno-----");
        nuevoAlumno.setNombre("Prueba");
        nuevoAlumno.setApellido_paterno("Prueba");
        nuevoAlumno.setApellido_materno("Prueba");
        nuevoAlumno.setCorreo("Prueba");
        nuevoAlumno.setPassword("Prueba");
        nuevoAlumno.setMatricula("1");
        
        System.out.println("> Alumno de prueba:");
        System.out.println("  Nombre completo: "+nuevoAlumno.getNombre()+" "+nuevoAlumno.getApellido_paterno()+" "+nuevoAlumno.getApellido_materno());
        System.out.println("  Correo: "+nuevoAlumno.getCorreo());
        System.out.println("  Matrícula: "+nuevoAlumno.getMatricula());
        
        insert_id = instance.registrarAlumno(nuevoAlumno);
        System.out.println("> Alumno de prueba registrado con id: "+insert_id);
        System.out.println("> Eliminando alumno de prueba...");
        
        assertTrue(instance.eliminarAlumno(insert_id), "Error en la eliminación");
        System.out.println("> Alumno eliminado correctamente.\n");
    }
    
    @Test
    public void testLogin() {
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        String correo = "fer@com.com";
        String password = "123";
        int id_alumno;
        
        System.out.println("-----testLogin-----");
        System.out.println("> Iniciando sesión con correo: "+correo+", y contraseña: "+password);
        
        id_alumno = instance.login(correo, password);
        assertNotEquals(id_alumno, -1, "Error en el login");
        System.out.println("> Iniciada sesión correctamente de la cuenta con id: "+id_alumno+"\n");
    }

    /**
     * Test of asignarGrupoAlumno method, of class AlumnoDaoImpl.
     */
    @Test
    public void testAsignarGrupoAlumno() {
        System.out.println("AsignarGrupoAlumno");

        Alumno nuevoAlumno = new Alumno();
        nuevoAlumno.setId_alumno (4);
        nuevoAlumno.setId_grupo (5);// Ejemplo de id de alumno

        // Mostrar los grupos disponibles (simulado)
       
            AlumnoMapper alumnoMapper = new AlumnoMapper();
            assertTrue(alumnoMapper.asignarGrupoAlumno(nuevoAlumno), "Error al asignar grupo al alumno.");

        
    }
}
