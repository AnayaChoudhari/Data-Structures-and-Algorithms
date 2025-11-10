class Solution {
    public int countDigits(int num) {
        int dig=0;
        int count=0;
        int N=num;
        while(num>0){
            dig=num%10;
            if(N%dig==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}