package hashMapStudent;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMarks {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Integer>> mapIvan = new HashMap<>();
		
		ArrayList<Integer> marksIvanMath = new ArrayList<>();
		marksIvanMath.add(5);
		marksIvanMath.add(6);
		marksIvanMath.add(4);
		mapIvan.put("Math", marksIvanMath);
		
		ArrayList<Integer> marksIvanHistory = new ArrayList<>();
		marksIvanHistory.add(4);
		marksIvanHistory.add(4);
		marksIvanHistory.add(3);
		mapIvan.put("History", marksIvanHistory);
		
		ArrayList<Integer> marksIvanChemistry = new ArrayList<>();
		marksIvanChemistry.add(5);
		marksIvanChemistry.add(3);
		marksIvanChemistry.add(4);
		mapIvan.put("Chemistery", marksIvanChemistry);
		
		ArrayList<Integer> marksIvanBiology = new ArrayList<>();
		marksIvanBiology.add(5);
		marksIvanBiology.add(3);
		marksIvanBiology.add(4);
		mapIvan.put("Biology", marksIvanBiology);
		
		ArrayList<Integer> marksIvanGeography = new ArrayList<>();
		marksIvanGeography.add(4);
		marksIvanGeography.add(3);
		marksIvanGeography.add(4);
		mapIvan.put("Geography", marksIvanGeography);
		
		HashMap<String, ArrayList<Integer>> mapGergana = new HashMap<>();
		
		ArrayList<Integer> marksGerganaMath = new ArrayList<>();
		marksGerganaMath.add(5);
		marksGerganaMath.add(6);
		marksGerganaMath.add(6);
		mapGergana.put("Math", marksGerganaMath);
		
		ArrayList<Integer> marksGerganaHistory = new ArrayList<>();
		marksGerganaHistory.add(6);
		marksGerganaHistory.add(6);
		marksGerganaHistory.add(5);
		mapGergana.put("History", marksGerganaHistory);
		
		ArrayList<Integer> marksGerganaChemistry = new ArrayList<>();
		marksGerganaChemistry.add(5);
		marksGerganaChemistry.add(5);
		marksGerganaChemistry.add(4);
		mapGergana.put("Chemistery", marksGerganaChemistry);
		
		ArrayList<Integer> marksGerganaBiology = new ArrayList<>();
		marksGerganaBiology.add(5);
		marksGerganaBiology.add(6);
		marksGerganaBiology.add(5);
		mapGergana.put("Biology", marksGerganaBiology);
		
		ArrayList<Integer> marksGerganaGeography = new ArrayList<>();
		marksGerganaGeography.add(4);
		marksGerganaGeography.add(5);
		marksGerganaGeography.add(4);
		mapGergana.put("Geography", marksGerganaGeography);
		
		HashMap<String, ArrayList<Integer>> mapKaloqn = new HashMap<>();
		
		ArrayList<Integer> marksKaloqnMath = new ArrayList<>();
		marksKaloqnMath.add(5);
		marksKaloqnMath.add(3);
		marksKaloqnMath.add(4);
		mapKaloqn.put("Math", marksKaloqnMath);
		
		ArrayList<Integer> marksKaloqnHistory = new ArrayList<>();
		marksKaloqnHistory.add(4);
		marksKaloqnHistory.add(3);
		marksKaloqnHistory.add(3);
		mapKaloqn.put("History", marksKaloqnHistory);
		
		ArrayList<Integer> marksKaloqnChemistry = new ArrayList<>();
		marksKaloqnChemistry.add(5);
		marksKaloqnChemistry.add(6);
		marksKaloqnChemistry.add(4);
		mapKaloqn.put("Chemistery", marksKaloqnChemistry);
		
		ArrayList<Integer> marksKaloqnBiology = new ArrayList<>();
		marksKaloqnBiology.add(5);
		marksKaloqnBiology.add(4);
		marksKaloqnBiology.add(4);
		mapKaloqn.put("Biology", marksKaloqnBiology);
		
		ArrayList<Integer> marksKaloqnGeography = new ArrayList<>();
		marksKaloqnGeography.add(4);
		marksKaloqnGeography.add(4);
		marksKaloqnGeography.add(4);
		mapKaloqn.put("Geography", marksKaloqnGeography);
		
		
		Student first = new Student("Ivan", "Ivanov", 10, mapIvan);
		Student second = new Student("Gergana", "Georgieva", 4, mapGergana);
		Student third = new Student("Kaloqn", "Petrov", 13, mapKaloqn);
		
		System.out.println("First student:");
		System.out.println(first);
		
		first.addSubjectMark("Math", 3);
		first.addSubjectMark("History", 2);
		first.addSubjectMark("Geography", 4);
		
		System.out.println("After add mark:");
		System.out.println(first);
		
		System.out.println("Average mark (Math): ");
		float avMarkfirst = first.calculateAvarageMark("Math");
		System.out.println(avMarkfirst);
		System.out.println();
		
		System.out.println("Second Student:");
		System.out.println(second);
		
		second.addSubjectMark("Math", 5);
		second.addSubjectMark("History", 2);
		second.addSubjectMark("Chemistery", 4);
		
		System.out.println("After add mark:");
		System.out.println(second);
		
		System.out.println("Average mark (History): ");
		float avMarkSecond = second.calculateAvarageMark("History");
		System.out.println(avMarkSecond);
		System.out.println();
		
		System.out.println("Third Student:");
		System.out.println(third);
		
		third.addSubjectMark("Geography", 5);
		third.addSubjectMark("Math", 3);
		third.addSubjectMark("Chemistery", 6);
		
		System.out.println("After add mark:");
		System.out.println(third);
		
		System.out.println("Average mark (Chemistery): ");
		float avMarkThird = third.calculateAvarageMark("Chemistery");
		System.out.println(avMarkThird);

	}

}
