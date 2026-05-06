import java.util.*;

class Solution {
    public String decodeString(String s) {
        
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        
        StringBuilder curr = new StringBuilder();
        int num = 0;
        
        for (char c : s.toCharArray()) {
            
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '[') {
                countStack.push(num);
                stringStack.push(curr);
                
                curr = new StringBuilder();
                num = 0;
            }
            else if (c == ']') {
                
                int k = countStack.pop();
                StringBuilder prev = stringStack.pop();
                
                StringBuilder temp = new StringBuilder(prev);
                
                for (int i = 0; i < k; i++) {
                    temp.append(curr);
                }
                
                curr = temp;
            }
            else {
                curr.append(c);
            }
        }
        
        return curr.toString();
    }
}