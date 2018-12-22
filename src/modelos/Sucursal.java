/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author MSI
 */
public class Sucursal {
    private int id_sucursal;
    private String nombre;
    private int activo;

    public Sucursal() {
    }

    public Sucursal(int id_sucursal, String nombre, int activo) {
        this.id_sucursal = id_sucursal;
        this.nombre = nombre;
        this.activo = activo;
    }

    public Sucursal(String nombre, int activo) {
        this.nombre = nombre;
        this.activo = activo;
    }

    public int getId_sucursal() {
        return id_sucursal; //hola mundo
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
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
