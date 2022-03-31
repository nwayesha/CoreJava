package designpattern.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {
	@Override
	public Animal create(String animalType) {
		if ("Dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if ("Duck".equalsIgnoreCase(animalType)) {
			return new Duck();
		}else if ("Cow".equalsIgnoreCase(animalType)) {
			return new Cow();
		}
		return null;
	}
}
