package model;

public class Cat {
	
	private String name;
	private int age;
	private String favFood;
	private String color;
	
	public Cat(String name, int age, String favFood, String color) {
		
		this.name = name;
		this.age = age;
		this.favFood = favFood;
		this.color = color;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
