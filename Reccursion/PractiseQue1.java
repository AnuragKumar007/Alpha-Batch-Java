//Question
// For a given integer array of size N. You have to find all the occurrence (indices) 
// of a given element (Key) and print them. Use a recursive function to solve this problem.


public class PractiseQue1 {
    public static void indices(int arr[], int key, int idx){
        //base
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx +" ");
        }
        //kaam
        indices(arr, key, idx+1);
        return;
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,5,7,2,4};
        int key =2;
        indices(arr, key, 0);
    }   
}
