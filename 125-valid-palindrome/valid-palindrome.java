class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        return isPalindromeHelper(0, cleaned.toString(), cleaned.length()-1);
    }
    private boolean isPalindromeHelper(int left, String s, int right){
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}