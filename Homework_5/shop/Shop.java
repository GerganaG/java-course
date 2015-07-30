package shop;

import stocks.Stock;

public class Shop {
	protected String name;
	protected String location;
	
	public Shop() {
		this.name = "";
		this.location = "";
	}
	
	public Shop(String name, String location){
		setName(name);
		setLocation(location);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	Stock[] array = new Stock[5];
	
	public Stock[] add(Stock[] arr, Stock stock){
		
		Stock[] temp = new Stock[arr.length + 1];
		for(int i = 0; i < arr.length; i++){
			temp[i] = arr[i];
		}
		temp[arr.length] = stock;
		arr = null;
		return temp;
	}
	
	public void available(Stock[] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i].getAvailable() == false){
				System.out.printf("Stock %d is not available!\n", i);
			} else{
				System.out.printf("Stock %d is available!\n", i);
			}
		}
	}

}
