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
    public String Residencia;
    
    
    
    public void nom(){
      Nombre=String.valueOf(JOptionPane.showInputDialog("Ingrese el nombre: "));
      Apellidos=String.valueOf(JOptionPane.showInputDialog("Ingrese los apellidos: "));
      Residencia=String.valueOf(JOptionPane.showInputDialog("Ingrese su lugar de vivienda: "));
    }
    public void num(){
      Cedula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula: "));
      Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
    }
      
    }  

