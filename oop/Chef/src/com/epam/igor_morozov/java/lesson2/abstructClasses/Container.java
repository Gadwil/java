package com.epam.igor_morozov.java.lesson2.abstructClasses;

import java.util.Arrays;


import com.epam.igor_morozov.java.lesson2.sorting.SorteByCaloriecity;
import com.epam.igor_morozov.java.lesson2.sorting.SorteByName;

public abstract class Container {

	protected static final String CALORICITY_MESSAGE = " caloricity (cCal) = ";
	protected static final String NEXT_STRING = "\n";
	
	 protected Ingredients[] container;
	 
	 public void add(Ingredients ingredient) {
			container = Arrays.copyOf(container, container.length + 1);
			container[container.length - 1 ] = ingredient;		
		}
	 
	 public void delete(int index) {
			
			Ingredients[] ingredients = new Ingredients[container.length - 1];
			
			 for(int i = 0, j = 0; i < container.length; i ++, j ++) {
				 if(i == index)
				 {
					 j--;
					 continue; 
				 }				 
				 ingredients[j] = container[i];
			 }
			container = ingredients;
		}
	 
	 public Ingredients search( String name) {
		 
		 for(Ingredients ingredient: container)
				if(ingredient.NAME==name)
					return ingredient;
			return null;	 		 
	 }
	 
	 public int indexOf(Ingredients ingredient) {
	 
		 for(int i = 0; i < container.length; i ++ ) 
			 
			 if(container[i].equals(ingredient))
				 return i;			 
		 		 
		 return -1;
	 }
	 
	 public int indexOf(String name) {
		 
		 for(int i = 0; i < container.length; i ++ ) 
			 
			 if(container[i].NAME.equals(name))
				 return i;			 
		 		 
		 return -1;
	 }
	 
	 public Ingredients[] search( float caloriecityFrom, float caloriecityTo) {
		 Ingredients[] ingredients = new Ingredients[0];
		 for(Ingredients ingredient: container)
				if(ingredient.CALORIECITY >= caloriecityFrom && ingredient.CALORIECITY <= caloriecityTo)
					{
					ingredients = Arrays.copyOf(ingredients, ingredients.length+1);
					ingredients[ingredients.length-1] = ingredient;
					}
			return ingredients;
		 
	 }
	 
	 public void sortByName() {
			Arrays.sort(container,  new SorteByName());
			
		}
	 
		public void sortByCaloriecity() {		
			Arrays.sort(container,  new SorteByCaloriecity());
			
		}
	 
	 
}


	

