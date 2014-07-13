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
public class ejercicio18 {
    public String[] Ordnr(String[] val){
        for(int x=0;x<val.length;x++) {
            for(int y=0;y<val.length-x;y++) {
                if (val[y].compareTo(val[y+1])>0) {
                    String aux;
                    aux=val[y];
                    val[y]=val[y+1];
                    val[y+1]=aux;
                }
            }
        }
        return val;
    }
    
}


