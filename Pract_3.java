interface Playable{
    void play();
}
class Piano implements Playable{
    public void play(){
        System.out.println("Playing Piano.....");
    }
}
class Guitar implements  Playable{
    public void play(){
        System.out.println("Playing Guitar.....");
    }
}
public class Pract_3 {
    public static void main(String[] args) {
        Playable p=new Guitar();
        Playable p2=new Piano();
        p.play();
        p2.play();

    }
}
