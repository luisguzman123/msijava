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
import modelos.subcategoria;
import modelos.vendedores;

/**
 *
 * @author Luis Guzman
 */
public class Vendedor {
    private Connection conex= new conexion.Postgre().getConexion();
     public void guardar(modelos.vendedores objeto){
        try{
            PreparedStatement pst=conex.prepareStatement(
            " INSERT INTO vendedores "
            +"(nombre, apellido ,cedula, id_sucursal, activo)"+
            "VALUES(?,?,?,?,?)");
            pst.setString(1, objeto.getNombre());
            pst.setString(2, objeto.getApellido());
            pst.setInt(3, objeto.getCedula());
            pst.setInt(4, objeto.getId_sucursal());
            pst.setInt(5, objeto.getEstado());
              
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch  (Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar datos en la tabla vendedores: "
            + e.getMessage());
        }
    }
//    
//    
    public ArrayList<modelos.vendedores>dameTodo(){
        ArrayList<modelos.vendedores> datos = new ArrayList<>();
        try{
            String sql="SELECT id_vendedor, nombre, apellido, cedula,"
                    + "id_sucursal, activo "// colocar espacio antes de la camillas dobles
                    + " FROM vendedores ";
        Statement pst= conex.createStatement();
        ResultSet rs= pst.executeQuery(sql);
        while(rs.next()){
        datos.add(new vendedores(rs.getInt(1), rs.getString(2).trim(),
                rs.getString(3).trim(), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
      
        }
    
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla vendedores: "+ex.getMessage());
                }
    
      return datos;
    }
}
