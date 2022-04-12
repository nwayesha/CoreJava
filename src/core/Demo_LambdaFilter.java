package core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class ProductFilter{
	Integer id;
	String name;
	Double price;
	
	public ProductFilter(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Demo_LambdaFilter {
	public static void main(String[] args) throws InterruptedException {
		List<ProductFilter> list = new ArrayList<ProductFilter>();
		list.add(new ProductFilter(1, "Sugar", 135.5));
		list.add(new ProductFilter(2, "Milk", 150.25));
		list.add(new ProductFilter(3, "Coffee", 75.30));
		list.add(new ProductFilter(4, "Tea", 88.20));
		
		Stream<ProductFilter> filterData = list.stream().filter(p -> p.price < 140);
				filterData.forEach(product -> System.out.println("name - "+product.name + "  --- price - "+product.price)

						);
				
				
		
	}
}
