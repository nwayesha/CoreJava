package designpattern;

public abstract class RoomType {
	protected double rate;
	abstract void getRate();
	
	public double calculateRoomRate(int noOfRooms) {
		return noOfRooms*rate;
	}
}
