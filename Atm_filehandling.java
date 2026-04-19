import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
public class Atm_filehandling{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id:");
        String id=sc.nextLine();
        id+=".txt";
        try {
            File myFile=new File(id);
            if(myFile.createNewFile()){
                System.out.println("File Created");
            }
        } catch (Exception e) {
            System.out.println("Error in File Creation");
        }
        try {
            FileWriter writer=new FileWriter(id);
            System.out.println("Enter Your Pin:");
            String pin=sc.nextLine();
            System.out.println("Enter Balance:");
            String balance=sc.nextLine();
            writer.write(pin+","+balance);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error In File writing");
        }
        try {
            Scanner sc1=new Scanner(new File(id));
            while(sc1.hasNextLine()){
                String data=sc1.nextLine();
                System.out.println(data);
            }

        } catch (Exception e) {
             System.out.println("Error In File Reading");
        }


    }
}