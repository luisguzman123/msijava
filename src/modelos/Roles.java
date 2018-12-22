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
public class Roles {
     private int id_rol;
    private String descripcion;
    private int activo;

    public Roles(String descripcion, int activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Roles() {
    }
    
}
