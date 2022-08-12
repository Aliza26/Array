 import java.util.*;
class twoPointer{
public static int singleNumber(int[] nums) {
           int arr[] = new int[32];
            Arrays.fill(arr,0);
            
            
           for(int j = 0; j < nums.length; j++){
                int count = 0;
                  while(nums[j] > 0){                               
                          if((nums[j] & 1) == 1){
                              arr[count] = arr[count] + 1;
                                           
                             }
                          nums[j] = nums[j]/2;
                    count++;
                   }
           }
            int ans = 0;
            for(int i = 0; i < 32; i++){
                    if(arr[i] % 3 > 0){
                            ans += Math.pow(2,i);
                    }
            }
           return ans; 
    }
public static boolean isValid(String s) {
    
    Stack stack = new Stack();
    
    char []arr = s.toCharArray();
    
    for(int i = 0; i < arr.length; i++){
            if(arr[i] == '{' ||arr[i] == '[' || arr[i] == '('){
            stack.push(arr[i]);
            }
            else if(!stack.isEmpty()){
            char temp =(char) stack.peek();
            
            if((temp == '(' && arr[i] == ')')||(temp ==  '{' && arr[i] == '}')||(temp == '[' && arr[i] == ']')){
                    stack.pop();
                    
            }
            }
               else{
                       return false;
               }
         
    }
    if(stack.isEmpty()){
            return true;
    }
 return false;
}
int longestValidParentheses(string s) {
    int n = s.length(), longest = 0;
    stack<int> st;
    for (int i = 0; i < n; i++) {
        if (s[i] == '(') st.push(i);
        else {
            if (!st.empty()) {
                if (s[st.top()] == '(') st.pop();
                else st.push(i);
            }
            else st.push(i);
        }
    }
    if (st.empty()) longest = n;
    else {
        int a = n, b = 0;
        while (!st.empty()) {
            b = st.top(); st.pop();
            longest = max(longest, a-b-1);
            a = b;
        }
        longest = max(longest, a);
    }
    return longest;
}

  public static void main(String args[]) {
	  String s = "{[]}";
	  boolean ans = isValid(s);
	  System.out.println(ans);
  }
}