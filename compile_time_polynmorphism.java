class PolyStudent{
    public void info(String name){
      System.out.println("Name:"+name);
    }
    public void info(int rollno){
      System.out.println("Rollno:"+rollno);
    }
     public void info(String name,int rollno){
      System.out.println("Name:"+name+"\tRoll No:"+rollno);
    }
    PolyStudent(){

    }
}
public class compile_time_polynmorphism {
    public static void main(String[] args) {
      PolyStudent s1=new PolyStudent();
        s1.info("Abdullah");
        s1.info(123);
        s1.info("Abdullah", 123);
    }
}
