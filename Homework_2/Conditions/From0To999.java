import java.util.Scanner;

public class From0To999 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in, "UTF-8");
		System.out.println("Enter integer [0 - 999]: ");
		int number = scn.nextInt();
		int hundreds = number / 100;
		int temp = number / 10;
		int tens = temp % 10;
		int ones = number % 10;
		
		if(hundreds != 0){
			switch(hundreds){
				case 1: System.out.print("one hundred ");
						break;
				case 2: System.out.print("two hundred ");
						break;
				case 3: System.out.print("three hundred ");
						break;
				case 4: System.out.print("four hundred ");
						break;
				case 5: System.out.print("five hundred ");
						break;
				case 6: System.out.print("six hundred ");
						break;
				case 7: System.out.print("seven hundred ");
						break;
				case 8: System.out.print("eight hundred ");
						break;
				case 9: System.out.print("nine hundred ");
						break;
			}
		}
		
		if(tens == 0){
			switch(ones){
			case 0: System.out.println("zero");
					break;
			case 1: System.out.println("one");
					break;
			case 2: System.out.println("two");
					break;
			case 3: System.out.println("three");
					break;
			case 4: System.out.println("four");
					break;
			case 5: System.out.println("five");
					break;
			case 6: System.out.println("six");
					break;
			case 7: System.out.println("seven");
					break;
			case 8: System.out.println("eight");
					break;
			case 9: System.out.println("nine");
					break;
			}	
		} else if(tens == 1){
			switch(ones){
			case 0: System.out.println("ten");
					break;
			case 1: System.out.println("eleven");
					break;
			case 2: System.out.println("twelve");
					break;
			case 3: System.out.println("thirteen");
					break;
			case 4: System.out.println("fourteen");
					break;
			case 5: System.out.println("fifteen");
					break;
			case 6: System.out.println("sixteen");
					break;
			case 7: System.out.println("seventeen");
					break;
			case 8: System.out.println("eighteen");
					break;
			case 9: System.out.println("nineteen");
					break;
			}		
		} else if(tens > 1){
			switch(tens){
			case 2: 
				System.out.print("twenty ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
				}	
					break;
			case 3: 
				System.out.print("thirty ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
					}	
					break;
			case 4: 
				System.out.print("forty ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
					}	
				break;
			case 5: 
				System.out.print("fifty ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
				}	
				break;
			case 6: 
				System.out.print("sixty ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
				}	
				break;
			case 7: 
				System.out.print("seventy ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
				}	
				break;
			case 8: 
				System.out.print("eighty ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
				}	
				break;
			case 9: 
				System.out.print("ninety ");
				switch(ones){
					case 0: System.out.println("");
							break;
					case 1: System.out.println("one");
							break;
					case 2: System.out.println("two");
							break;
					case 3: System.out.println("three");
							break;
					case 4: System.out.println("four");
							break;
					case 5: System.out.println("five");
							break;
					case 6: System.out.println("six");
							break;
					case 7: System.out.println("seven");
							break;
					case 8: System.out.println("eight");
							break;
					case 9: System.out.println("nine");
							break;
				}	
				break;
			}		
			
		}
			scn.close();
		}

	}


				
