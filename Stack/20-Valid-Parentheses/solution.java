class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            if(currChar == '(' || currChar == '{' || currChar == '['){
                charStack.push(currChar);
            }
            else if(currChar == ')'){
                if(charStack.isEmpty() || charStack.pop() != '('){
                    return false;
                }
            }
            else if(currChar == '}'){
                if(charStack.isEmpty() || charStack.pop() != '{'){
                    return false;
                }
            }
            else if(currChar == ']'){
                if(charStack.isEmpty() || charStack.pop() != '['){
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}