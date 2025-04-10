package ProyectoSistemaEscolar.dao.grupos;

public class GrupoDao {
    private int id_grupo;
    private String nombre;

    public GrupoDao() {
        id_grupo = 0;
        nombre = "";
    }

    public GrupoDao crearObjeto(int id, String nombre) {
        GrupoDao grupo = new GrupoDao();
        grupo.id_grupo = id;
        grupo.nombre = nombre;
        return grupo;
    }

    // Getters y Setters
    public int getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(int id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
