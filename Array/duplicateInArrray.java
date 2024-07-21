public class duplicateInArrray {
    public static boolean isUnique(int arr[]){
        int n=arr.length;
        int i=0;
        while (i<n) {
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(isUnique(arr));
    }
}
