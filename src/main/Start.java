package main;

import model.Cat;
import model.Cats;

public class Start {
	
	public static void main(String[] args) {
		
		Cats catCollection = new Cats();
		
		Cat cat = new Cat("Garfield", 12, "Orange", "lasagne");
		Cat cat2 = new Cat("Findus", 3, "stribet", "kylling");
		
		catCollection.addCat(cat);
		catCollection.addCat(cat2);
		
		catCollection.printCats();
		
		System.out.println(catCollection.removeCat(cat));
		
		catCollection.printCats();
		
		
		
	}

}
