package ProyectoSistemaEscolar.dao.calificacion;

import ProyectoSistemaEscolar.bd.domain.Calificacion;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @autor ADMINISTRACION
 */
public class CalificacionDaoImplTest {

    public CalificacionDaoImplTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testCrearCalificacion() {
        System.out.println("RegistrarCalificacion");
        CalificacionDaoImpl instance = new CalificacionDaoImpl();
        Calificacion calificacion = new Calificacion();
        
        calificacion.setParcial1(3);
        calificacion.setParcial2(6);
        calificacion.setParcial3(7);
        calificacion.setOrdinario(8);
        calificacion.setExtra1(9);

        System.out.println("Nueva calificacion creada correctamente");
        System.out.println("Parcial1: " + calificacion.getParcial1());
        System.out.println("Parcial2: " + calificacion.getParcial2());
        System.out.println("Parcial3: " + calificacion.getParcial3());
        System.out.println("Ordinario: " + calificacion.getOrdinario());
        System.out.println("Extra1: " + calificacion.getExtra1());
        
        assertNotEquals(instance.crearCalificacion(calificacion), -1, "Error en el registro.");
    }

    @Test
    public void testModificarCalificacion() {
        System.out.println("modificarCalificacion");
        Calificacion nuevaCalif = new Calificacion();
        CalificacionDaoImpl instance = new CalificacionDaoImpl();

        nuevaCalif.setIdCalificacion(1);
        nuevaCalif.setParcial1(1);
        nuevaCalif.setParcial2(8);
        nuevaCalif.setParcial3(9);
        nuevaCalif.setOrdinario(1);
        nuevaCalif.setExtra1(2);

        System.out.println("Calificacion original:");
        System.out.println("Parcial1: " + nuevaCalif.getParcial1());
        System.out.println("Parcial2: " + nuevaCalif.getParcial2());
        System.out.println("Parcial3: " + nuevaCalif.getParcial3());
        System.out.println("Ordinario: " + nuevaCalif.getOrdinario());
        System.out.println("Extra1: " + nuevaCalif.getExtra1());

        nuevaCalif.setParcial1(1);
        nuevaCalif.setParcial2(8);
        nuevaCalif.setParcial3(9);
        nuevaCalif.setOrdinario(1);
        nuevaCalif.setExtra1(2);

        System.out.println("Calificacion actualizada:");
        System.out.println("Parcial1: " + nuevaCalif.getParcial1());
        System.out.println("Parcial2: " + nuevaCalif.getParcial2());
        System.out.println("Parcial3: " + nuevaCalif.getParcial3());
        System.out.println("Ordinario: " + nuevaCalif.getOrdinario());
        System.out.println("Extra1: " + nuevaCalif.getExtra1());

        assertTrue(instance.modificarCalificacion(nuevaCalif), "Error en la actualización");
    }

    @Test
    public void testListarCalificacion() {
        CalificacionDaoImpl instance = new CalificacionDaoImpl();

        System.out.println("-----testListarCalificacion-----");
        ArrayList<Calificacion> calificaciones = instance.listarCalificacion();
        assertTrue(!calificaciones.isEmpty(), "Error en el listado");
        System.out.println("*****Listado de calificaciones*****");
        for (Calificacion calificacion : calificaciones) {
            System.out.println("id_calificacion: " + calificacion.getIdCalificacion() + ", Parcial1: " + calificacion.getParcial1() + ", Parcial2: " + calificacion.getParcial2() + ", Parcial3: " + calificacion.getParcial3() + ", Ordinario: " + calificacion.getOrdinario() + ", Extra1: " + calificacion.getExtra1());
        }
        System.out.println("> Calificaciones listadas correctamente.\n");
    }
}
 