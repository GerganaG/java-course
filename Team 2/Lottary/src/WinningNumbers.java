import java.util.Random;
 
public class WinningNumbers {
 
        public WinningNumbers() {
                super();
                // TODO Auto-generated constructor stub
        }
 
        public  int[] drawNumbers() {
                Random rand = new Random();
                int [] winNumb = new int [5];
                for(int i = 0 ; i < 5 ; i++){
                winNumb[i] = rand.nextInt(30)+1;
                }
                return winNumb;
        }
       
       
}