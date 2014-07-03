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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0, y=0, aux=7, auxb=6, resul=0, m;
        int[] arreglo1=new int[128];
        int[] arreglo2=new int[128];
        int[] arreglo3=new int[255];
        for (int i = 0; i <= 127; i++) 
        {            
            arreglo1[i]=aux;
            aux=aux+1;
            
        }
        for (int j = 0; j <= 127; j++) 
        {            
            arreglo2[j]=auxb;
            auxb=auxb-2;          
        }
        aux=0;
        for (int i = 0; i < 255; i++) 
        {
            m=i % 2;
            if (m==0)
            {
             arreglo3[i]=arreglo1[aux];
             
            }
            else
            {                
                arreglo3[i]=arreglo2[aux]; 
                aux=aux+1;
            }             
        }
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            resul=-1;
        }
        else
        {
            for (int i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    aux=arreglo3[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        auxb=arreglo3[i];
                    }                   
                }
            }
            resul=aux+auxb;
        }
        JOptionPane.showMessageDialog(null, resul);
    }
    
}