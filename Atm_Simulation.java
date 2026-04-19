import java.io.File;
import java.io.Writer;
import java.io.IOException;
import java.util.*;

class Customer{
    String id;
    private double[] fileopen() {
    this.id += ".txt";
        try {
            File myfile = new File(this.id);
            if(!myfile.exists()){
                return null;
            }
            Scanner sc1 = new Scanner(myfile);
            String line = sc1.nextLine();
            String data[] = line.split(",");
            double result[] = new double[3];
            result[0] = Integer.parseInt(data[0]);   
            result[1] = Double.parseDouble(data[1]); 
            result[2] = Integer.parseInt(data[2]);  
            sc1.close();
            return result;
        }
        catch(Exception e){
            System.out.println("Error: " + e);
            return null;
        }
    }
    private void fileclose(){
        this.id += ".txt";
        
    }

}
public class Atm_Simulation {
    
}
