import java.util.*;
import java.io.File;

public class login_ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Your ID:");
            String id = sc.nextLine();
            id += ".txt";

            File myfile = new File(id);

            if(!myfile.exists()){
                System.out.println("User ID not found!");
                return;
            }

            Scanner sc1 = new Scanner(myfile);

            String line = sc1.nextLine();
            String data[] = line.split(",");

            int pin2 = Integer.parseInt(data[0]);
            double balance = Double.parseDouble(data[1]);
            int tries = Integer.parseInt(data[2]);

            System.out.println("Enter your Pin:");
            int pin = sc.nextInt();

            if(pin == pin2){
                System.out.println("Login Successful");
                System.out.println("Balance: " + balance);
            }
            else{
                System.out.println("Wrong PIN");
            }

            sc1.close();
            sc.close();

        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}