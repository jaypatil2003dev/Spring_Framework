package com.patil;

public class Car {
	
	private String brand;
	private String price;
	
	private Engine engine;	
	
	
	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public void carDisplay() {
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Engine: "+engine.getCc());
	}
	
	

}
