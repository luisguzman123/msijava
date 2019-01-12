/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;
import modelos.proveedor;

/**
 *
 * @author user
 */
public class Proveedores {
    public void guardar (ventana.referencial.Referencial ventana){
        if (ventana.getTXT_NOMBRE_provee().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ventana, "INGRESA EL NOMBRE DEL PROVEEDOR.");
            ventana.getTXT_NOMBRE_provee().requestFocus();
            return;
        }
        int activo=0;
        if (!ventana.getActivo_proveedor().isSelected()){
           if (JOptionPane.showConfirmDialog(ventana, "DESEA GUARDAR AL PROVEEDOR COMO INACTIVO","VERIFIQUELO",
           JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
            return;
        }
       
        }else {
            activo=1;
        }
        if (ventana.getTXT_RUC_provee().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ventana, "INGRESA EL RUC DEL PROVEEDOR.");
            ventana.getTXT_RUC_provee().requestFocus();
            return;
        }
        if (ventana.getTXT_TELEFONO_provee().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ventana, "INGRESA EL NUMERO TELEFONICO");
            ventana.getTXT_TELEFONO_provee().requestFocus();
            return;
        }
        if (ventana.getTXT_DIRECCION_provee().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ventana, "INGRESA LA DIRECCION.");
            ventana.getTXT_DIRECCION_provee().requestFocus();
            return;
        }
       
        new controlador.Proveedor().guardar(new proveedor(ventana.getTXT_NOMBRE_provee().getText(), ventana.getTXT_RUC_provee().getText(),
                ventana.getTXT_TELEFONO_provee().getText(), ventana.getTXT_CORREO_provee().getText(),ventana.getTXT_DIRECCION_provee().getText(),
                activo));
        
        //validaciones
        
    }
    
}

    
