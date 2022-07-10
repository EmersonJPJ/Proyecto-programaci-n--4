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
        boolean continuar = true;
        Aplicacion aplicacion = new Aplicacion();
        //Si salir es igual a false abandona el bucle while
        do
        {    //Declarar variable en 0 para iniciar el bucle escogiendo un numero
            String lectura = JOptionPane.showInputDialog("Menu.\n1. Mantenimiento.\n2. Reporte.\n3. Salir.");
            int opcion = Integer.parseInt(lectura);
            
            
            //Estructura de desicion para continuar con el bucle
            if (opcion == 1)
            {

                aplicacion.Ejecutar();
            }
            if (opcion == 2)
            {
                aplicacion.Reporte();
            }
            if (opcion == 3)
            {
                continuar = false;
            }
        } while (continuar = true);
                
    }
}
