package com.epam.igor_morozov.java.lesson2.classes;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.abstructClasses.Ingredients;

public class Sorting {

	public static class SortedByName implements Comparator<Ingredients> {

		@Override
		public int compare(Ingredients ingredient1, Ingredients ingredient2) {

			return ingredient1.NAME.compareTo(ingredient2.NAME);
		}

	}

	public class SortedByCaloriecity implements Comparator<Ingredients> {

		@Override
		public int compare(Ingredients ingredient1, Ingredients ingredient2) {
			Float caloriecity1 = ingredient1.CALORIECITY;
			Float caloriecity2 = ingredient2.CALORIECITY;

			return caloriecity1.compareTo(caloriecity2);
		}
	}

	public class SortedByPrice implements Comparator<Veg> {

		@Override
		public int compare(Veg vegetable1, Veg vegetable2) {
			Float price1 = vegetable1.PRICE;
			Float price2 = vegetable2.PRICE;

			return price1.compareTo(price2);
		}

	}
}
