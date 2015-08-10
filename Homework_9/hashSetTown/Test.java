package hashSetTown;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		Town london = new Town("London", "England", 8173941);
		Town madrid = new Town("Madrid", "Spain", 3213271);
		Town paris = new Town("Paris", "France", 2340000);
		Town sofia = new Town("Sofia", "Bulgaria", 1291591);
		Town varna = new Town("Varna", "Bulgaria", 330000);
		
		HashSet<Town> cities = new HashSet<Town>();
		
		cities.add(london);
		cities.add(madrid);
		cities.add(paris);
		cities.add(sofia);
		cities.add(varna);
		
		System.out.println(cities);
		
		Iterator<Town> it = cities.iterator();
		while(it.hasNext()){
			Town tempTown = it.next();
			if(tempTown.getNameOfTown().equals("Varna")){
				System.out.println(tempTown.getNameOfTown() + " was deleted!!");
				it.remove();
			}
		}
			
		System.out.println(cities);
	}
}
