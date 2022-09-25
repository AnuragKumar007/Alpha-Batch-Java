public class stringBuilder{
    public static void main(String[] args)throws Exception{
        StringBuilder sb = new StringBuilder("");
        sb.append(1); // to add a single Element
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }        
        System.out.println(sb);
        System.out.println(sb.length());
    }
}