/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.avance01.proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeausthin
 */
public class Mascota 
{
    public String nombre;
    public LocalDate fechaNacimiento;
    public long edad;
    Reporte reporte;
    
    public void AsignarEdad()
    {
        String lectura1 = JOptionPane.showInputDialog("Ingrese la fecha de hoy en el formato YYYY-MM-DD");
        String lectura2 = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento de la mascota en el formato YYYY-MM-DD");
        
        
        LocalDate primeraFecha = LocalDate.parse(lectura1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate segundaFecha = LocalDate.parse(lectura2, DateTimeFormatter.ISO_LOCAL_DATE);
        this.edad = ChronoUnit.YEARS.between(segundaFecha, primeraFecha);
        reporte.setEdadMascota(edad);
    }
    
    public void AsignarInformacion()
    {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
        reporte.setNombreMascota(nombre);
    }
    

}
