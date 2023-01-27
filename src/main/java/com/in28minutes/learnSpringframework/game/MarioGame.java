package com.in28minutes.learnSpringframework.game;

public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("Mario Jump");
	}
	public void down() {
		System.out.println("Mario Bend");
	}
	public void left() {
		System.out.println("Mario go left");
	}
	public void right() {
		System.out.println("Mario go right");
	}

}
