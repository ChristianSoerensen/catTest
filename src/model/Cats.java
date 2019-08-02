package model;

import java.util.ArrayList;

public class Cats {
	
	private ArrayList<Cat> catList;
	
	public Cats() {
		catList = new ArrayList<>();
	};
	
	public void addCat(Cat cat) {
		catList.add(cat);
	};
	
	public boolean removeCat(Cat cat) {
		int counter = 0;
		
		for(Cat kitty: catList) {
			if(kitty == cat) {
				catList.remove(cat);
				counter = 1;
			}
		}
		if(counter == 1) {
			return true;
		}
		else{
			return false;
		}
		
	};
	public void printCats() {
		for(Cat kitty: catList) {
			System.out.println(kitty.toString());
		}
	}

}
