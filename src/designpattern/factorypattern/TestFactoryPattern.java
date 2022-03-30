package designpattern.factorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFactoryPattern {

	public static void main(String[] args) throws IOException {
		String roomTypeName = "";
		String noOfRooms = "";
		RoomType roomType = null;
		boolean roomstatus = false;
		boolean noOfRoomstatus = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TestFactoryPattern testPattern = new TestFactoryPattern();

		GetRoomFactory roomFactory = new GetRoomFactory();
		roomTypeName = testPattern.getRoomInputs(br);

		while (!roomstatus) {

			if (null != roomTypeName && roomTypeName.equalsIgnoreCase("singleroom")
					|| roomTypeName.equalsIgnoreCase("doubleroom") || roomTypeName.equalsIgnoreCase("deluxroom")) {
				roomType = roomFactory.getRoomType(roomTypeName);
				roomstatus = true;
			} else {
				System.out
						.println("your have entered wrong room type. please press enter key to reenter the room type.");
				roomTypeName = testPattern.getRoomInputs(br);
			}
		}

		noOfRooms = testPattern.getNoOfRooms(br);
		while (!noOfRoomstatus) {
			
			
			if (null != noOfRooms && "" !=noOfRooms && noOfRooms.equals("1") ||noOfRooms.equals("2") ||noOfRooms.equals("3") ||noOfRooms.equals("4") ||noOfRooms.equals("5") ||noOfRooms.equals("6") ||noOfRooms.equals("7") ||noOfRooms.equals("8") ||noOfRooms.equals("9")) {
				roomType.getRate();
				noOfRoomstatus = true;
			} else {
				System.out.println(
						"your have entered wrong no of rooms. please press enter key to reenter the no of rooms.");
				noOfRooms = testPattern.getNoOfRooms(br);
			}
		}

		double roomPrice = roomType.calculateRoomRate(Integer.parseInt(noOfRooms));

		System.out.println("your room " + roomTypeName + " ////  costs  :  " + roomPrice);

	}

	public String getRoomInputs(BufferedReader brr) throws IOException {
		System.out.println("Enter the room type that you want to book  :  ");
		return brr.readLine();

	}

	public String getNoOfRooms(BufferedReader brr) {
		try {
			System.out.println("Enter the number of rooms that you want to book  :  ");
			return brr.readLine();

		} catch (Exception e) {
			System.out.println("error in get no of rooms  :  " + e);
			return "";
		}

	}


}
