import java.util.Scanner;

class Hospital{
    int PatientID;
    String Name;
    String Disease;
    public Hospital(int PatientID,String name,String Disease){
        this.Name=name;
        this.PatientID=PatientID;
        this.Disease=Disease;
    }
    public void Displayinfo(){
        System.out.println("PatientID:"+this.PatientID);
        System.out.println("Name:"+this.Name);
        System.out.println("Disease:"+this.Disease);
    }
}
public class Hospital_Final {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int options;
        while(true){
            System.out.println("1.Add Patient 2.Display Patient 3.End\nEnter: ");
            options=sc.nextInt();
            if(options==1){
                
            }
        }
    }
}
