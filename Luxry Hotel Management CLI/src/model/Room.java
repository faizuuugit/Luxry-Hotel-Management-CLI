package model;

public class Room implements IRoom {
	
	private Integer roomNumber;
	private Double price;


	public Room( Integer roomNumber, Double price) {
		super();
	
		this.roomNumber = roomNumber;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", price=" + price + "]";
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public Integer getRoomNumber() {
		// TODO Auto-generated method stub
		return roomNumber;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	
}
