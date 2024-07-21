public class continuousArr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 5, 2 };
        int totalSubarrays = 0;
        int n = arr.length;
        int i = 0;
        int min = Integer.MAX_VALUE;//to find the min value from array
        int max = Integer.MIN_VALUE;//to find the max value value form array
        int subMax = Integer.MIN_VALUE;//to find the max value from sub array
        int subMin = Integer.MAX_VALUE;//to find the min value from sub array
        int sum = 0;
        while (i < n) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    if (subMax < sum) {
                        subMax = sum;
                    }
                    if (subMin > sum) {
                        subMin = sum;
                    }
                    // System.out.print(arr[k] + " ");
                }
                System.out.print(sum);
                if (min > sum) {
                    min = sum;
                }
                if (max < sum) {
                    max = sum;
                }
                //after printing sum again initialize to 0
                sum = 0;
                System.out.println();
                totalSubarrays++;
            }
            // System.out.print("max sum : " + subMax+", ");
            // System.out.print(" min sum : " + subMin);

            //after printing submin and submax reinitalize it with original value
            subMin = Integer.MAX_VALUE;
            subMax = Integer.MIN_VALUE;
         
           
            i++;
        }
        // System.out.println("total subarrays : " + totalSubarrays);
        // System.out.println("Min sum : " + min);
        System.out.println("Max sum : " + max);
    }

}
