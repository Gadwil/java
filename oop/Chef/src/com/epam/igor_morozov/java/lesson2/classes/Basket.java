package com.epam.igor_morozov.java.lesson2.classes;

import java.util.Arrays;
import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.abstructClasses.*;
import com.epam.igor_morozov.java.lesson2.sorting.SorteByCaloriecity;
import com.epam.igor_morozov.java.lesson2.sorting.SorteByPrice;

/**
 * @author Igor_Morozov
 *
 */
public class Basket extends Container {

	private final String COUNT_MESSAGE = "count = ";
	
	Veg potato = new Veg("potato", 123f, 0.5f, 1f, true);
	
	Veg tomato = new Veg("tomato", 124f, 0.4f, 2f, false);
	Veg cucumber = new Veg("cucumber", 125f, 0.3f, 5.6f, false);
	Veg carrot = new Veg("carrot", 126f, 0.2f, 0.3f, true);

	private int[] countVegetables; // колличество доступных овощей
	

	public Basket() {
		container = new Veg[] {potato, 	tomato,	cucumber, carrot};
		countVegetables = new int[] { 3, 2, 5, 6 };
	}

	public Veg[] takeVegetables(Veg vegetable, int count) {
		int index = indexOf(vegetable);
		Veg[] basket = new Veg[count] ;
		for(int i = 0; i < count; i ++)
		{
			if(countVegetables[index]==0)
				break;
				basket[i] = (Veg)container[index ];
				countVegetables[index]--;
		
		}
		return basket;
	}
	
@Override
public String toString() {
	String returntString = "";
	int number=0;
	
	
	for(Ingredients ingredient:  container)
	{
	
		returntString += ((Veg) ingredient).toString() + COUNT_MESSAGE		    
		    + countVegetables[number] +  NEXT_STRING;
		number++;
	}
	return returntString;
}
		
	public void sortByPrice() {
		Arrays.sort((Veg[])container,  new SorteByPrice());		
	}
	
		
	public void add(Ingredients ingredient, int count) {
		add(ingredient)	;
		countVegetables = Arrays.copyOf(countVegetables, countVegetables.length + 1);
		countVegetables[countVegetables.length - 1] = count;
	}

	public Ingredients[] searchByPrice( float priceFrom, float priceTo) {
		 Ingredients[] ingredients = new Ingredients[0];
		 for(Ingredients ingredient: container)
				if( ( (Veg)ingredient ).PRICE >= priceFrom && ((Veg)ingredient ).PRICE  <= priceTo)
					{
					ingredients = Arrays.copyOf(ingredients, ingredients.length+1);
					ingredients[ingredients.length-1] = ingredient;
					}
			return ingredients;
		 
	 }
	
}
