import java.util.*;
class Rectangle{
    double length;
    double width;
    public double calculatearea(){
        double area=this.length*this.width;
        return area;
    }
    public double calculateperimeter(){
        double perimeter=2*(this.length+this.width);
        return perimeter;
    }
}
public class practice_Rectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectangle r1=new Rectangle();
        System.out.print("Enter Length(in cm):");
        try {
            r1.length=sc.nextDouble();
            System.out.print("Enter Width(in cm):");
            r1.width=sc.nextDouble();
            System.out.println("Area of the Rectangle = "+r1.calculatearea()+"cm\u00B2");
            System.out.println("Perimeter of the Rectangle = "+r1.calculateperimeter()+"cm\u00B2");
        } catch (Exception e) {
            System.out.println("error occurred");
        }
    }
}
