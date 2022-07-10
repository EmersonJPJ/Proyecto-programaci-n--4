/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.avance01.proyecto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeausthin
 */
public class Aplicacion 
{
    public TipoDeVacuna tipoDeVacuna;
    
    
    public void AplicarVacuna(){
        Reporte reporte = new Reporte();
        Vacuna vacuna = new Vacuna();
        Doctor doctor = new Doctor();
        vacuna.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la vacuna"); 
        reporte.SetNombreVacuna(vacuna.nombre);
        String lectura2 = JOptionPane.showInputDialog("Ingrese el tipo de vacuna:\n1. Ingesta.\n2. Inyeccion.\n3. Otro.");
        
        int tipoVacuna = Integer.parseInt(lectura2);
        if (tipoVacuna == 1)
        {
            this.tipoDeVacuna = TipoDeVacuna.INGESTA;
        }
        if (tipoVacuna == 2)
        {
            this.tipoDeVacuna = TipoDeVacuna.INYECCION;
        }
        else
        {
            this.tipoDeVacuna = TipoDeVacuna.OTRO;
        }
        
        doctor.nombre = JOptionPane.showInputDialog("Ingrese el nombre del doctor que aplica la vacuna"); 
        doctor.apellido = JOptionPane.showInputDialog("Ingrese los apellidos del doctor que aplica la vacuna");
        reporte.SetNombreDoctor(doctor.nombre + doctor.apellido);
        
        String lectura1 = JOptionPane.showInputDialog("Ingrese la fecha de aplicacion de la vacuna en el formato YYYY-MM-DD");
        LocalDate fechaAplicacion = LocalDate.parse(lectura1, DateTimeFormatter.ISO_LOCAL_DATE);
        reporte.SetFechaAplicacion(fechaAplicacion);
    }
}
