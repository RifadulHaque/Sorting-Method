

public class MergeSortExample {

    public static void main(String[]args) {

        int array[]={-20,50,4,6,10,-4,12,17,2,51,62,11,19,-30};

        System.out.print("Unsorted Array :");
        print(array);

        MergeSortExample m= new MergeSortExample();

        m.mergesort(array,0,array.length-1);

        System.out.print("Sorted Array :");
        print(array);

    }


    //For printing the sorted and unsorted array
    public static void print(int arr[]){
        int l=arr.length;
        for(int i=0;i<l;i++){
            System.out.print((arr[i])+" ");
        }

        System.out.println();
    }

    void mergesort(int arr[],int lowerBound, int upperBound){
        if(lowerBound<upperBound){
            int mid=(upperBound+lowerBound)/2;

            //for sorting the array by dividing them into halves
            mergesort(arr,lowerBound,mid);
            mergesort(arr,mid+1, upperBound);

            merge(arr,lowerBound,mid,upperBound);

        }
    }

    void merge(int arr[],int lb,int m, int ub){

        //sizes of two subarrays to be merged
        int n1 = m - lb + 1;//left subarray
        int n2 = ub - m;//right sub array

        /* Create temp arrays */
        int L[] = new int[n1];//for left sub array
        int R[] = new int[n2];//for right sub array

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)//left sub array
            L[i] = arr[lb + i];
        for (int j = 0; j < n2; ++j)//right sub array
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = lb;


        //merging the left and right sub array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

}
