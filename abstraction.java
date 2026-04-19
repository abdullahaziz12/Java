abstract class greet{
    abstract public void hello();
}
class Childclass extends greet{
    @Override 
    public void hello(){
        System.out.println("hello");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Childclass c1=new Childclass();
        c1.hello();
        
    }
}
