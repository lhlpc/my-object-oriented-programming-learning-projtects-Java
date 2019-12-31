package com.test.ex;

public class DogTest {

	public static void main(String[] args) {
			
			Labrador labrador = new Labrador("Rex", "White");
			System.out.println(labrador.getName() + " says " + labrador.speak() + "\nAverage Breed Weight: " + labrador.avgBreedWeight());
			
			Yorkshire yorkshire = new Yorkshire("Bob");
			System.out.println(yorkshire.getName() + " says " + yorkshire.speak() + "\nAverage Breed Weight: " + yorkshire.avgBreedWeight());

	}
}

/*
——— Exploring Inheritance ——-

-- Answers --

1 - a - The problem is that Labrador is a child class of Dog, so the constructor of Dog
must be invoked in the first line of the constructor of Labrador class.

2 - This was the error:

 “The method avgBreedWeight() is undefined for the type Yorkshire

	at com.test.ex.DogTest.main(DogTest.java:14)”

It happened because the avgBreedWeight method was not implemented in Yorkshire class.
*/