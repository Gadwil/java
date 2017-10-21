/**
 * 
 */
package com.epam.igor_morozov.java.lesson2.classes;

import com.epam.igor_morozov.java.lesson2.abstructClasses.Ingredients;

/**
 * @author Igor_Morozov
 *
 */
 public class Veg extends Ingredients {
	
	 protected static final String PRICE_MESSAGE = " price ($) = ";
	 protected static final String WIEGHT_MESSAGE = " weight (kg) = ";
	 
	 public final float PRICE;
	 public final float WIEGHT;
	 public final boolean NEED_PEEL; //нужно ли очищать от кожуры
	 private boolean isClean = false;
	 private boolean peeled = false;
	 private boolean cliced = false;
	 
	
	 /**
	  * 
	  * @param name
	  * @param caloriecity (float)
	  * @param weight (float)
	  * @param price (float)
	  * @param needPeel (boolean)
	  */
	 public Veg(String name, float caloriecity, float weight, float price, boolean needPeel ){
		 super(name,caloriecity );			 		 
		 this.WIEGHT = weight;
		 this.PRICE = price;
		 this.NEED_PEEL = needPeel;
	 }
	 

@Override
public boolean equals(Object obj) {
	Veg vegetable = (Veg)obj;
	
	if (this.CALORIECITY==vegetable.CALORIECITY && this.NAME==vegetable.NAME
			&& this.WIEGHT==vegetable.WIEGHT && PRICE == vegetable.PRICE) { 
		return true;
	}
	return false;
	
}
@Override
public String toString() {
	String s = this.NAME+ CALORICITY_MESSAGE + this.CALORIECITY + PRICE_MESSAGE + PRICE + WIEGHT_MESSAGE + this.WIEGHT; 
	return s;
	
}


public boolean isClean() {
	return isClean;
}


public void setClean(boolean isClean) {
	this.isClean = isClean;
}


public boolean isPeeled() {
	return peeled;
}


public void setPeeled(boolean peeled) {
	this.peeled = peeled;
}


public boolean isCliced() {
	return cliced;
}


public void setCliced(boolean cliced) {
	this.cliced = cliced;
}




}
