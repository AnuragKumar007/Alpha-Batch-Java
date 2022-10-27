public class FriendPair{

    public static int friendpair(int n){
        if(n==1 || n==2)
            return n;
        
            //choice
            //single
            int fnm1= friendpair(n-1);

            //pair
            int fnm2= friendpair(n-2);
            int pairways = (n-1) * fnm2;

            // total ways
            int totways = fnm1 + pairways;
            return totways;
    }
    public static void main(String[] args) {
        System.out.println(friendpair(3));
    }
}