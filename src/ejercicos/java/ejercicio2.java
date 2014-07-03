/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicos.java;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEX FLORES
 */
public class ejercicio2 {
    public static void main(String[] args) {
        int resul;
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero  entero para x:"));
        int y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero  entero para y:"));
        if (x<=0 || x>255)
        {
            resul=-1;
            System.out.println(resul);            
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (int i = 1; i < arreglo.length; i++) 
            {
               x=x*(i+1);
               arreglo[i]=x;                      
            }
            for (int i = 0; i < arreglo.length; i++) 
            {
                if(i==(y-1))
                {
                    resul=arreglo[i];
                    System.out.println(resul);
                }
            }
        }
    
}
    

    
}
