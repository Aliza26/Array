import java.util.*;
public class Rotate {
	public static void LeaderElement(int[] t) {
		int LeaderEle = t[t.length-1];
		for(int i = t.length-1; i>0;i--) {
			if(t[i]>=LeaderEle) {
			    LeaderEle = t[i];
			System.out.println(LeaderEle);
			}
		}
		
	}
	 

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements present in the array:");
		 int n = sc.nextInt();
		 int []A = new int[n];
		 for(int i = 0; i<n; i++) {
			 A[i] = sc.nextInt();
		 }
		 LeaderElement(A);
		 
		

	}

	

	

}
