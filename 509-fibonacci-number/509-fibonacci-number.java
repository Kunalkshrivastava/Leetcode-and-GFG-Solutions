class Solution {
    public int fib1(int n, int[] a){
        if(n <= 1){
            a[n] = n;
            return n;
        }
        if(a[n] != 0) return a[n];
        
        int  ans = fib1(n-1,a) + fib1(n-2,a);
        a[n] = ans;
        return a[n];
    }
    public int fib(int n) {
        int[] a = new int[n+1];
        
        return fib1(n,a);
    }
}