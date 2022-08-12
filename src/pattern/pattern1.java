package pattern;
import java.util.*;
import java.io.*;
public class pattern1 {
	
	 public static boolean check(char[] ch, int l){
	        for(int i = 0; i < l; i++){
	            if(ch[i] != ch[i+l]){
	                return false;
	            }
	        }
	        return true;
	    }
		public static void main (String[] args) throws IOException
		{
		      try{
		          Scanner sc = new Scanner(System.in);
		          int t = sc.nextInt();
		          while(t-->0){
		              int n = sc.nextInt();
		              String p = sc.next();
		              
		              char []arr = p.toCharArray();
		              boolean k = true;
		              if((n == 2 && arr[0] == arr[1] )|| n == 1){
		                  System.out.println("yes");
		                  continue;
		              }
		              else if(n == 2 && arr[0] != arr[1]){
		                  System.out.println("no");
		                  continue;
		              }
		              while(n > 2){
		                  if(n%2 == 0){
		                     k = check(arr,n/2);
		                     n = n/2;
		                  }
		                  else{
		                      int temp = (n-1)/2;
		                      k = check(arr,temp);
		                      n = temp;
		                  }
		                  if(k == false){
		                      break;
		                  }
		              }
		              if(n < 2){
		                  System.out.println("Yes");
		              }
		              else{
		                  System.out.println("No");
		              }
		              
		              }
		           
		          
		          
		      
		      }catch(Exception e){}
		      
		      
		      
		      
		      
		      
		      	// your code goes here
		}
	}




