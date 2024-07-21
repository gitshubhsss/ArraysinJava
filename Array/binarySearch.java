public class binarySearch {
    public static int binarySearchTech(int arr[],int key){
        int size=arr.length;
        int start=0;
        int end=size-1;

        while (start<=end) {
            int middle=(start+end)/2;
            if(arr[middle]==key){
                return middle;
            }
            else if(key<arr[middle]){
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int key=20;

        System.out.println(binarySearchTech(arr,key));;
    }
}
