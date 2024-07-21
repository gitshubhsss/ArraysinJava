public class target {
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<end){

          int sum=nums[start]+nums[end];
           if(sum==target){
            return new int[]{start, end};
           }
           else if(target<sum){
            end--;
           }
           else{
            start++;
           }
        }
        return null;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,6,4};
        int target=3;
        int sum[]=twoSum(nums,target);
        System.out.println(sum);;
    }
}
