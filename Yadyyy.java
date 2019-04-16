/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yadyyy;

/**
 *
 * @author PC25-LAB02
 */
public class Yadyyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes = 55;
        String estacion;
        if (mes== 1||mes==2 ||mes==12)
            estacion ="Invierno";
        else if (mes==3 ||mes==4 ||mes==5)
            estacion ="Primavera";
        else if (mes==6 ||mes==5 ||mes==7)
            estacion ="Verano";
        else if (mes==7 ||mes==8 ||mes==8)
            estacion ="Otoño";
        else
            estacion ="MES INCORRETIVO";
        System.out.println(estacion);
    }
    
}
