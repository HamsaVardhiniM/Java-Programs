class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
    
        int flag=0;
        s=s.replaceAll("[^a-z0-9]","");
        int l=s.length();
        for(int i=0,j=l-1;i<=j;i++,j--){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2){
                flag++;
                break;
            }
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
}
