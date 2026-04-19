import java.util.Scanner;
import java.io.IOException;
class LibraryItem {
    String name;
    String type;
    int id;
    public void product(String name, int id,String type) {
        this.name = name;
        this.id = id;
        this.type=type;
    }
    public int getfinedate() {
        return 3;
    }
    public double calculatefine(int latedays) {
        return latedays * 5.9;
    }
    public void show() {
        System.out.println("\n----------------------------------------------");
        System.out.println(" \n                   Reciept");
        System.out.println("\n----------------------------------------------");
        System.out.println("Type:" + this.type);
        System.out.println("Title: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Borrowing Duration is "+getfinedate()+" Days");
    }
}
class Books extends LibraryItem {
    @Override
    public int getfinedate() {
        return 7;
    }
    @Override
    public double calculatefine(int latedays) {
        return latedays * 10.0;
    }
}
class Journals extends LibraryItem {
    @Override
    public int getfinedate() {
        return 3;
    }
    @Override
    public double calculatefine(int latedays) {
        return latedays * 15.0;
    }
}
class DvD extends LibraryItem {
    @Override
    public int getfinedate() {
        return 8;
    }
    @Override
    public double calculatefine(int latedays) {
        return latedays * 20.0;
    }
}
class Magazines extends LibraryItem {
    @Override
    public int getfinedate() {
        return 2;
    }
    @Override
    public double calculatefine(int latedays) {
        return latedays * 30.0;
    }
}
public class Library_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryItem book = new Books();
        LibraryItem journal = new Journals();
        LibraryItem magzine = new Magazines();
        LibraryItem dvd = new DvD();
        while (true) {
            System.out.println("\n----------------------------------------------");
            System.out.println(" \n                   Main Menu");
            System.out.println("\n----------------------------------------------");
            System.out.print("\n1. Books\n2. Journals\n3. Magazines\n4. DVD\n0. Exit\nEnter:");
            try {
                int options = sc.nextInt();
                sc.nextLine(); 
                if (options == 0) {
                    System.out.println("Thanks For Using");
                    break;
                }
                switch (options) {
                    case 1:
                        book.type="BOOK";
                        System.out.print("Enter Name of the Book:");
                        book.name = sc.nextLine();
                        System.out.print("Enter Book ID:");
                        book.id = sc.nextInt();
                        System.out.println("Enter number of LateDays:");
                        int latedays = sc.nextInt();
                        double fine=book.calculatefine(latedays);
                        book.show();
                        System.out.print("Fine for "+latedays+" days = "+fine);
                        System.out.println("\nPress any Key to Continue");
                        System.in.read();
                        break;
                    case 2:
                        journal.type="JOURNAl";
                        System.out.print("Enter Name of the Journal:");
                        journal.name = sc.nextLine();
                        System.out.print("Enter Journal ID:");
                        journal.id = sc.nextInt();
                        System.out.print("Enter number of LateDays:");
                        int lateday = sc.nextInt();
                        double fines=journal.calculatefine(lateday);
                        journal.show();
                        System.out.print("Fine for "+lateday+" days = "+fines);
                        System.out.println("\nPress any Key to Continue");
                        System.in.read();
                        break;
                    case 3:
                        magzine.type="MAGZINE";
                        System.out.print("Enter Name of the Magzine:");
                        magzine.name = sc.nextLine();
                        System.out.println("Enter Magzine ID:");
                        magzine.id = sc.nextInt();
                        System.out.print("Enter number of LateDays:");
                        int maglateday = sc.nextInt();
                        double magfines=magzine.calculatefine(maglateday);
                        magzine.show();
                        System.out.print("Fine for "+maglateday+" days = "+magfines);
                        System.out.println("\nPress any Key to Continue");
                        System.in.read();
                        break;
                    case 4:
                        dvd.type="DVD";
                        System.out.print("Enter Name of the DVD:");
                        dvd.name = sc.nextLine();
                        System.out.print("Enter DVD ID:");
                        dvd.id = sc.nextInt();
                        System.out.print("Enter number of LateDays:");
                        int dvdlateday = sc.nextInt();
                        double dvdfines=dvd.calculatefine(dvdlateday);
                        dvd.show();
                        System.out.print("Fine for "+dvdlateday+" days = "+dvdfines);
                        System.out.println("\nPress any Key to Continue");
                        System.in.read();
                        break;
                    default:
                        System.out.println("Invalid Option");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }
        sc.close();
    }
}