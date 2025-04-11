package ProyectoSistemaEscolar.bd.domain;

/**
 *
 * @autor ADMINISTRACION
 */
public class Calificacion {

    private int id_calificacion;
    private int parcial1;
    private int parcial2;
    private int parcial3;
    private int ordinario;
    private int extra1;

    public Calificacion() {
        id_calificacion = 0;
        parcial1 = 0;
        parcial2 = 0;
        parcial3 = 0;
        ordinario = 0;
        extra1 = 0;
    }

    public Calificacion crearObjeto(int id, int parcial1, int parcial2, int parcial3, int ordinario, int extra1) {
        Calificacion calif = new Calificacion();
        calif.id_calificacion = id;
        calif.parcial1 = parcial1;
        calif.parcial2 = parcial2;
        calif.parcial3 = parcial3;
        calif.ordinario = ordinario;
        calif.extra1 = extra1;
        return calif;
    }

    // Getters y Setters
    public int getIdCalificacion() {
        return id_calificacion;
    }

    public void setIdCalificacion(int id_calificacion) {
        this.id_calificacion = id_calificacion;
    }

    public int getParcial1() {
        return parcial1;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public int getParcial2() {
        return parcial2;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public int getParcial3() {
        return parcial3;
    }

    public void setParcial3(int parcial3) {
        this.parcial3 = parcial3;
    }

    public int getOrdinario() {
        return ordinario;
    }

    public void setOrdinario(int ordinario) {
        this.ordinario = ordinario;
    }

    public int getExtra1() {
        return extra1;
    }

    public void setExtra1(int extra1) {
        this.extra1 = extra1;
    }
}
