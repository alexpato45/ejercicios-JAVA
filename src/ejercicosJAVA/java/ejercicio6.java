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
public class ejercicio6 {
    public static void main(String[] args)
    {
        String a="";
        String palabra=JOptionPane.showInputDialog(null,"Ingrese uns frase : ");
        String []frase=palabra.split(" ");
        for(int i=frase.length-1;i>=0;i--)
        {
            a=a+frase[i]+" ";            
        }
        JOptionPane.showMessageDialog(null, a);
    }
    
}
