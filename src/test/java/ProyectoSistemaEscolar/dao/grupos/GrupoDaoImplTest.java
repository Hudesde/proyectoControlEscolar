/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProyectoSistemaEscolar.dao.grupos;

import ProyectoSistemaEscolar.bd.domain.Grupo;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Refut
 */
public class GrupoDaoImplTest {
    
    public GrupoDaoImplTest() {
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
    public void testListarGrupo() {
        GrupoDaoImpl instance = new GrupoDaoImpl();
        ArrayList<Grupo> grupos = instance.listarGrupo();
        System.out.println("*****Listado de grupos*****");
        assertTrue(!grupos.isEmpty(),"Error en el listado");
        for (Grupo grupo : grupos) {
            System.out.println("id_grupo: "+grupo.getId_grupo()+", nombre: "+grupo.getNombre());
        }
        System.out.println();
    }
    
    @Test
    public void testRegistrarGrupo() {
        Grupo nuevoGrupo = new Grupo();
        GrupoDaoImpl instance = new GrupoDaoImpl();
        int insert_id;
        
        nuevoGrupo.setNombre("602-B");
        
        System.out.println("Grupo a registrar:");
        System.out.println("Nombre: " + nuevoGrupo.getNombre());
        
        insert_id = instance.registrarGrupo(nuevoGrupo);
        System.out.println("insert_id: "+insert_id+"\n");
        assertNotEquals(insert_id, -1, "Error en el registro.");
    }
    
    @Test
     public void testModificarGrupo() {
        Grupo nuevoGrupo = new Grupo();
        GrupoDaoImpl instance = new GrupoDaoImpl();
        
        nuevoGrupo.setId_grupo(2);
        nuevoGrupo.setNombre("Grupo C");
        
        System.out.println("Grupo original:");
        System.out.println("Nombre: " + nuevoGrupo.getNombre());
        
        nuevoGrupo.setNombre("Grupo A");
        
        System.out.println("Grupo actualizado:");
        System.out.println("Nombre: " + nuevoGrupo.getNombre());
        
        assertTrue(instance.modificarGrupo(nuevoGrupo), "Error en la actualización");
    }
    
    @Test
    public void testEliminarGrupo() {
        GrupoDaoImpl instance = new GrupoDaoImpl();
        int idGrupo = 5; // Cambia este valor al id de un grupo que desees eliminar
        
        System.out.println("Grupo a eliminar con id: " + idGrupo);
        
        assertTrue(instance.eliminarGrupo(idGrupo), "Error en la eliminación.");
    }

    /**
     * Test of visualizarPorCarreraGrupo method, of class GrupoDaoImpl.
     */
   @Test
    public void testVisualizarPorCarreraGrupo() {
        GrupoDaoImpl instance = new GrupoDaoImpl();
        String carrera = "3"; // Cambia esto a la carrera que deseas probar
        ArrayList<Grupo> grupos = instance.visualizarPorCarreraGrupo(carrera);
        System.out.println("*****Listado de grupos por carrera*****");
        assertTrue(!grupos.isEmpty(), "Error en el listado por carrera");
        for (Grupo grupo : grupos) {
            System.out.println("id_grupo: " + grupo.getId_grupo() + ", nombre: " + grupo.getNombre());
        }
        System.out.println();
    }

    /**
     * Test of visualizarPorSemestreGrupo method, of class GrupoDaoImpl.
     */
    @Test
    public void testVisualizarPorSemestreGrupo() {
        GrupoDaoImpl instance = new GrupoDaoImpl();
        String semestre = "4"; // Cambia esto al semestre que deseas probar
        ArrayList<Grupo> grupos = instance.visualizarPorSemestreGrupo(semestre);
        System.out.println("*****Listado de grupos por semestre*****");
        assertTrue(!grupos.isEmpty(), "Error en el listado por semestre");
        for (Grupo grupo : grupos) {
            System.out.println("id_grupo: " + grupo.getId_grupo() + ", nombre: " + grupo.getNombre());
        }
        System.out.println();
    }
}
