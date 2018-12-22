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
    
    
}
