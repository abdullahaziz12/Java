package OOPS_java;
class Student{
    String name;
    int rollno;
    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Roll no:"+this.rollno);
    }
}
class classes {
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Abdullah";
        s1.rollno=306;
        s1.display();
    }
    
}
