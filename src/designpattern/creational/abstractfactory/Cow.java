package designpattern.creational.abstractfactory;

public class Cow implements Animal{
	@Override
	public String getAnimal() {
		return "Cow";
	}
	@Override
    public String makeSound() {
        return "Moo";
    }
}
