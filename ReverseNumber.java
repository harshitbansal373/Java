
import java.util.Scanner;
public class ReverseNumber {


	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int val;
        while (i<=n){
            int j = 1;
            val = i;
            while (j<=i){
                System.out.print(val);
                val--;
                j = j+1;
            }
            System.out.println();
            i++;
        }

		
	}

}
