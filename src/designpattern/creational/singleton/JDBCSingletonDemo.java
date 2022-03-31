package designpattern.creational.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {

	static int count = 1;
	static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {
		JDBCSingleton jdbc = JDBCSingleton.getInstance();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("DATABASE OPERATIONS ---> 1 - insert, 2 - view, 3 - delete, 4 - update, 5 - exit ");
			
			System.out.print("\n");
			System.out.print("Please enter the database operation you want to perform");

			choice = Integer.parseInt(br.readLine());
			switch (choice) {

			case 1: {
				System.out.print("Enter the customer name: ");
				String name = br.readLine();
				System.out.print("Enter the customer address: ");
				String address = br.readLine();
				System.out.print("Enter the customer email: ");
				String email = br.readLine();
				System.out.print("Enter the customer telephone: ");
				String telephone = br.readLine();

				try {
					int i = jdbc.insertData(name, address, email, telephone);
					if (i > 0) {
						System.out.println((count++) + " Data has been inserted successfully");
					} else {
						System.out.println("Data has not been inserted ");
					}

				} catch (Exception e) {
					System.out.println(e);
				}

				System.out.println("Press Enter key to continue...");
				System.in.read();

			} // End of case 1
				break;
			case 2: {
				System.out.print("Enter the name : ");
				String username = br.readLine();

				try {
					jdbc.viewData(username);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Press Enter key to continue...");
				System.in.read();

			} // End of case 2
				break;
			case 3: {
				System.out.print("Enter the id,  you want to delete: ");
				int id = Integer.parseInt(br.readLine());

				try {
					int i = jdbc.deleteData(id);
					if (i > 0) {
						System.out.println((count++) + " Data has been deleted successfully");
					} else {
						System.out.println("Data has not been deleted");
					}

				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Press Enter key to continue...");
				System.in.read();

			} // End of case 3
				break;
			case 4: {
				System.out.print("Enter the name,  you want to update: ");
				String name = br.readLine();
				System.out.print("Enter the new address ");
				String address = br.readLine();
				System.out.print("Enter the new email ");
				String email = br.readLine();
				System.out.print("Enter the new telephone ");
				String telephone = br.readLine();

				try {
					int i = jdbc.updateData(name, address, email, telephone);
					if (i > 0) {
						System.out.println((count++) + " Data has been updated successfully");
					}

				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Press Enter key to continue...");
				System.in.read();

			} // end of case 4
				break;

			default:
				return;
			}

		} while (choice != 4);
	}

}
