class InheritanceStudent{
    String name;
}
class Info extends InheritanceStudent{
    int rollno;
    public void getinfo(){
        System.out.println("Name:"+this.name);
        System.out.println("RollNo:"+this.rollno);
    }
}
class Age extends Info{
    int age;
    @Override
    public void getinfo(){
        System.out.println("Name:"+this.name);
        System.out.println("RollNo:"+this.rollno);
        System.out.println("Age:"+this.age);
    }
}
class Student1 extends Age{
    int marks;
     public void proinfo(){
        System.out.println("Name:"+this.name);
        System.out.println("RollNo:"+this.rollno);
        System.out.println("Age:"+this.age);
        System.out.println("Marks:"+this.marks);
    }
}
class Student2 extends Age{
    String clas;
     public void printinfo(){
        System.out.println("Name:"+this.name);
        System.out.println("RollNo:"+this.rollno);
        System.out.println("Age:"+this.age);
        System.out.println("Class:"+this.clas);
    }
}
public class singleinheritence{
    public static void main(String[] args) {
        Info in1=new Info();
        in1.name="Abdullah";
        in1.rollno=306;
        in1.getinfo();
        System.out.println("Mutliple Inheritence");
        Age ag1=new Age();
        ag1.name="Usman";
        ag1.rollno=337;
        ag1.age=20;
        ag1.getinfo();
        System.out.println("Hairrechcal Inheritence");
        Student1 s1=new Student1();
        Student2 s2=new Student2();
        s1.name="Abdullah";
        s1.rollno=306;
        s1.age=18;
        s1.marks=333;
        s1.proinfo();
        s2.name="Usman";
        s2.age=22;
        s2.rollno=337;
        s2.clas="se";
        s2.printinfo();
    }
}