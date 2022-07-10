/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc202.avance01.proyecto;

import java.time.LocalDate;

/**
 *
 * @author Jeausthin
 */
public class Reporte 
{
    private LocalDate fechaAplicacion;
    private String nombreVacuna;
    private String nombreDoctor;
    private String nombreDuenno;
    private String nombreMascota;
    private String direccionDuenno;
    private long edadMascota;
    
    public void SetFechaAplicacion(LocalDate fechaAplicacion)
    {
        this.fechaAplicacion = fechaAplicacion;
    }
    public LocalDate GetFechaAplicacion()
    {
        return fechaAplicacion;
    }
    public void SetNombreVacuna(String nombreVacuna)
    {
        this.nombreVacuna = nombreVacuna;
    }
    public String GetNombreVacuna()
    {
        return nombreVacuna;
    }
    public void SetNombreDoctor(String nombreDoctor)
    {
        this.nombreDoctor = nombreDoctor;
    }
    public String GetNombreDoctor()
    {
        return nombreDoctor;
    }

    public String getNombreDuenno() {
        return nombreDuenno;
    }

    public void setNombreDuenno(String nombreDuenno) {
        this.nombreDuenno = nombreDuenno;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getDireccionDuenno() {
        return direccionDuenno;
    }

    public void setDireccionDuenno(String direccionDuenno) {
        this.direccionDuenno = direccionDuenno;
    }

    public long getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(long edadMascota) {
        this.edadMascota = edadMascota;
    }
    

}