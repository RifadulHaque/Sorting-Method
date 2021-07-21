public class Selection {

        public static void main (String[] args){

            int[] Array = {-37, 44, 10, 37, -50, 15, -5, 14, 40};


            System.out.print("Unsorted Array :");
            for(int i=0;i<Array.length-1;i++){
                System.out.print(Array[i]+" ");
            }

            //The outer for loop is used to decrement last unsorted Index once the largest element is set at the last index
            for(int lastUnsortedIndex=Array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
                //the largest element index is set to be the 0 index element
                int largestElementIndex=0;

                //the inner loop is for determining the largest element index by comparing the i=0 to all the
                //index elements
                for(int i=0;i<=lastUnsortedIndex;i++){
                    if(Array[i]>Array[largestElementIndex]){
                        largestElementIndex=i;
                    }
                }
                //After we find the largest element we simply swap it with the last index of the array
                swap(Array,largestElementIndex, lastUnsortedIndex);
            }





            System.out.println();

            System.out.print("Sorted Array :");

            for(int i=0;i<Array.length-1;i++){
                System.out.print(Array[i]+" ");
            }

        }

        //Swap method
        public static void swap(int[] array, int i, int j) {

            if (i == j) {
                return;
            }else{
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }//close swap class

}
