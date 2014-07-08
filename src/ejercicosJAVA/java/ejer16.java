/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicosJAVA.java;

/**
 *
 * @author YALITZA DEMERA
 */
public class ejer16 {
      public int serie(int x, int y , int z){
                
        int a = 0;
        int acumulador = 0;
        int contador = 0;
        int vector[] = new int[z+1];
        if (y>z) {
            return 0;
        }
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return -1;
        }
        do {
            if (a==0) {
                vector[contador]=x;
            }else{
                vector[contador]=vector[contador-1]*a;
            }
            contador++;
            a=a+2;
        } while (z>=contador);
        for (int i = y-1; i < z; i++) {
            acumulador = acumulador + vector[i];
        }
        return acumulador;
    }
}
