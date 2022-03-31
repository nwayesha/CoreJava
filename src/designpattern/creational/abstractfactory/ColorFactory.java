package designpattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color>{
	@Override
	public Color create(String animalColor) {
		if ("Yellow".equalsIgnoreCase(animalColor)) {
			return new Yellow();
		} else if ("White".equalsIgnoreCase(animalColor)) {
			return new White();
		}else if ("Brown".equalsIgnoreCase(animalColor)) {
			return new Brown();
		}
		return null;
	}
}
