
package com.mycompany.parcialprorrateof;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ClsPrincipal {
    
    public static void main(String[] args) {
  
  ClsMatrix M = new ClsMatrix();
  ClsIngresarP in = new ClsIngresarP();
     Scanner Lee = new Scanner(System.in);
     
     
     
    
    
     
     in.setNombre("Cemento  ");
     in.setUnidades(50);
     in.setPeso(50);
     in.setPrecio(60);
     in.setCoeficienteG(13.92);
     in.setCoeficienteP(37.5);
     in.setCostoxUnidad(111.42);
     in.setCostoTotal(5571.00);
     M.AgregaMatriz(in);
     
      
     in.setNombre("Cal       ");
     in.setUnidades(150);
     in.setPeso(20);
     in.setPrecio(40);
     in.setCoeficienteG(9.28);
     in.setCoeficienteP(15);
     in.setCostoxUnidad(64.28);
     in.setCostoTotal(9642.00);
     M.AgregaMatriz(in);
     
      
      
     in.setNombre("Tubos     ");
     in.setUnidades(200);
     in.setPeso(10);
     in.setPrecio(55);
     in.setCoeficienteG(12.76);
     in.setCoeficienteP(7.5);
     in.setCostoxUnidad(75.26);
     in.setCostoTotal(15052.00);
     M.AgregaMatriz(in); 
     
     in.setNombre("Quintales ");
     in.setUnidades(50);
     in.setPeso(50);
     in.setPrecio(350);
     in.setCoeficienteG(81.2);
     in.setCoeficienteP(37.5);
     in.setCostoxUnidad(468.7);
     in.setCostoTotal(23435.00);
     M.AgregaMatriz(in);
      
     
     M.imprimirDecorado();
    }
    
}
