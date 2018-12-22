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

/**
 *
 * @author Luis Guzman
 */
public class SubCategoria {
    private Connection conex= new conexion.Postgre().getConexion();
     public void guardar(modelos.subcategoria objeto){
        try{
            PreparedStatement pst=conex.prepareStatement(
            " INSERT INTO subcategorias "
            +"(descripcion, id_categoria ,activo)"+
            "VALUES(?,?,?)");
            pst.setString(1, objeto.getDescripcion());
            pst.setInt(2, objeto.getId_categoria());
            pst.setInt(3, objeto.getEstado());
              
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch  (Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar datos en la tabla subcategorias: "
            + e.getMessage());
        }
    }
//    
//    
    public ArrayList<modelos.subcategoria>dameTodo(){
        ArrayList<modelos.subcategoria> datos = new ArrayList<>();
        try{
            String sql="SELECT id_subcategoria, descripcion, id_categoria, activo "// colocar espacio antes de la camillas dobles
                    + " FROM subcategorias ";
        Statement pst= conex.createStatement();
        ResultSet rs= pst.executeQuery(sql);
        while(rs.next()){
        datos.add(new subcategoria(rs.getInt(1), rs.getString(2).trim(),rs.getInt(3), rs.getInt(4)));
      
        }
    
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla subcategorias: "+ex.getMessage());
                }
    
      return datos;
    }
}
