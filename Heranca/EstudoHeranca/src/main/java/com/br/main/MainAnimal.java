/**
 * 
 */
package com.br.main;

import com.br.bo.TratarAnimal;
import com.br.service.AcaoAnimal;

/**
 * @author Eduardo
 *
 */
public class MainAnimal {
	
	
	public static void main(String[] args) {
		
		AcaoAnimal acaoAnimal = new AcaoAnimal();
		
		acaoAnimal.animal(acaoAnimal);
		

		TratarAnimal tratarAnimal = new TratarAnimal();
		
		tratarAnimal.acaoCachorro(acaoAnimal);
		
		tratarAnimal.acaoGato(acaoAnimal);
		
	}


}
