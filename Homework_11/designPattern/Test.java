package designPattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		
		DeviceFactory factory = DeviceFactory.getInstance();
		
		System.out.print("Enter device: ");
		String deviceType = scn.nextLine();
		System.out.print("Enter model: ");
		String model = scn.nextLine();
		System.out.print("Enter brand: ");
		String brand = scn.nextLine();
		
		if(deviceType.equalsIgnoreCase("TABLET")){
			System.out.print("Enter price: ");
			String price = scn.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, price);
			device.giveInfo();
		} else if(deviceType.equalsIgnoreCase("PHONE")){
			System.out.print("Enter color: ");
			String color = scn.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, color);
			device.giveInfo();
		} else if(deviceType.equalsIgnoreCase("LAPTOP")){
			System.out.print("Enter weight: ");
			String weight = scn.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, weight);
			device.giveInfo();
		}
		
		scn.close();

	}

}
