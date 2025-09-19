package com.file.study;

interface Animal {
	void makeSound();
}

class Dog implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

class Cat implements Animal {
	
	@Override
	public void makeSound() {
		System.out.println("야용");
	}
}

class Cow implements Animal {
	
	@Override
	public void makeSound() {
		System.out.println("음메");
	}
}

class AnimalFactory {
	public static Animal getAnimal(String type) {
		if(type.equalsIgnoreCase("dog")) return new Dog();
		if(type.equalsIgnoreCase("cat")) return new Cat();
		if(type.equalsIgnoreCase("cow")) return new Cow();
		throw new IllegalArgumentException("불법 인자 예외: "+type);
	}
}

public class Study{
	public static void main(String[] args) {
		
		Animal a1 = AnimalFactory.getAnimal("dog");
		a1.makeSound();
		
		Animal a2 = AnimalFactory.getAnimal("cat");
		a2.makeSound();
	}
	
}