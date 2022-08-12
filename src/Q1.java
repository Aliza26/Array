import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int sum = 0;
		
		// TODO Auto-generated method stub
		
      while( n-- > 0) {
    	  
    	  sum += i;
    	  i =i+4;
    	  n--;
      }
      System.out.println(sum);
	}

}
