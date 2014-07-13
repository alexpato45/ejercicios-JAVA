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
public class ejercicio22 {
    public String Matriz(String [][]n){
        String res = null;
        int[][] x = new int[3][3];
        for (int f = 0; f < 3 / 2; f++) {
            for (int k = f; k < 3 - f; k++) {
            res = res + String.valueOf(x[f][k]);
        }
        for (int k = f; k <= 3 - f; k++) {
            res = res + String.valueOf(x[k][3 - f + 1]);
        }
        for (int k = 3 - f + 1; k >= f + 1; k--) {
            res = res + String.valueOf(x[3 - f + 1][k]);
        }
        for (int k = 3 - f + 1; k >= f + 1; k--) {
            res = res + String.valueOf(x[k][f]);
        }
        }
        if (3 % 2 == 1) {
            res = res + String.valueOf(x[3 / 2 + 1][3 / 2 + 1]);
        }
        return res;
    }
}
