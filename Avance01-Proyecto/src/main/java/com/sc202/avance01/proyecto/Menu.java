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
public class Menu
{
    public void menu()
    {
        boolean salir = false;
        
        //Si salir es igual a false abandona el bucle while
        do
        {    //Declarar variable en 0 para iniciar el bucle escogiendo un numero
            String lectura = JOptionPane.showInputDialog("Menu.\n1. Mantenimiento.\n2. Reporte.\n3. Salir.");
            int opcion = Integer.parseInt(lectura);
            
            
            //Estructura de desicion para continuar con el bucle
            if (opcion == 1)
            {
                Duenno duenno = new Duenno();
                Mascota mascota = new Mascota();
                Aplicacion aplicacion = new Aplicacion();
                duenno.InfoDuenno();
                duenno.Residencia();
                mascota.AsignarInformacion();
                mascota.AsignarEdad();
                aplicacion.AplicarVacuna();
            }
            if (opcion == 2)
            {
                
            }
            if (opcion == 3)
            {
                salir = true;
            }
        } while (salir = false);
                
    }
}
