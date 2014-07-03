/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ejercicosJAVA.java;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEX FLORES
 */
public class ejercicio4 
{
    public static void main(String[] args) 
    {
        String cadena1, cadena2, a;        
        cadena1=(JOptionPane.showInputDialog("Ingrese la primer frase"));
        cadena2=(JOptionPane.showInputDialog("Ingrese la segunda frase"));    
        cadena2=cadena2.toLowerCase();
        a=cadena2.toUpperCase();
        int longitud1=cadena1.length();
        int longitud2=cadena2.length();               
        char[] frase1 = cadena1.toCharArray();
        char[] frase2 = cadena2.toCharArray(); 
        char[] frase3 = a.toCharArray();         
         for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frase1[j]== frase2[i] || frase1[j]== frase3[i]) 
                  {
                      frase1[j]=' ';
                  }
              }
          }             
          for (int i = 0; i < longitud1; i++) 
          {
              if (frase1[i]!=' ')
              {
                  System.out.print(frase1[i]);
              }
          }
    }
}
