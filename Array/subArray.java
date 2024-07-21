public class subArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};

        int i=0;
        while (i<arr.length) {
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
            i++;
        }

    }
}
