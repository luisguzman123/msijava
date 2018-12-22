/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Jose Medina
 */
public class subcategoria {

    private int id_subcate;
    private String descripcion;
    private int id_categoria;
    private int estado;

    public subcategoria() {
    }

    public subcategoria(int id_subcate, String descripcion, int id_categoria, int estado) {
        this.id_subcate = id_subcate;
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
        this.estado = estado;
    }

    public subcategoria(String descripcion, int id_categoria, int estado) {
        this.descripcion = descripcion;
        this.id_categoria = id_categoria;
        this.estado = estado;
    }

    public int getId_subcate() {
        return id_subcate;
    }

    public void setId_subcate(int id_subcate) {
        this.id_subcate = id_subcate;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
