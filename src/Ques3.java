import java.util.*;

public class Ques3 {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> even_arr = new ArrayList<Integer>();
		 ArrayList<Integer> odd_arr = new ArrayList<Integer>();
	        System.out.println("Enter the record:");
	        int A[] = new int[5];
	        for(int t=0;t<5; t++){
	        	A[t] = sc.nextInt();
	        }
	        int i = 0;
		   while( i < 5) {
			   if(A[i]%2 == 0) {
				   even_arr.add(A[i]);
			   }
			   
			   else {
				   odd_arr.add(A[i]);}
			   i++;
		    }
		  
		 
		 System.out.println(even_arr);
		 System.out.println(odd_arr);
	}
}
