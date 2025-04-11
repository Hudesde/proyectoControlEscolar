package ProyectoSistemaEscolar.dao.materias;

import ProyectoSistemaEscolar.bd.domain.Materia;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MateriaDaoImplTest {
/*
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRegistrarMateria() {
        System.out.println("Test: registrarMateria");
        Materia nueva = new Materia();
        MateriaDaoImpl instance = new MateriaDaoImpl();
        int insert_id;
        
        nueva.setCalificacion(9);
        nueva.setId_alumno(1);
        nueva.setId_calificacion(1);
        nueva.setId_grupo(1);
        nueva.setId_profesor(1);
        nueva.setNombre("Programacion web");
        
        System.out.println("Nueva Materia creada correctamente:");
        System.out.println("Calificacion: " + nueva.getCalificacion());
        System.out.println("id_alumno: " + nueva.getId_alumno());
        System.out.println("id_calificacion: " + nueva.getId_calificacion());
        System.out.println("id_grupo: " + nueva.getId_grupo());
        System.out.println("id_profesor: " + nueva.getId_profesor());
        System.out.println("nombre: " + nueva.getNombre());
        
        insert_id = instance.registrarMateria(nueva);
        assertEquals(insert_id, -1, "Error en el registro");
        
        System.out.println("Materia registrada correctamente.");
        instance.eliminarMateria(insert_id);
        System.out.println("> Eliminada materia de prueba antes registrada.");
    }

    @Test
    public void testActualizarMateria() {
        System.out.println("Test: actualizarMateria");
        Materia nuevaMateria = new Materia();
        MateriaDaoImpl instance = new MateriaDaoImpl();

        nuevaMateria.setId_materia(1);
        nuevaMateria.setCalificacion(5);
        nuevaMateria.setId_alumno(1);
        nuevaMateria.setId_calificacion(1);
        nuevaMateria.setId_grupo(1);
        nuevaMateria.setId_profesor(1);
        nuevaMateria.setNombre("Ecuaciones diferenciales");

        System.out.println("Materia original:");
        System.out.println("Calificacion: " + nuevaMateria.getCalificacion());
        System.out.println("id_alumno: " + nuevaMateria.getId_alumno());
        System.out.println("id_calificacion: " + nuevaMateria.getId_calificacion());
        System.out.println("id_grupo: " + nuevaMateria.getId_grupo());
        System.out.println("id_profesor: " + nuevaMateria.getId_profesor());
        System.out.println("nombre: " + nuevaMateria.getNombre());

        assertTrue(instance.actualizarMateria(nuevaMateria), "Error al actualizar la materia.");
        System.out.println("Materia actualizada correctamente:");
        System.out.println("Calificacion: " + nuevaMateria.getCalificacion());
        System.out.println("id_alumno: " + nuevaMateria.getId_alumno());
        System.out.println("id_calificacion: " + nuevaMateria.getId_calificacion());
        System.out.println("id_grupo: " + nuevaMateria.getId_grupo());
        System.out.println("id_profesor: " + nuevaMateria.getId_profesor());
        System.out.println("nombre: " + nuevaMateria.getNombre());
    }

    /**
     * Test of listarMaterias method, of class MateriaDaoImpl.
     */
/*    @Test
    public void testListarMaterias() {
        MateriaDaoImpl instance = new MateriaDaoImpl();
        
        System.out.println("-----testListarMaterias-----");
        ArrayList<Materia> materias = instance.listarMaterias();
        assertTrue(!materias.isEmpty(), "Error en el listado");
        System.out.println("*****Listado de materias*****");
        for (Materia materia : materias) {
            System.out.println("id_materia: " + materia.getId_materia()
                               + ", nombre: " + materia.getNombre()
                               + ", id_alumno: " + materia.getId_alumno()
                               + ", id_grupo: " + materia.getId_grupo()
                               + ", id_calificacion: " + materia.getId_calificacion()
                               + ", calificacion: " + materia.getCalificacion()
                               + ", id_profesor: " + materia.getId_profesor());
        }
        System.out.println("> Materias listadas correctamente.\n");
    }

    @Test
    public void testEliminarMateria() {
        Materia nuevaMateria = new Materia();
        MateriaDaoImpl instance = new MateriaDaoImpl();
        int insert_id;
        
        System.out.println("-----testEliminarMateria-----");
        nuevaMateria.setNombre("Prueba Materia");
        nuevaMateria.setId_alumno(1);
        nuevaMateria.setId_grupo(1);
        nuevaMateria.setId_calificacion(1);
        nuevaMateria.setCalificacion(8);
        nuevaMateria.setId_profesor(1);
        
        System.out.println("> Materia de prueba:");
        System.out.println("  Nombre: " + nuevaMateria.getNombre());
        System.out.println("  ID Alumno: " + nuevaMateria.getId_alumno());
        System.out.println("  ID Grupo: " + nuevaMateria.getId_grupo());
        System.out.println("  ID Calificación: " + nuevaMateria.getId_calificacion());
        System.out.println("  Calificación: " + nuevaMateria.getCalificacion());
        System.out.println("  ID Profesor: " + nuevaMateria.getId_profesor());
        
        insert_id = instance.registrarMateria(nuevaMateria);
        System.out.println("> Materia de prueba registrada con id: " + insert_id);
        System.out.println("> Eliminando materia de prueba...");
        
        assertTrue(instance.eliminarMateria(insert_id), "Error en la eliminación");
        System.out.println("> Materia eliminada correctamente.\n");
    }*/
}
