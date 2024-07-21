public class watertank {
    public static int maxArea(int[] height) {
        int n=height.length;
        int maxArea=0;
        int i=0;
        int end=n-1;
        int start=0;
        while(start<end){
            int h=Math.min(height[start], height[end]);
            int w=end-start;
            int totoalArea=h*w;

            if(maxArea<totoalArea){
                maxArea=totoalArea;
            }
            if (height[start]<height[end]) {
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int max=maxArea(height);
        System.out.println(max);
    }
}
