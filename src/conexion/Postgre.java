/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class Postgre {
    private static Connection conexion;

    public void crearConexion(){
        this.conexion = Conectar();
    }

    public  Connection getConexion() {
        return conexion;
    }
    
    
    
    
    private Connection Conectar(){
        
        String base_de_datos = "jdbc:postgresql://localhost:5434/ventas";  
        String user ="postgres"; 
        String pass = "admin";
        
        Connection conex = null;
        try { 
            Class.forName("org.postgresql.Driver");//uso del driver
            System.out.println("aqui");
            conex = DriverManager.getConnection(base_de_datos,user,pass);
            System.out.println("Conectado a Base de datos");
            
        }catch(Exception exc) { 
            System.out.println("Error: "+exc.getMessage()); 
        }
        
        return conex;
    }
}
