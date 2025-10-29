//Best Case: O(n)
public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int[] a=bubblesort(arr);
        for(int nums: a){
            System.out.print(nums+" ");
        }
    }
    static int[] bubblesort(int arr[]){
        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}