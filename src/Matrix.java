import java.util.*;
public class Matrix {
	public static void SumMatrix(int[][] t,int[][] s,int u,int v) {
		for(int i = 0; i<u; i++) {
			System.out.println();
			 for(int j = 0; j<v; j++) {
			 System.out.print(t[i][j]+s[i][j]);
		 }
		}
	}
	 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of elements present in the array:");
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int [][]A = new int[n][m];
		 int[][] B = new int[n][m];
		 System.out.println("Enter the numbers of First Matrix:");
		 for(int i = 0; i<n; i++) {
			 for(int j = 0; j<m; j++) {
			 A[i][j] = sc.nextInt();
		 }
		 }
			 System.out.println("Enter the number of second matrix:");
			 for(int p = 0; p<n; p++) {
				 for(int q = 0; q<m; q++) {
				 B[n][m] = sc.nextInt();
			 } 
			 }
		 SumMatrix(A,B,n,m);
	}

	}

