public class Insertion {

    public static void main(String[]args){

        int[] Array={41,20,-14,31,10,5,-3,7,-18,10,12,3};


        System.out.print("Unsorted Array :");

        for(int i=0;i<Array.length-1;i++){
            System.out.print(Array[i]);
        }



        //Here in insertion sort we compare the element that we select until the index is 0
        //After comparing that element we increment the index to compare the next element with all the previous
        //index elements

        for(int unSortedElement=1; unSortedElement<Array.length-1; unSortedElement++){


            //Setting the element at index 1 as the first unsorted element
            int newUnSortedElement=Array[unSortedElement];

            //i is reset to a new element every time we step out of the inner loop
            int i;


            for(i=unSortedElement;i>0 && Array[i-1]>newUnSortedElement;i--){
                Array[i]=Array[i-1];

            }
            //Here Array at i is the index from which the second loop ends
            //we set the lowest element at that index as newUnSortedElement is the lowest index
            //once we step out of the second loop
             Array[i]=newUnSortedElement;
        }



        System.out.print("Sorted Array :");

        for(int i=0;i<Array.length-1;i++){
            System.out.print(Array[i]);
        }





    }


}
