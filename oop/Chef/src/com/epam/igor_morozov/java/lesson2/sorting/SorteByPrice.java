package com.epam.igor_morozov.java.lesson2.sorting;

import java.util.Comparator;

import com.epam.igor_morozov.java.lesson2.classes.Veg;

public class SorteByPrice implements Comparator<Veg> {

	@Override
	public int compare(Veg vegetable1, Veg vegetable2) {
		Float price1 = vegetable1.PRICE;
		Float price2 = vegetable2.PRICE;

		return price1.compareTo(price2);
	}

}