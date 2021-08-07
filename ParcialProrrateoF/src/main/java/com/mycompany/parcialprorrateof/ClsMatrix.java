
package com.mycompany.parcialprorrateof;

/**
 *
 * @author ramos
 */
public class ClsMatrix {
    
    
    private String [][] creaTabla= new String[4][7];
    int fila=0;
    public void AgregaMatriz(ClsIngresarP I)
    {
        
       creaTabla[fila][0]=I.getUnidades()+"";
       creaTabla[fila][1]=I.getNombre()+"";
       creaTabla[fila][2]=I.getPrecio()+"";
       creaTabla[fila][3]=I.getCoeficienteG()+"";
       creaTabla[fila][4]=I.getCoeficienteP()+"";
       creaTabla[fila][5]=I.getCostoxUnidad()+"";
       creaTabla[fila][6]=I.getCostoTotal()+"";
       fila++;
       
    }
    
    
   public  void imprimirDecorado(){
       
       for (int x = 0; x < creaTabla.length; x++) {
            System.out.print("|");
            for (int y = 0; y < creaTabla[x].length; y++) {
                System.out.print(creaTabla[x][y]);
                if (y != creaTabla[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
   } 
}
