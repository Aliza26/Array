import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  try{
	            Scanner sc = new Scanner(System.in);
	            int t = sc.nextInt();
	            while(t-->0){
	                      int k = sc.nextInt();
	                      String s = sc.next();
	                      int chef = 0;
	                      int calas = 0;
	                      for(int i = 0; i < 14; i++){
	                            if(s.charAt(i) == 'N'){
	                                      chef += 2;
	                            }    
	                            else if(s.charAt(i) == 'C'){
	                                      calas =+ 2;
	                            }
	                            else{
	                                      chef++;
	                                      calas++;
	                            }
	                      }
	                      if(calas > chef)
	                      {
	                             System.out.println(k*60);
	                                
	                      }
	                      else if(calas < chef){
	                                System.out.println(k*40);
	                      }
	                      else{
	                                System.out.println(k*55);
	                      }
	            }
	  }catch(Exception e){}
	  }	// your code goes her
}
