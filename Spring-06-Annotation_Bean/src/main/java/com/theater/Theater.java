package com.theater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Theater {
//	@Value(value="Inox")
	private String name;
	
//	@Value(value="Thane")
	private String address;
	
//	@Autowired
//	@Qualifier(value="Chaava")
	private Movie movie;
	
	
	public Theater(@Value(value="Inox") String name,@Value(value="Thane") String address,@Autowired @Qualifier(value = "chaava") Movie movie) {
		this.name = name;
		this.address = address;
		this.movie = movie;
	}
	
	public void display() {
		System.out.println("===========Theater==========");
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("Movie with story below is playing :");
		movie.story();
	}
	
	

}
