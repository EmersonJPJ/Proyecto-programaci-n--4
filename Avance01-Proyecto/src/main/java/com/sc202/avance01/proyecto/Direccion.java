/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.avance01.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class Direccion {
    
    public String Canton;
    public String Distrito;
    public String Detalle;

    public Direccion(String Canton) {
        this.Canton = Canton;
    }
    
    
    
    public void residencia(){
        Canton= String.valueOf(JOptionPane.showInputDialog("Ingrese el canton donde vive: "));
        Distrito= String.valueOf(JOptionPane.showInputDialog("Ingrese el distrito donde vive: "));
        Detalle= String.valueOf(JOptionPane.showInputDialog("De detalles de la : "));
}
    
}

