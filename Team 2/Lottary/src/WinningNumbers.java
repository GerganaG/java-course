import java.util.ArrayList;
import java.util.Random;

public class WinningNumbers {

	public WinningNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Integer> drawNumbers() {
		Random rand = new Random();
		ArrayList<Integer> listNum = new ArrayList<Integer>();
		while (listNum.size() < 5) {
			int luckyNum = rand.nextInt(30) + 1;
			if (!listNum.contains(luckyNum)) {
				listNum.add(luckyNum);
			}
		}
		return listNum;
	}

}