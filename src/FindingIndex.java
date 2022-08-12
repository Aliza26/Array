import java.util.Scanner;

public class FindingIndex {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the 7 elements of Array:");
	        int A[] = new int[7];
	        for(int t=0;t<7; t++){
	        	A[t] = sc.nextInt();
	        }
	        System.out.println("Enter the number to be searched:");
	        int k = sc.nextInt();
	        int i =0, c = 0;
		   while( i < 7) {
			   if(A[i] == k) {
				   c = 1;
				   break;
			   }
			   
			   else {
				   i++;}
		    }
		   if(c==0) {
			   System.out.println("Number not found");
			   
		   }
		   else {
			   System.out.println("Number found");
		   }
		   

	}

}
