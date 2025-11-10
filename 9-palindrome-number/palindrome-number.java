class Solution {
    public boolean isPalindrome(int x) {
        // int N=x;
        // int revNum=0;
        // while(x>0){
        //     int lastdig=x%10;
        //     revNum=(revNum*10)+lastdig;
        //     x=x/10;
        // }
        // if(revNum==N) return true;
        // else return false;

        // OR
        int N=x;
        int revNum=0;
        if(x<0) return false;
        while(x>0){
            int lastdig=x%10;
            revNum=revNum*10+lastdig;
            x=x/10;
        }
        return revNum==N;
        
    }
}