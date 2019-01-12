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
 * @author user
 */
public class Marcas {
    private Connection conex = new conexion.Postgre().getConexion();
            
    public void guardar(modelos.marcas objeto){
        try{//5616516516161
            PreparedStatement pst=conex.prepareStatement(
            " INSERT INTO marcas "
            +"(nombre, activo)"+
            "VALUES(?,?)");
            pst.setString(1, objeto.getNombre());
            pst.setInt(2, objeto.getEstado());
              
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch  (Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar datos en la tabla marcas: "
            + e.getMessage());
        }
    }
//    
//    
    public ArrayList<modelos.marcas>dameTodo(){
        ArrayList<modelos.marcas> datos = new ArrayList<>();
        try{
            String sql="SELECT id_marca, nombre, activo "// colocar espacio antes de la camillas dobles
                    + " FROM marcas ";
        Statement pst= conex.createStatement();
        ResultSet rs= pst.executeQuery(sql);
        while(rs.next()){
        datos.add(new modelos.marcas(rs.getInt(1),rs.getString(2).trim(),rs.getInt(3)));
      
        }
    
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla: "+ex.getMessage());
                }
    
      return datos;
    }

}
