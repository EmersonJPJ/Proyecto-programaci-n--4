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
    Reporte reporte = new Reporte();
    
    public void AplicarVacuna(){
        
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
    
        public void Reporte()
        {
            JOptionPane.showMessageDialog(null,"Fecha de aplicacion de la vacuna: "+reporte.GetFechaAplicacion()
            +"\nNombre de la vacuna: "+reporte.GetNombreVacuna()
            +"\nNombre del doctor que aplico la vacuna: "+reporte.GetNombreDoctor()
            +"\nNombre del duenno de la mascota: "+reporte.getNombreDuenno()
            +"\nNombre de la mascota: "+reporte.getNombreMascota()
            +"\nEdad de la mascota: "+reporte.getEdadMascota()
            +"\nDireccion del duenno de la mascota"+reporte.getDireccionDuenno());
            
        }
        public void Ejecutar(){
            Reporte reporte = new Reporte();
            Duenno duenno = new Duenno();
            Mascota mascota = new Mascota();
            Aplicacion aplicacion = new Aplicacion();
            duenno.InfoDuenno();
            duenno.Residencia();
            mascota.AsignarInformacion();
            mascota.AsignarEdad();
            aplicacion.AplicarVacuna();
}
}
