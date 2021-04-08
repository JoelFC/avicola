/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Admin
 */
public class Departamento {
    private int id;
    private String nombre;
    private String responsable;

    public Departamento() {
    }

    public Departamento(int id, String nombre, String responsable) {
        this.id = id;
        this.nombre = nombre;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    
    public String toString(){
        return String.format("%s",nombre);
    }
    
}
