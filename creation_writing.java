import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
public class creation_writing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter ID(000 for end):");
            String id=sc.nextLine();
            if(id.equals("000")){
                System.out.println("End");
                break;
            }
            id+=".txt";
            System.out.println("Enter Pin:");
            String pin=sc.nextLine();
            System.out.println("Enter Balance:");
            String Balance=sc.nextLine();
            try {
            FileWriter writer=new FileWriter(id);
            writer.write(pin+","+Balance);
            writer.close();
            } catch (Exception e) {
                System.out.println("Error in File Creation");
            }

        }
        
    }
}
