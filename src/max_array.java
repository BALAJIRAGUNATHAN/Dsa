public class max_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int a=arr[0];

        for(int i=0;i< arr.length;i++){
            if (a<arr[i]) {
                a=arr[i];
            }
        }
        System.out.println("largest number:"+a);

    }
}
