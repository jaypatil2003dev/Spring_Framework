package com.theater;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Kantara implements Movie{
	public void story() {
		System.out.println("Story of kantara");
	}

}
