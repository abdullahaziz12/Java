import java.util.Scanner;
class Student{
    private String name;
    private int age;
    private double gpa;
    private int rollno;
    public void setinfo(String name,int rollno,int age,double gpa ){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
        this.gpa=gpa;
    }
    public void getinfo(){
        System.out.println("Name:"+this.name);
        System.out.println("Roll Number:"+this.rollno);
        System.out.println("Age:"+this.age);
        System.out.println("Gpa:"+this.gpa);
    }

}
public class Student_Management {
    public void run(){
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] s=new Student[2];
        while (true) { 
        for(int i=0;i<2;i++){
            String name;
            int age,rollno;
            double gpa;
            try {
                s[i]=new Student();
                sc.nextLine();
                System.out.println("Enter Name:");
                name=sc.nextLine();
                while(true){
                    System.out.println("Enter Rollno:");
                    rollno=sc.nextInt();
                    if(rollno<0){
                    System.out.println("Roll no must not be Negative");
                    continue;
                    }
                    if(rollno>0){
                        break;
                    }
            }
              while(true){
                System.out.println("Enter Age");
                age=sc.nextInt();
                if(age<18||age>30){
                    System.out.println("Age Must be in between 18 to 30");
                    continue;
                }
                if(age>=18 && age<=30){
                    break;
                }
            }  
             while(true){System.out.println("Enter Gpa:");
                gpa=sc.nextDouble();
                if(gpa<0.0||gpa>4.0){
                    System.out.println("gpa must be in between 0.0 to 4.0");
                    continue;
                }
                if(gpa>=0.0&& gpa<=4.0){
                    break;
                }
            }
                
                s[i].setinfo(name, rollno, age, gpa);
            
        } catch (Exception e) {
            System.out.println("Error occured"+e);
        }
        }
        for(int i=0;i<2;i++){
            System.out.println("--------Info Printing----------------");
            s[i].getinfo();
        }
        int options;
        System.out.println("1.Continue\t0.End\nEnter");
        options=sc.nextInt();
        if(options==0){
            return;
        }
        }}
        
    }

