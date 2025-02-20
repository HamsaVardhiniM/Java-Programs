class Solution {
    public int missingNumber(int[] nums) {
        
        int l=nums.length;
        for(int i=0;i<l;i++){
            int flag=0;
            for(int j=0;j<l;j++){
                if (nums[j]==i){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                
                return i;
            }
        }
        
        return l;
        
    }

}
