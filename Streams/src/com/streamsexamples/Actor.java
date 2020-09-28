package com.streamsexamples;

public interface Actor {
	void act();
	void speak();
	default void doComedy() // defult interface
	{
		System.out.println("I can make people laugh");
	}
	

}
