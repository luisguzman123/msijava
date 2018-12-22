/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Medina
 */
public class Proveedor {

    private Connection conex = new conexion.Postgre().getConexion();

    public void guardar(modelos.proveedor objeto) {
        try {
            PreparedStatement pst = conex.prepareStatement(
                    " INSERT INTO proveedores(\n"
                    + " nombre, ruc, telefono, correo, direccion, estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?)");
//            pst.setInt(1, objeto.getId_proveedor());
            pst.setString(1, objeto.getNombre());
            pst.setString(2, objeto.getRuc());
            pst.setString(3, objeto.getTelefono());
            pst.setString(4, objeto.getCorreo());
            pst.setString(5, objeto.getDireccion());
            pst.setInt(6, objeto.getEstado());
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error al guardar datos en la tabla proveedores: "
                    + e.getMessage());
        }
    }
//    
//    

    public ArrayList<modelos.proveedor> dameTodo() {
        ArrayList<modelos.proveedor> datos = new ArrayList<>();
        try {
            String sql = "SELECT id_proveedores, nombre, ruc, telefono, correo, direccion, estado\n"
                    + "	FROM proveedores ";
            Statement pst = conex.createStatement();
            ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                datos.add(new modelos.proveedor(rs.getInt(1), rs.getString(2).trim(), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getInt(7)));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla: " + ex.getMessage());
        }

        return datos;
    }
}
