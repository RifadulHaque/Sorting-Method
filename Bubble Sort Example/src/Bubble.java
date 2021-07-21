public class Bubble {

    public static void main(String[] args) {
        int[] Array = {-37, 55, 22, 5, -50, 15, 9, 10, 40};


        System.out.print("Unsorted Array :");
        for(int i=0;i<Array.length-1;i++){
            System.out.print(Array[i]+" ");
        }

        //the outer for loop is used for decrementing the last unsortedindex
        //once the largest element gets there
        for (int lastUnsortedIndex = Array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //the inner for loop swaps i with its next index
            //if the element at i is less than i+1 then no swap takes place
            //And i is incremented to the largest element and starts comparing with the next elements
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (Array[i] > Array[i + 1]) {
                    swap(Array, i, i + 1);
                }
            }
        }

        System.out.println();

        System.out.print("Sorted Array :");

        for(int i=0;i<Array.length-1;i++){
            System.out.print(Array[i]+" ");
        }


    }


    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        } else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}//end of Bubble Class
