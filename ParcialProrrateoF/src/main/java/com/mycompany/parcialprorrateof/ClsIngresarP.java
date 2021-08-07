
package com.mycompany.parcialprorrateof;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ramos
 */
public class ClsIngresarP {

    /**
     * @return the CostoTotal
     */
    public double getCostoTotal() {
        return CostoTotal;
    }

    /**
     * @param CostoTotal the CostoTotal to set
     */
    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }


    /**
     * @return the CostoxUnidad
     */
    public double getCostoxUnidad() {
        return CostoxUnidad;
    }

    /**
     * @param CostoxUnidad the CostoxUnidad to set
     */
    public void setCostoxUnidad(double CostoxUnidad) {
        this.CostoxUnidad = CostoxUnidad;
    }

    /**
     * @return the coeficienteG
     */
    public double getCoeficienteG() {
        return GastoalValor;
    }

    /**
     * @param coeficienteG the coeficienteG to set
     */
    public void setCoeficienteG(double coeficienteG) {
        this.GastoalValor = coeficienteG;
    }

    /**
     * @return the coeficienteP
     */
    public double getCoeficienteP() {
        return GastosalPeso;
    }

    /**
     * @param coeficienteP the coeficienteP to set
     */
    public void setCoeficienteP(double coeficienteP) {
        this.GastosalPeso = coeficienteP;
    }

    /**
     * @return the Sprecio
     */
  
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Unidades
     */
    public int getUnidades() {
        return Unidades;
    }

    /**
     * @param Unidades the Unidades to set
     */
    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    /**
     * @return the Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
   private  String Nombre;
   private double Precio;
   private int Unidades;
   private double Peso;
   private double GastoalValor;
   private double GastosalPeso;
   private double CostoTotal;
   private double CostoxUnidad;
   
  
}
