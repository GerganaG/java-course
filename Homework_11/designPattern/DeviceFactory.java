package designPattern;

public class DeviceFactory {

	private static DeviceFactory instance = new DeviceFactory();

	public DeviceFactory() {
		
	}

	public static DeviceFactory getInstance() {
		return instance;
	}

	public Device getDevice(String deviceType, String model, String brand, String supplement){
		
		if(deviceType == null){
			return null;
		}
		
		if(deviceType.equalsIgnoreCase("TABLET")){
			return new Tablet(model, brand, Integer.parseInt(supplement));
		} else if(deviceType.equalsIgnoreCase("PHONE")){
			return new Phone(model, brand, supplement);
		} else if(deviceType.equalsIgnoreCase("LAPTOP")){
			return new Laptop(model, brand, Float.parseFloat(supplement));
		} else{
			return null;
		}
	}
	
	
	
	
}
