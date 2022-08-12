import java.util.Scanner;

public class Ques2 {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int even = 0,odd= 0;
	        System.out.println("Enter the record:");
	        int A[] = new int[5];
	        for(int t=0;t<5; t++){
	        	A[t] = sc.nextInt();
	        }
	        int i = 0;
		   while( i < 5) {
			   if(A[i]%2 == 0) {
				   even++;
			   }
			   
			   else {
				   odd++;}
			   i++;
		    }
		  
		 
		 System.out.println("Even numbers =" + even);
		 System.out.println("Odd numbers = " + odd);
	}
}
