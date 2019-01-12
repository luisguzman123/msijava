/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Oliver Acosta
 */
public class Marcas {
    public void guardar(ventana.referencial.Referencial ventana){
        if(ventana.getNombre_marca_txt().getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(ventana, "Ingresar el nombre de la marca");
            ventana.getNombre_marca_txt().requestFocus();
            return;
       }
        if(!ventana.getActivo_Marca_cbx().isSelected()){
            if(JOptionPane.showConfirmDialog(ventana, "Estas seguro de guardar conel estado inactivo","Advertencia",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
                return;
                
            }
        }
    }
}
