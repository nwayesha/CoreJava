package designpattern.creational.factorypattern;

public class GetRoomFactory {

	public RoomType getRoomType(String roomType) {
		if (null == roomType) {
			return null;
		} else if (roomType.equalsIgnoreCase("SingleRoom")) {
			return new SingleRoom();
		} else if (roomType.equalsIgnoreCase("DoubleRoom")) {
			return new DoubleRoom();
		} else if (roomType.equalsIgnoreCase("DeluxRoom")) {
			return new DeluxRoom();
		} else {
			return null;
		}

	}

}
