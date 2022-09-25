public class Interface {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        // King k = new King();
        // k.moves();
        bear b = new bear();
        
        System.out.println(b.eatGrass());
        System.out.println(b.eatMeat());
    }
}
// interface Chessplayer{
//     void moves();
// }
// class Queen implements Chessplayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diiognal");
//     }
// }
// class King implements Chessplayer{
//     public void moves(){
//         System.out.println("up,down,left,right,diiognal(by one posi)");
//     }
// }
interface Herbivore{
    boolean eatGrass();
    
}
interface Carnivore {
    boolean eatMeat();
}
class bear implements Herbivore, Carnivore{
    public boolean eatGrass(){
        return true;
    }
    public boolean eatMeat(){
        return true;
    }
}