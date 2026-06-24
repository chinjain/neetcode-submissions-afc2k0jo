class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();

        for(char c : ch){

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else {
                if(st.isEmpty()){
                    return false;
                }

                char top = st.pop();

                if(!isValid(c, top)){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    static boolean isValid(char curr, char top){
        return (top == '{' && curr == '}') ||
                (top == '(' && curr ==')') ||
                (top == '[' && curr == ']');
    }
}
