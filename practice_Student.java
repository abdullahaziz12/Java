import java.util.*;
class Grade{
    String name;
    int rollno;
    double marks;
    public void displayinfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Roll No:"+this.rollno);
    }
    public void calculategrade(double totalmarks){
        this.marks=(this.marks/totalmarks)*100;
        System.out.println("Percentage:"+this.marks);
        if(this.marks>=90){
            System.out.println("Grade:A+");
        }
        else if(this.marks>=80 && this.marks<90){
            System.out.println("Grade:A");
        }
        else if(this.marks>=70 && this.marks<80){
            System.out.println("Grade:B");
        }
        else if(this.marks>=60 && this.marks<70){
            System.out.println("Grade:C");
        }
        else if(this.marks>=50.0 && this.marks<60){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Grade:Fail");
        }
    }
}
public class practice_Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Grade g1=new Grade();
        System.out.print("Enter Name:");
        try {
            g1.name=sc.nextLine();
            System.out.print("Enter Your Rollno:");
            g1.rollno=sc.nextInt();
            System.out.print("Enter Your Marks:");
            g1.marks=sc.nextDouble();
            System.out.print("Enter Total Marks:");
            double totalmarks=sc.nextDouble();
            g1.displayinfo();
            g1.calculategrade(totalmarks);
        } catch (Exception e) {
            System.out.println("Error Occurred:");
        }
    }
}
