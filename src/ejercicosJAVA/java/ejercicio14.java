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
public class ejercicio14 {
     public int SemillaSerie(int x, int y, int z){
        int vectr[] = new int[z+1];
        int Z = -1;
        int conta = 0;
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return Z;
        }else{
            do {
                vectr[conta]= Integer.parseInt(String.valueOf(x)+String.valueOf(y));
                vectr[conta+1]= Integer.parseInt(String.valueOf(y)+String.valueOf(x));
                x = x + 1;
                y = y + 1;
                conta = conta + 2;
            }while (z>=conta);
        }
        return vectr[z-1];
    }

    
}
