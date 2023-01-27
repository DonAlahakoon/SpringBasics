package com.in28minutes.learnSpringframework;

import com.in28minutes.learnSpringframework.game.GameRunner;
import com.in28minutes.learnSpringframework.game.GamingConsole;
import com.in28minutes.learnSpringframework.game.MarioGame;
import com.in28minutes.learnSpringframework.game.PacmanGame;
import com.in28minutes.learnSpringframework.game.SuperContraGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	//These are spring beans
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
