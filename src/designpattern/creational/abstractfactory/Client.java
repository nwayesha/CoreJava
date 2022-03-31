package designpattern.creational.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the  type  (Animal or Color) :  ");
		String choice = br.readLine();
		FactoryProvider factoryProvider = new FactoryProvider();
		
		System.out.println("Enter the    Animal type or Color type) :  ");
		String type = br.readLine();
		
		if (null != type && (type.equalsIgnoreCase("dog")||type.equalsIgnoreCase("cow") ||type.equalsIgnoreCase("duck"))) {
			AbstractFactory<Animal> abstractFactory = factoryProvider.getFactory(choice);
			String animal = abstractFactory.create(type).getAnimal();
			String sound = abstractFactory.create(type).makeSound();
			System.out.println("The animal   :  "+ animal + "  makes the sound  :  "+ sound);
		}else if (null != type && (type.equalsIgnoreCase("yellow")||type.equalsIgnoreCase("brown") ||type.equalsIgnoreCase("white"))) {
			AbstractFactory<Color> abstractFactory = factoryProvider.getFactory(choice);
			String color = abstractFactory.create(type).getColor();
			String animal = abstractFactory.create(type).getAnimal();
			System.out.println("The color   :  "+ color + "  is the animal of  :  "+ animal);
		}
		
	}

}
