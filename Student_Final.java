import java.util.Scanner;
class Student{
    int rollno;
    String name;
    double Gpa;
    Student(int rollno,String name,double Gpa){
        this.rollno=rollno;
        this.name=name;
        this.Gpa=Gpa;
    }
    public void Displayinfo(){
        System.out.println("Rollno:"+this.rollno);
        System.out.println("Name:"+this.name);
        System.out.println("Gpa:"+this.Gpa);
    }
}
public class Student_Final {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rollno;
        String name;
        double Gpa;
        while(true){
            try {
                while(true){
                     System.out.println("Rollno");
                     rollno=sc.nextInt();
                     if(rollno>0){
                        break;
                     }
                }
                sc.nextLine();
                System.out.println("Enter Name:");
                name=sc.nextLine();
                while(true){
                    System.out.println("Enter Gpa:");
                    Gpa=sc.nextDouble();
                    if(Gpa>0){
                        break;
                    }
                }
                Student S1=new Student(rollno, name, Gpa);
                S1.Displayinfo();
               break;
            } catch (Exception e) {
                System.out.println("Error Occurred:"+e);
                sc.nextLine();
            }
        }
        }
    }
