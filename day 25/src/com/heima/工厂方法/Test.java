package com.heima.��������;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogFactory df = new DogFactory();
		Dog d = (Dog)df.createAnimal();
		d.eat();
	}

}
