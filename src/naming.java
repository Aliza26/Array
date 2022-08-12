import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class naming
{
	public static void main (String[] args) throws IOException
	{
	      try{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	              int t = Integer.parseInt(br.readLine());
	              while(t-->0){
	                   String str = br.readLine();
	                   HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
	                   for(int i = 0; i < str.length(); i++){
	                      if(hash.containsKey(str.charAt(i))){
                               hash.put(str.charAt(i),(hash.get(str.charAt(i)))+1);
                            }
                         else{
                            hash.put(str.charAt(i),1);
	                        }
	                   }
	                   int k = Integer.parseInt(br.readLine());
	                   int count = 0;
	                   for(int j = 0; j < k; j++){
	                       String p = br.readLine();
	                       for(int c = 0; c < p.length(); c++){
	                           if(hash.containsKey(p.charAt(c)) == true && hash.get(p.charAt(c)) > 0 ){
	                               hash.put(p.charAt(c),(hash.get(p.charAt(c)))+1);
	                               
	                           }
	                           else{
	                               count++;
	                           }
	                               
	                       }
	                   }
	                   if(count == 0){
	                       System.out.println("Yes");
	                   }
	                   else{
	                       System.out.println("No");
	                   }
	                   
	              }
	      }catch(Exception e){}
	      
	      
	}
}
	      
	      
	      
	      
	
	


