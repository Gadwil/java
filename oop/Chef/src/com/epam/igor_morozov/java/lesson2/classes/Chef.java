package com.epam.igor_morozov.java.lesson2.classes;

import com.epam.igor_morozov.java.lesson2.abstructClasses.Ingredients;

public class Chef {
	
	protected final String SORT_BY_NAME_MESSAGE = "Sort by name";
	protected final String SORT_BY_CALORIECITY_MESSAGE = "Sort by caloriecity";
	protected final String SORT_BY_PRICE_MESSAGE = "Sort by price";
	
	Basket basket = new Basket();
	Bowl bowl = new Bowl();
	Veg[] veg;
	
	public Chef() {
		
		System.out.println(basket.toString());	
		sortInBasket();
		searchByPrice(0,4);
		
		
		addVegetable(basket.potato, 2);
		addVegetable(basket.cucumber, 1);
		addVegetable(basket.tomato, 1);
	
	
				
		addCondiments(new Ingredients("mayonnaise",400));
		
		System.out.println(bowl.getTotalCaloricValue());
		System.out.println(bowl.toString());
		
		
			 
		sortInBowl();
			 
      
	}
	

	private void addCondiments(Ingredients... ingredients) {
		for(int i = 0; i < ingredients.length; i++)
			bowl.add(ingredients[i]);
		
	}


	private void searchByPrice(int from, int to) {
		System.out.println("Search by price");
		Ingredients[] ingredients = basket.searchByPrice(0, 4);
		for(Ingredients ingredient: ingredients )
			System.out.println(ingredient.toString());
	}


	private void sortInBasket() {
		System.out.println(SORT_BY_NAME_MESSAGE);
		basket.sortByName();
		System.out.println(basket.toString());
		
		System.out.println(SORT_BY_CALORIECITY_MESSAGE);
		basket.sortByCaloriecity();
		System.out.println(basket.toString());
		
		System.out.println(SORT_BY_PRICE_MESSAGE);
		basket.sortByPrice();
		System.out.println(basket.toString());
		
	}

	private void sortInBowl() {
		System.out.println(SORT_BY_NAME_MESSAGE);
		bowl.sortByName();
		System.out.println(bowl.toString());
		
		System.out.println(SORT_BY_CALORIECITY_MESSAGE);
		bowl.sortByCaloriecity();
		System.out.println(bowl.toString());
		
	
		
	}

	private void addVegetable(Veg vegetable , int count) {
		veg = basket.takeVegetables(vegetable, count);
		
		for (Veg v : veg) {
			washVegetable(v); //помыть овощ
			if (v.NEED_PEEL)  //очистить от кожуры если необходимо
				peel(v);
			sclice(v);		  //нарезать
			bowl.add(v);
		}
		
	}

	private void sclice(Veg v) {
		v.setCliced(true);
		
	}

	private void peel(Veg v) {
		v.setPeeled(true);
		
	}

	private void washVegetable(Veg v) {
		v.setClean(true);
	}

}
