public class RotatedArraySearch {


    public static int RotSearch(int arr[],int tar, int si, int ei) {
        //base case
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // found on mid
        if (tar == arr[mid]) {
            return mid;
        }

        // on Line L1
        if (arr[si] <= arr[mid]) {
            // case a: Left side on L1
            if (arr[si] <= tar && tar <= arr[mid]) {
                return RotSearch(arr, tar, si, mid);
            }

            //case b: Right side on L1
            else {
              return RotSearch(arr, tar, mid + 1, ei);
            }

        }
        // on Line L2
        else {
            // case c:  on right of L2
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return RotSearch(arr, tar, mid + 1, ei);
            }
            // case 4: on Left of L2
            else {
                return RotSearch(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6,7,5,2,3 };
        System.out.println(RotSearch(arr, 5, 0, arr.length));
    }
}
