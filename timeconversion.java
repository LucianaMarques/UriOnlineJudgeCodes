import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		int N = var.nextInt(), hours, min;
	    hours = N/3600;
	    if (hours > 0){
	        N = N - hours*3600;
	    }
	    min = N/60;
	    if (min > 0){
	        N = N - min*60;
	    }
	    System.out.printf("%d:%d:%d\n",hours,min,N);
	}
}
