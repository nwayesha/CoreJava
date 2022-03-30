package designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFactoryPattern {

	public static void main(String[] args) throws IOException {
		GetRoomFactory roomFactory = new GetRoomFactory();
		System.out.println("Enter the room type that you want to book  :  ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String roomTypeName = br.readLine();
		
		System.out.println("Enter the number of rooms that you want to book  :  ");
		int noOfRooms = Integer.parseInt(br.readLine());
		
		RoomType roomType= roomFactory.getRoomType(roomTypeName);
		roomType.getRate();
		double roomPrice = roomType.calculateRoomRate(noOfRooms);
		
		System.out.println("your room "+roomTypeName +" ////  costs  :  "+ roomPrice);
	}

}
