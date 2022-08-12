import java.util.*;
public class copyArray {

	public static void main(String[] args) {
		int []A = {23, 90, 89, 67, 45, 34};
		int [] B = new int[A.length];
		B = Arrays.copyOf(A, A.length);
		for(int i = 0; i<A.length; i++) {
			System.out.println(B[i]+" ");
		}

	}

}
