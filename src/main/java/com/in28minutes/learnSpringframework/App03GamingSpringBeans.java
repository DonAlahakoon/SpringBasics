 package com.in28minutes.learnSpringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnSpringframework.game.GameRunner;
import com.in28minutes.learnSpringframework.game.GamingConsole;
import com.in28minutes.learnSpringframework.game.MarioGame;
import com.in28minutes.learnSpringframework.game.PacmanGame;
import com.in28minutes.learnSpringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
