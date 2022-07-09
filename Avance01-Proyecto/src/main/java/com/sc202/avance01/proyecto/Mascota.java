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
    public String familia;
    public String raza;
    public String dieta;
    public LocalDate fechaNacimiento;
    public long edad;
    public TipoDeVacuna tipoDeVacuna;
    public Vacuna vacuna;
    public Doctor doctor;
    public Duenno duenno;
    
    public void AsignarEdad()
    {
        String lectura1 = JOptionPane.showInputDialog("Ingrese la fecha de hoy en el formato YYYY-MM-DD");
        String lectura2 = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento de la mascota en el formato YYYY-MM-DD");
        
        
        LocalDate primeraFecha = LocalDate.parse(lectura1, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate segundaFecha = LocalDate.parse(lectura2, DateTimeFormatter.ISO_LOCAL_DATE);
        this.edad = ChronoUnit.YEARS.between(segundaFecha, primeraFecha);
        
    }
    
    public void AsignarVacuna(){
        
        this.vacuna.nombre = JOptionPane.showInputDialog("Ingrese el nombre de la vacuna"); 
        
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
    }
}
