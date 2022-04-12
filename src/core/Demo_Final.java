package core;

public class Demo_Final {

	public static void main(String[] args) {

		// declaring a final reference variable builder
		final StringBuilder builder = new StringBuilder("Father");
		System.out.println(builder);
		// changing internal state of object reference by final reference variable
		// builder
		builder.append("Thusitha");
		//builder = new StringBuilder("Ayesha");
		System.out.println(builder);
		builder.insert(0, "Mother");
		System.out.println(builder);
	}

}
