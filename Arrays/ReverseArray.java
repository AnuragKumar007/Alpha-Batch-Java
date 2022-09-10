public class ReverseArray {
    public static void reverse(int arr[]){
        int first =0, last = arr.length-1, temp=0;
        while(first<last){
            temp = arr[last];
            arr[last]=arr[first];
            arr[first]= temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        reverse(arr);
        for(int i=0;i<8;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
