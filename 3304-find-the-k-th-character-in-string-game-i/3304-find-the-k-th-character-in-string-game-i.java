class Solution {
    public char kthCharacter(int k) {
        if(k==1) return 'a';
        long len=1;

        while(len*2<k) len*=2;
        if(k<=len) return kthCharacter(k);

        return (char)(kthCharacter(k-(int)len)+1);
    }
}