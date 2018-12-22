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
public class vendedores {

    private int id_vendedor;
    private String nombre;
    private String apellido;
    private int cedula;
    private int id_sucursal;
    private int estado;

    public vendedores() {
    }

    public vendedores(int id_vendedor, String nombre,
            String apellido, int cedula, int id_sucursal, int estado) {
        this.id_vendedor = id_vendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.id_sucursal = id_sucursal;
        this.estado = estado;
    }

    public vendedores(String nombre, String apellido, int cedula, int id_sucursal, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.id_sucursal = id_sucursal;
        this.estado = estado;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
