package com.javalab.api.pkg04;

public class GenericExample { // class s

	public static void main(String[] args) { // main s

		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	} // main e

} // class e
