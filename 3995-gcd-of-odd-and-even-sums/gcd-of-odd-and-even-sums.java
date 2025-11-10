class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0) sumOdd+=i;
            else sumEven+=i;
        }
        int a=sumOdd, b=sumEven;
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) return b;
        return a;
    }
}