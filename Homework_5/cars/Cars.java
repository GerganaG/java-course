package cars;

public class Cars {

	public static void main(String[] args) {
		
		Car[] cars = new Car[10];
		
		cars[0] = new Automobile(5000, 0.05);
		cars[1] = new Automobile(4500, 0.04);
		cars[2] = new Automobile(10000, 0.1);
		cars[3] = new Automobile(8000, 0.07);
		cars[4] = new Automobile(3000, 0.04);
		cars[5] = new SUV(12000, true);
		cars[6] = new SUV(20000, true);
		cars[7] = new SUV(15000, false);
		cars[8] = new SUV(60000, false);
		cars[9] = new SUV(10000, true);
		
		System.out.println("Array: ");
		
		for(int i = 0; i < cars.length; i++){
			cars[i].printPrice();
		}
		
		System.out.println();
		sort(cars);
	}
	
	public static void sort(Car[] array){
		
		for(int j = 0; j < array.length; j++){
			for(int i = 0; i < array.length - 1; i++){
				if(array[i].price > array[i + 1].price){
					int temp;
					temp = array[i + 1].price;
					array[i + 1].price = array[i].price;
					array[i].price = temp;	
				}
			}
		}
		System.out.println("Sort array: ");
		
		for(int i = 0; i < array.length; i++){
			array[i].printPrice();
		}	
	}

}
