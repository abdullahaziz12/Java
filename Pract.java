class myPerson{
    private String name;
    private int age;
    public void setter(int age,String name){
        this.name=name;
        this.age=age;
    }
    public int getage(){
        return this.age;
    }
    public String getname(){
        return this.name;
    }

}
class myStudent extends myPerson{
    double marks;
    public void DisplayInfo(){
        System.out.println("Name:"+this.getname());
        System.out.println("Age:"+this.getage());
        System.out.println("Marks:"+this.marks);
    }
}
public class Pract{
    public static void main(String[] args) {
        myStudent stud=new myStudent();
        String name="abdullah";
        int age=18;
        stud.marks=90;
        stud.setter(age, name);
        stud.DisplayInfo();
        

        
    }
}