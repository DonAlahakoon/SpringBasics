 package com.in28minutes.learnSpringframework;

import com.in28minutes.learnSpringframework.game.GameRunner;
import com.in28minutes.learnSpringframework.game.MarioGame;
import com.in28minutes.learnSpringframework.game.PacmanGame;
import com.in28minutes.learnSpringframework.game.SuperContraGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Level 2
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		
		//1. Create an object
		PacmanGame game = new PacmanGame();// similar to "var game = new PacmanGame();"
		
		var gameRunner  = new GameRunner(game);//2.Object creation and Wiring of dependencies
		gameRunner.run();

	}

}
