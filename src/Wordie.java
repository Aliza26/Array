import java.util.*;
public class Wordie {

	public static void main (String[] args) throws java.lang.Exception
	{try{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	              String s1 = sc.next();
	              String s2 = sc.next();
	              for(int i = 0; i < 5; i++){
	                        if(s1.charAt(i) == s2.charAt(i)){
	                                  System.out.print("G");
	                        }
	                        else{
	                                  System.out.print("B");
	                        }
	                        
	              }
	              System.out.println();
	    }
	}catch(Exception e){}
	}
}


