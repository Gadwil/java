package com.epam.igor_morozov.java.lesson2.abstructClasses;

public class Ingredients  implements Comparable <Ingredients>  {
	
	 public final String NAME;	 
	 public final float CALORIECITY;
	 protected static final String CALORICITY_MESSAGE = " caloricity (cCal) = ";
	
	 
		 
	 public Ingredients(String name,float caloriecity ){
		 this.NAME = name;
		 this.CALORIECITY = caloriecity;
	 }
	 
	
	 @Override
	 public boolean equals(Object obj) {
		 Ingredients ingredient = (Ingredients)obj;
		 
		 if(this.NAME.equals(ingredient.NAME)  && this.CALORIECITY == ingredient.CALORIECITY)
			 return true;
		 return false;
	 }
	 @Override	  
	 public int compareTo(Ingredients  ingridient) {
			return this.NAME.compareTo(ingridient.NAME);
	 
	 }
	 @Override
	 public String toString() {
	 	String s = this.NAME+ CALORICITY_MESSAGE + this.CALORIECITY; 
	 	return s;	 	
	 }

}
