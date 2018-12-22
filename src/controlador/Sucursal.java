/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliver Acosta
 */
public class Sucursal {
    private Connection conex= new conexion.Postgre().getConexion();
//    public void actualizar(modelos.DescripcionCuota objeto){
//        try{
//            PreparedStatement pst=conex.prepareStatement(
//            " UPDATE descripcion_cuota SET "
//            + "monto_a_pagar = ?,fecha_vencimiento= ?,descripcion= ?,cantidad_cuota= ? "+
//            " WHERE Id_descripcion_cuota=?");
//            pst.setInt(1, objeto.getMonto_pagar());
//             pst.setInt(2, objeto.getFecha_vencimiento());
//              pst.setString(3, objeto.getDescripcion());
//              pst.setInt(4, objeto.getCantidad_cuota());
//              pst.setInt(5, objeto.getId_decripcion_couta());
//              
//            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Actualizado  correctamente");
//        }catch  (Exception e){
//            JOptionPane.showMessageDialog(null, 
//                    "Error al guardar datos en la tabla Desc_Cuota: "
//            + e.getMessage());
//        }
//    }

    
//   
    public void guardar(modelos.Sucursal objeto){
        try{
            PreparedStatement pst=conex.prepareStatement(
            " INSERT INTO sucursales "
            +"(nombre, activo)"+
            "VALUES(?,?)");
            pst.setString(1, objeto.getNombre());
            pst.setInt(2, objeto.getActivo());
              
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch  (Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar datos en la tabla Sucursales: "
            + e.getMessage());
        }
    }
//    
//    
    public ArrayList<modelos.Sucursal>dameTodo(){
        ArrayList<modelos.Sucursal> datos = new ArrayList<>();
        try{
            String sql="SELECT id_sucursal, nombre, activo "// colocar espacio antes de la camillas dobles
                    + " FROM sucursales ";
        Statement pst= conex.createStatement();
        ResultSet rs= pst.executeQuery(sql);
        while(rs.next()){
        datos.add(new modelos.Sucursal(rs.getInt(1), rs.getString(2), rs.getInt(3)));
      
        }
    
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla: "+ex.getMessage());
                }
    
      return datos;
    }
// public ArrayList<modelos.DescripcionCuota>dameTodoPorDescripcion(String valor){
//        ArrayList<modelos.DescripcionCuota> datos = new ArrayList<>();
//        try{
//            String sql="SELECT "// colocar espacio antes de la camillas dobles
//                    + "id_descripcion_cuota,monto_a_pagar,fecha_vencimiento,descripcion,cantidad_cuota "
//                    +"FROM descripcion_cuota"
//                    +" WHERE UPPER (descripcion) LIKE '%"+valor+"%'"
//                    + " ORDER BY id_descripcion_cuota ASC";
//        Statement pst= conex.createStatement();
//        ResultSet rs= pst.executeQuery(sql);
//        while(rs.next()){
//        datos.add(new modelos.DescripcionCuota(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4).trim(),rs.getInt(5)));
//      
//        }
//    
//    }catch(SQLException ex){
//                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla: "+ex.getMessage());
//                }
//    
//      return datos;
//    }
}


