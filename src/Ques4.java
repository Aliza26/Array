import java.util.*;

public class Ques4{
	   public static List<Integer> spiralOrder(int[][] matrix) {
           
           int row = matrix.length - 1;
           int column = matrix[0].length - 1;
           List<Integer> l = new LinkedList<Integer>();
           
           int startI  = 0;
           int end = 0;
           int startC = 0;
           while(row > 1 ){
           if(startI <= row) {
           for(;startC < column; ++startC){
                   l.add(matrix[startI][startC]);
           }
           
           startI++;
           startC--;
           }
           if(startC <= column) {
           for(; startI < row; startI++){
                   l.add(matrix[startI][startC]);
           }
           
           startC--;
           startI--;
           }
           if(startI <= row) {
           for(; startC >= end; startC--){
                   l.add(matrix[startI][startC]);
           }
           
           startI--;
           startC++;
           }
           if(startC <= column) {
           for(; startI > end; startI--){
                   l.add(matrix[startI][startC]);
           }
           
           startI++;
           startC++;
           }
           column--;
           row--;
           end++;
           
           }
           return l;
   }
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int Rows = sc.nextInt();

int columns = sc.nextInt();
		 List<Integer> ll = new LinkedList<Integer>();
		 
		 int [][]abc = new int[Rows][columns];
		 
		 for(int i = 0; i < Rows; i ++) {
			 for(int j = 0; j < columns; j++) {
				 abc[i][j] = sc.nextInt();
			 }
		 }
		 ll = spiralOrder(abc);
		 for(int k : ll) {
			 System.out.println(k);
		 }
		 
		/* ArrayList<Integer> odd_arr = new ArrayList<Integer>();
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
		 */
		 
	}
}
