class Salary{
    public void calculatesalary(double basicSalary,double alloance){    
        System.out.print(basicSalary+alloance);
    }
}
class Professor extends Salary{

    @Override
    public void calculatesalary(double basicSalary,double alloance){
        System.out.print(basicSalary+alloance+researchallaonce);
    }
}
public class oop {
    public static void main(String[] args){
        Professor p=new Professor();
        p.calculatesalary(222.0,445.0);
    }

}
