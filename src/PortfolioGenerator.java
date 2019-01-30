import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PortfolioGenerator {

    public static void main(String[] args) {

        SafeInput si = new SafeInput();
        Scanner in = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        String name = "";
        String email = "";
        String background = "";
        String language = "";
        String acheivement = "";
        boolean done = false;

        System.out.print("Enter Name: ");
        name = in.nextLine();

        System.out.print("Enter email: ");
        email = in.nextLine();

        System.out.print("Enter background: ");
        background = in.nextLine();


        System.out.print("Enter Achievements: ");
        acheivement = in.nextLine();

        while(done != true){

            System.out.print("Enter Programming Langauges: ");
            al.add(in.nextLine());

            done = si.getYNConfirm(in, "Done?");
        }
                //output goes here
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/joshshell/Desktop/JavaPrograms/PortfolioGenerator/src/output.txt"));
            writer.write("**********\n" + "Name: " + name + "\n"
                    + "**********\n" + "email: " + email + "\n"
                    + "**Personal Background: " +  "\n"
                    +"__________" + "\n"
                    +"\n"
                    + background + "\n"
                    + "\n" + "\n"
                    + "Achievements: " + "\n" + "****************\n" + "Languages: " + "\n"
                    + al);

            writer.close();
        }catch(IOException io){
            System.out.println(io);
        }

    }
}
