//Best Case: O(n)


//time complexity of bubble sort is n^2 becz two for loop used
public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubblesort(arr);
        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }
    static void bubblesort(int arr[]){
        boolean swap;
        for(int i=0;i< arr.length;i++) {
            swap=false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
                if(!swap){
                    break;

                }
            }
        }
    }
}