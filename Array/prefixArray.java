public class prefixArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,1};
        int sum=0;
        int n=arr.length;
        int i=0;
        while (i<n) {
            for(int j=i;j<=i;j++){
                sum=sum+arr[j];
            }
            arr[i]=sum;
            i++;
        }
        for(int index=0;index<n;index++){
            System.out.print(arr[index]+" ");
        }
    }
}
