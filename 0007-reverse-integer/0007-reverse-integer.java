class Solution {
    public int reverse(int x) {
        
        long n=x,rev=0;

        while(n!=0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        
        if(rev==(int)rev)
        {
            return (int)rev;
        }
        else
        {
            return 0;
        }
    }
}