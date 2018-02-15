package com.teach.advanced.Course0;

import java.net.Inet4Address;

public class User {

	private String planet;
	private String name;
	private int weight;
	private int height;
	private int age;

	User(String planet, String name, int weight, int height, int age) {

		this.setPlanet(planet);
		this.setName(name);
		this.setWeight(weight);
		this.setHeight(height);
		this.setAge(age);

	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
