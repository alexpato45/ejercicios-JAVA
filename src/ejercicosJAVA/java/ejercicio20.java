/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosfunciones;

/**
 *
 * @author YALITZA DEMERA
 */
public class ejercicio20 {
     public int particiones(int numero){
        int total = numero;
        int count = 0;
	  for(int numParts=1; numParts<=total; ++numParts) {
	    count += particiones(numero, numParts);
	  }
	  return count;
    }
    
    public int particiones(int suma, int numParts) {
	  if ( numParts > suma ) {
	    return 0;
	  } else if ( numParts == suma ) {
	    return 1;
	  } else {
	    return particiones(suma-1, numParts-1) +
	           particiones(suma-numParts, numParts);
	  }
	}  

   
}
