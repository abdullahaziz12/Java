class Student{
    Student(){
        System.out.println("Constructor Called");
    }
    String name;
    int rollno;
    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Roll no:"+this.rollno);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Abdullah";
        s1.rollno=306;
        s1.display();
    }
}
