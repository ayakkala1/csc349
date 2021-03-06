//Mani Movva (mmovva@calpoly.edu) and Anish Yakkala (ayakkala@calpoly.edu) Date: 04/05/19 Assignment: Project 1 


public class Sorts {
    public static void selectionSort(int[] arr, int N){
        for (int i = 0; i < N; i++){
            int minIndex = i;
            for (int j = i + 1; j < N; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void mergeSort(int[] list, int N){
        mergeSort(list, 0, N-1);
    }
    private static void mergeSort (int[] list,  int first,  int last) {
        if (first < last) {
            int middle = (first + last) / 2;
            mergeSort(list, first, middle);
            mergeSort(list, middle + 1, last);
            mergeSortedHalves(list, first, middle , last);
        }
    }
    private static void mergeSortedHalves (int[]  arr, int left, int middle, int right){
        int[] temp = new int[right - left + 1];

        int index1 = left;
        int index2 = middle + 1;
        int index = 0;

        while (index1 < middle + 1 &&  index2 < right + 1){
            if (arr[index1] <= arr[index2])
            {
                temp[index] = arr[index1];
                index1 = index1 + 1;
            }
            else
            {
                temp[index] = arr[index2];
                index2 = index2 + 1;
            }
            index = index + 1;
        }

        while (index1 < middle + 1)
        {
            temp[index] = arr[index1];
            index1 = index1 + 1;
            index = index + 1;
        }

        while (index2 < right + 1)
        {
            temp[index] = arr[index2];
            index2 = index2 + 1;
            index = index + 1;
        }

        int k = 0;
        for (int i = left; i < right + 1; i++){
            arr[i] = temp[k];
            k = k + 1;
        }
    }

    public static void quickSort (int[] arr, int N){
        quickSort(arr, 0, N-1);
    }

    private static void quickSort (int[] arr, int first, int last) {
        if (first < last){
            setPivotToEnd(arr,first,last);
            int pivotIndex = splitList(arr,first,last);
            quickSort(arr,first,pivotIndex-1);
            quickSort(arr,pivotIndex+1,last);
        }
    }

    private static void setPivotToEnd(int[] arr, int left, int right){
        int center = (left + right)/2;
        int temp;

        if (arr[left] > arr[center]){
            temp = arr[center];
            arr[center] = arr[left];
            arr[left] = temp;
        }
        if (arr[left] > arr[right]){
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
        }
        if (arr[right] > arr[center]){
            temp = arr[right];
            arr[right] = arr[center];
            arr[center] = temp;
        }
        //Chooses a pivot in arr[left..right] and place it at the end of the segment
        //Precondition: none
        //Postcondition: arr[right] is the pivot.s
    }




    private static int splitList (int[] arr, int left, int right){
        //Rearranges the list by placing the pivot so that it is preceded by smaller
        //values and followed by greater values. Returns pivot’s index.
        //Precondition: arr[right] contains the pivot
        //Postcondition: the pivot is properly placed and its index is returned.
        // Elements in the list are arranged so that arr[i]<pivot for all arr[i]
        // located to the left of pivot, and arr[i]>pivot for all arr[i] located to
        // the right of the pivot.

        int indexL = left;
        int indexR = right-1;
        int pivot = arr[right];
        int temp;

        while (indexL <= indexR) {
            while(arr[indexL] < pivot) {
                indexL++;
            }


            while ((indexL <= indexR)){
                if (arr[indexR] > pivot) {
                    indexR--;

                } else {

                    break;
                }
            }

            if (indexL <= indexR) {
                temp = arr[indexL];
                arr[indexL] = arr[indexR];
                arr[indexR] = temp;
                indexL++;
                indexR--;
            }
        }
        temp = arr[indexL];
        arr[indexL] = arr[right];
        arr[right] = temp;
        return indexL;
    }



}
