
public class cc{
	public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
		
        if (str.length()==1)
            return true;
        for(int i=0;i<str.length()/2;i++){
            
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				System.out.println("..");
                return false;
			}
        }
        return true;
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		int x = 123123;
		System.out.println(isPalindrome(x));
	}
		
}