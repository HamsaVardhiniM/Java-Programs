class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<Character>();
        int l=s.length();
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c=='{'||c=='('||c=='['){
                    st.push(c);
                }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(c=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else return false;
                }
                else if(c==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else return false;
                }
                else if(c==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }
                    else return false;
                }

            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
}
}


