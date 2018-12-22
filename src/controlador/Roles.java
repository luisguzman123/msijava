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
 * @author Oliver Acosta
 */
public class Roles {
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
    public void guardar(modelos.Roles objeto){
        try{
            PreparedStatement pst=conex.prepareStatement(
            " INSERT INTO roles "
            +"(descripcion , activo)"+
            "VALUES(?,?)");
            pst.setString(1, objeto.getDescripcion());
            pst.setInt(2, objeto.getActivo());
              
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch  (Exception e){
            JOptionPane.showMessageDialog(null, 
                    "Error al guardar datos en la tabla Roles: "
            + e.getMessage());
        }
    }
//    
//    
    public ArrayList<modelos.Roles>dameTodo(){
        ArrayList<modelos.Roles> datos = new ArrayList<>();
        try{
            String sql="SELECT id_rol, descripcion , activo "// colocar espacio antes de la camillas dobles
                    + " FROM roles ";
        Statement pst= conex.createStatement();
        ResultSet rs= pst.executeQuery(sql);
        while(rs.next()){
        datos.add(new modelos.Roles(rs.getInt(1),rs.getString(2).trim(),rs.getInt(3)));
      
        }
    
    }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error a leer los datos de la tabla: "+ex.getMessage());
                }
    
      return datos;
    }
}
