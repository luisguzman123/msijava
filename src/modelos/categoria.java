/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Oliver Acosta
 */
public class categoria {
    private int id_categoria;
    private String nombre;
    private int activo;

    public categoria(String nombre, int activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    public categoria() {
    }

    public categoria(int id_categoria, String nombre, int activo) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.activo = activo;
    }
    
    

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
    
    
}
