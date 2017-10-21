package com.epam.igor_morozov.java.lesson2.sorting;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.abstructClasses.Ingredients;

public class SorteByName implements Comparator<Ingredients> {

	@Override
	public int compare(Ingredients ingredient1, Ingredients ingredient2) {

		return ingredient1.NAME.compareTo(ingredient2.NAME);
	}

}