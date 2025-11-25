public class selection_sort {
    public static void main(String[] args) {
        int arr[]={5,1,1,2,0,0};
        int a[]=name(arr);
        for(int nums:a){
            System.out.print(nums);
        }
    }
    static int[] name(int arr[]){

        int min=-1;
        for(int i=0;i<arr.length-1;i++){
            min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
}