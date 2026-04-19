import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.*;
public class filehandling{
    public static void main(String[] args){
        // try {
        //     File myfile=new File("Atm.txt");
        //     if(myfile.createNewFile()){
        //         System.out.println("File Created");
        //     }
        // } catch (Exception e) {
        //     System.out.println("Error in File Creation");
        // }
        // try {
        //     FileWriter writer=new FileWriter("Atm.txt");
        //     writer.write("Hello");
        //     writer.close();
        // } catch (Exception e) {
        //     System.out.println("Error in File Writing");
        // }
        try {
            Scanner sc=new Scanner(new File("Atm.txt"));
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            System.out.println("End");
        } catch (Exception e) {
            System.out.println("Error in Reading");
        }
    }
}