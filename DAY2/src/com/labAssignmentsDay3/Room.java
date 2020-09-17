package com.labAssignmentsDay3;

public class Room {
	private int roomno;
	private String roomType;
	private double roomArea;
	private String acMachine;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomArea() {
		return roomArea;
	}
	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}
	public String getAcMachine() {
		return acMachine;
	}
	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	} 

	public void display() {
		System.out.println("Room number =" + 219);
		System.out.println("Room type=" + "Living");
		System.out.println("Room Area =" + 250.0);
		System.out.println("AC machine =" + "Samsung");
	}
	
}
