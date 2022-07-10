/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.avance01.proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeausthin
 */
public class Duenno 
{
    public String Nombre;
    public String Apellidos;
    public int Cedula;
    public int Edad;
    Reporte reporte = new Reporte();
    
    public void InfoDuenno(){
        Nombre=String.valueOf(JOptionPane.showInputDialog("Ingrese el nombre del duenno de la mascota: "));
        Apellidos=String.valueOf(JOptionPane.showInputDialog("Ingrese los apellidos del duenno de la mascota: "));
        Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del duenno de la mascota: "));
        Cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del duenno de la mascota: "));
        reporte.setNombreDuenno(Nombre);

    }
    public void Residencia(){
        Direccion direccion = new Direccion();
        direccion.Canton= JOptionPane.showInputDialog("Ingrese el canton donde vive: ");
        direccion.Distrito= JOptionPane.showInputDialog("Ingrese el distrito donde vive: ");
        direccion.Detalle= JOptionPane.showInputDialog("De detalles de la : ");
        reporte.setDireccionDuenno(direccion.Canton + direccion.Distrito + direccion.Detalle);
}
      
    }  

