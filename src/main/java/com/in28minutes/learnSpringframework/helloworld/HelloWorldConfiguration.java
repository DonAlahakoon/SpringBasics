 package com.in28minutes.learnSpringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*Eliminate verbosity in creating Java Beans
 * Public accessor methods, constructor,
 * equals, hashcode and toString are automatically created.
 * Released in JDK 16.
 */
record Person (String name,int age, Address address) {};

record Address(String firstLine,String city) {};
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Tom";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	public Person person() {
		return new Person("Jack",20,new Address("Cinamorn Road","Colombo 7"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());//name,age
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);//name,age,address2
	}
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);//name,age,address2
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier")Address address) {
		return new Person(name, age, address);//name,age,address2
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Baker Street London","London");
	}
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address addres3() {
		return new Address("Motingar","Hyderbad");
	}

}
