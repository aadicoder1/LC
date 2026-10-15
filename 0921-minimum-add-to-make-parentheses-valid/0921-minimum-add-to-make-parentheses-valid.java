class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(st.isEmpty() && c==')') {
                st.push(')');
                cnt++;
            }
            else if(!st.isEmpty() && c==')'){
                if(st.peek()=='('){ 
                    st.pop();
                    cnt--;
                }
                else {
                    st.push(')');
                    cnt++;
                }
            } else{
                st.push('(');
                cnt++;
            } 
        }
        return Math.abs(cnt);
    }
}