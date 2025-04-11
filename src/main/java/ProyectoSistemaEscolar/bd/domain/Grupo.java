/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoSistemaEscolar.bd.domain;

/**
 *
 * @author Alumnos
 */


public class Grupo {
    private int id_grupo;
    private String nombre;

    public Grupo() {
        id_grupo = 0;
        nombre = "";
        
    }

    public Grupo crearObjeto(int id, String nombre) {
        Grupo grupo = new Grupo();
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
