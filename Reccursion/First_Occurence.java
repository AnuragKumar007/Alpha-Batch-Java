public class First_Occurence {

    public static int occur(int arr[], int n, int i){
        
            if(arr[i]==n){
                return i;
            }
        
        return occur(arr, n, i+1);
        // return occur(arr, n, i-1); // last occurence

    }

    public static void main(String[] args) {
        int n = 3;
        int arr[] ={1,2,3,4,3,6,5};
        System.out.println(occur(arr, n, 0));
        // System.out.println(occur(arr, n, 6)); Last occurence
        
    }
}
