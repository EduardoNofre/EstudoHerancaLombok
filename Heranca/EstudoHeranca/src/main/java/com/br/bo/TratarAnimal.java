package com.br.bo;

import com.br.vo.Animal;
import com.br.vo.Cachorro;
import com.br.vo.Gato;

public class TratarAnimal {

	public void acaoCachorro(Animal animal) {

		Cachorro cachorro = new Cachorro();
		cachorro.setLate("au au au au!!! ");
		animal.setTipoAnimal("Cachorro");

		System.out.println(" Tipo animal " + animal.getTipoAnimal());
		System.out.println(" Tem pata " + animal.isTemPata());
		System.out.println(" Tem pelo " + animal.isTemPelo());
		System.out.println(" Tem Rabo " + animal.isTemRabo());
		System.out.println(" Late " + cachorro.getLate());
		System.out.println(" \n\n ");
	}

	public void acaoGato(Animal animal) {

		Gato gato = new Gato();
		gato.setMia("Miau miau miau!!");
		animal.setTipoAnimal("Gato");
		
		System.out.println(" Tipo animal " +animal.getTipoAnimal());
		System.out.println(" Tem pata " + animal.isTemPata());
		System.out.println(" Tem pelo " + animal.isTemPelo());
		System.out.println(" Tem Rabo " + animal.isTemRabo());
		System.out.println(" Mia " +gato.getMia());

	}
}
