// Question
// Write a program to findLength of aStringusing Recursion

public class PractiseQue3 {

    public static void length(String str, int idx){
        //base
        if(idx== str.length()){
            System.out.println(idx);
            return;
        }
        
        //kaam
            length(str, idx+1);

    }
    public static void main(String[] args) {
        length("tony stark is ironman", 0);
    }
}
