class Students{
    String name;
}
class Rollno extends Students{
    int no;
    public void info(String name,int no){
        System.out.println("Name:"+this.name);
        System.out.println("Rollno:"+this.no);
    }
}
public class student{
    public static void main(String[] args){
        Rollno r1=new Rollno();
        r1.name="Abdullah";
        r1.no=1234;
        r1.info();

    }
}