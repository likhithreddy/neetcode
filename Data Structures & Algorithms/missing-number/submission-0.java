class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int res=0;
        for(int i=0;i<=len;i++){
            res^=i;
        }
        for(int num:nums){
            res^=num;
        }
        return res;
    }
}