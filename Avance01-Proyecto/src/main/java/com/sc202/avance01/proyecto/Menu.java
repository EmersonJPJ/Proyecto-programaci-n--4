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
            int opcion = 0;
            
            
            //Estructura de desicion para continuar con el bucle
            if (opcion == 0)
            {
                Mascota mascota = new Mascota();
                mascota.AsignarEdad();
                mascota.AsignarVacuna();

            }
        } while (salir = false);
                
    }
}
