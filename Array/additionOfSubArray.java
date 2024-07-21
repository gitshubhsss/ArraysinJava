public class additionOfSubArray {
    public static void main(String[] args) {
        int arr[]={2,4,5,1,2};
        int n=arr.length;
        int sum=0;
        int subMax=Integer.MIN_VALUE;
        int i=0;
        while (i<n) {
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[i];
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" = "+sum);
                if(subMax<sum){
                    subMax=sum;
                }
                sum=0;
                System.out.println();
            }
            System.out.println("Max : "+subMax);
            subMax=Integer.MIN_VALUE;
            System.out.println();
            i++;
        }
    }
}
