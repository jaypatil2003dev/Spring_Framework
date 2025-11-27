package com.patil;

import org.springframework.stereotype.Component;

@Component(value = "myRCB")
public class RCB {
	
	public void play() {
		System.out.println("========RCB========");
		System.out.println("Playing and winning");
	}

}
