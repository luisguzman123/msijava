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
 * @author Luis Guzman
 */
public class Categoria {
     private Connection conex= new conexion.Postgre().getConexion();
     public void guardar(modelos.categoria objeto){
        try{
            PreparedStatement pst=conex.prepareStatement(
            " INSERT INTO categorias "
            +"(descripcion, activo)"+
            "VALUES(?,?)");
            pst.setString(1, objeto.getNombre());
            pst.setInt(2, objeto.getActivo());
              
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch  (Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar datos en la tabla categorias: "
            + e.getMessage());
        }
    }
//    
//    
    public ArrayList<modelos.categoria>dameTodo(){
        ArrayList<modelos.categoria> datos = new ArrayList<>();
        try{
            String sql="SELECT id_categoria, descripcion, activo "// colocar espacio antes de la camillas dobles
                    + " FROM categorias ";
        Statement pst= conex.createStatement();
        ResultSet rs= pst.executeQuery(sql);
        while(rs.next()){
        datos.add(new modelos.categoria(rs.getInt(1), rs.getString(2).trim(), rs.getInt(3)));
      
        }
    
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla categorias: "+ex.getMessage());
                }
    
      return datos;
    }
}
