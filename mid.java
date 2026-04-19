class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    public void prinnt(){
        System.out.println(name);
    }
}
public class mid{
    public static void main(String[] args) {
        Student s1=new Student("Abdullah");
        s1.prinnt();
        // System.out.println("hello");
    }
}