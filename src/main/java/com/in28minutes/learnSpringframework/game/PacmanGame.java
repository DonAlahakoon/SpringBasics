package com.in28minutes.learnSpringframework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("Pacman Jump");
	}
	public void down() {
		System.out.println("Pacman Bend");
	}
	public void left() {
		System.out.println("Pacman go left");
	}
	public void right() {
		System.out.println("Pacman go right");
	}

}
