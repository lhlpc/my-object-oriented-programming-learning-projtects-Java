package com.test.ex;

//*****************************************************************
//Yorkshire.java
//
//A class derived from Dog that holds information about
//a Yorkshire terrier. Overrides Dog speak method.
//
//*****************************************************************
public class Yorkshire extends Dog{
	
	private int  breedWeight = 75;
	
	public Yorkshire(String name){
		super(name);
	}
	
//-------------------------------------------------------------
//Small bark -- overrides speak method in Dog
//-------------------------------------------------------------
	
	public String speak(){
		return "woof";
	}
	
	public int avgBreedWeight(){
		return breedWeight;
	}
}