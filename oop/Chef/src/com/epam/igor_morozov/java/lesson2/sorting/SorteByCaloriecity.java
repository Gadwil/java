package com.epam.igor_morozov.java.lesson2.sorting;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.abstructClasses.Ingredients;

public class SorteByCaloriecity implements Comparator<Ingredients> {

	@Override
	public int compare(Ingredients ingredient1, Ingredients ingredient2) {
		Float caloriecity1 = ingredient1.CALORIECITY;
		Float caloriecity2 = ingredient2.CALORIECITY;

		return caloriecity1.compareTo(caloriecity2);
	}
}