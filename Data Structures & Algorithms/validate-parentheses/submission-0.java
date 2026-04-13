class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else {
                if(st.isEmpty()) return false;
                
                char top = st.pop();
                if(!isMatched(ch,top)){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    static boolean isMatched(char ch, char top){
        return (top == '(' && ch == ')') 
        || (top == '{' && ch == '}')
        || (top == '[' && ch == ']');
    }
}
