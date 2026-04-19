class main{
    public void add(int a,float b){
        System.out.println(a-b);
    }
    public void add(float a,float b,float c){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b);
    }
    public void add(int a,int b){
        System.out.println(a-b);
    }
}
class runtime extends main{
    @Override
    public void add(int a,float b){
        System.out.println(a+b);
    }
}
public class My_poly{
    public static void main(String[] args){
        runtime r=new runtime();
        main m=new main();
        m.add(2, 2);
        r.add(2, 2);
      
    }
}