class Solution {
    Stack<Character> st;
    Stack<Character> st2;
    public boolean backspaceCompare(String s, String t) {
        st= new Stack<>();
        st2=new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(!st.isEmpty()) st.pop();
            }
            else st.push(s.charAt(i));
        }

        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(!st2.isEmpty()) st2.pop();
            }
            else st2.push(t.charAt(i));
        }
        while(!st.isEmpty() && !st2.isEmpty()){
            if(!st.pop().equals(st2.pop())) return false;

        }
        return st.isEmpty() && st2.isEmpty();
    }
}