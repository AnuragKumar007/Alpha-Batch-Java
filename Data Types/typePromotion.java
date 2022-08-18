public class typePromotion{
    public static void main(String[] args) throws Exception
    {
        // in normal mathematics operation | char is converted into integer value then the operation is done !
        //This is known as Type Promotion
        char a='a';
        char b='b';
        System.out.println(b-a);

        // more
        short d=5;
        byte e =10;
        char f='f';

        int ans = d+e+f;
        System.out.println(ans);

        // for byte we have to Type Cast
        byte bt = (byte)(d+e+f);
        System.out.println(bt);

        // agr int float long double charo hain to ! automatically covert krdega max size wale me like charo ke case me double hojayega

        // wrong
        // byte x=5;
        // x = x*2; //yahai pr 2nd 'x' ko Int ki trh treat kiya jayega

        //right
        byte x= 5;
        x = (byte)(x*2) ;
        System.out.println(x);
        
    }
}