package com.epam.igor_morozov.java.lesson2.classes;

import java.util.Arrays;

import com.epam.igor_morozov.java.lesson2.abstructClasses.Container;
import com.epam.igor_morozov.java.lesson2.abstructClasses.Ingredients;



public class Bowl extends Container {

	private float totalCaloricValue = 0;
	
	public Bowl() {
		container = new Ingredients[0];
	}



	@Override
	public String toString() {
		String returntString = "";
			
		
		for(Ingredients ingridient:  container)
		{
	
			returntString += ingridient.toString() + NEXT_STRING;	
		}
		return returntString;
	}

	
	public float getTotalCaloricValue() {
		return totalCaloricValue;
	}

	private void countTotalCaloricValue() {
		totalCaloricValue = 0;
		for(Ingredients ingridient:  container)
			totalCaloricValue += ingridient.CALORIECITY;
	}

	

	




	
}
