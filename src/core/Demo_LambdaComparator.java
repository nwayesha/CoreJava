package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	Integer id;
	String name;
	Double price;
	
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class Demo_LambdaComparator {
	public static void main(String[] args) throws InterruptedException {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Sugar", 135.5));
		list.add(new Product(2, "Milk", 150.25));
		list.add(new Product(3, "Coffee", 75.30));
		list.add(new Product(4, "Tea", 88.20));
		
		Collections.sort(list, (p1, p2) ->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p : list) {
			System.out.println("id - "+p.id+ " name - "+p.name + " price - "+p.price);
		}
		System.out.println("");
		Collections.sort(list, (q1, q2) ->{
			return q1.price.compareTo(q2.price);
		});
		for(Product q : list) {
			System.out.println("id - "+q.id+ " name - "+q.name + " price - "+q.price);
		}
		System.out.println("");
		Collections.sort(list, (r1, r2) ->{
			return r1.id.compareTo(r2.id);
		});
		for(Product r : list) {
			System.out.println("id - "+r.id+ " name - "+r.name + " price - "+r.price);
		}
	}
}
