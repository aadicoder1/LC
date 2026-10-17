class Solution {
    public String decodeString(String s) {
        Stack<Integer> ns=new Stack<>();
        Stack<String> st=new Stack<>();
        StringBuilder cur=new StringBuilder();
        int n=0;

        for(char c:s.toCharArray()){
            if (Character.isDigit(c)) {
                n=n*10+(c-'0');
            } 
            else if(c=='['){
                ns.push(n);
                st.push(cur.toString());
                n=0;
                cur=new StringBuilder();
            } 
            else if(c==']'){
                int k=ns.pop();
                String prev=st.pop();
                StringBuilder temp=new StringBuilder(prev);
                for(int i=0;i<k;i++) temp.append(cur);
                cur=temp;
            } 
            else cur.append(c);
        }

        return cur.toString(); 
    }
}