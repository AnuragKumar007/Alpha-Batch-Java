public class RemoveDuplicates {

    public static void removedup(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){ // base case
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            // if true then it's a duplicate
            removedup(str, idx+1, newStr, map);
        }
        // if not true then add it in new String
        else {
            map[currChar -'a']=true;
            removedup(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removedup(str, 0, new StringBuilder(""), new boolean [26] );
        
    }
}
