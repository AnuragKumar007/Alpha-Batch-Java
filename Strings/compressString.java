public class compressString {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            sb.append(count);
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String str = "aaabbcccdeffffff";
        System.out.println(compress(str));
    }
}
