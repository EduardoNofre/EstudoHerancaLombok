package com.br.service;

import com.br.vo.Animal;

public class AcaoAnimal extends Animal {

	public Animal animal(Animal animal) {

		animal.setTemPata(true);
		animal.setTemRabo(true);
		animal.setTemPelo(true);

		return animal;

	}
}
