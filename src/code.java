import java.util.*;
class code
{
	public static void main (String[] args) throws java.lang.Exception
	{try{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-->0){
	        int one = sc.nextInt();
	        int two = sc.nextInt();
	        int sum = one + 2*two;
	        if(sum % 2 != 0){
	                  System.out.println("NO");
	             }
	        else{
	                  if((sum/2)%2 != 0){
	                  if(one > 1 ){
	                            System.out.println("yes");
	                  }
	                  else{
	                            System.out.println("no");
	                  }
	                  }
	                  else{
                          System.out.println("yes");
                }
                
      }     // your code goes here
}}catch(Exception e){}
}
}

	    