import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.printf("give me a name ");
        String msg = keyb.next();
        System.out.println("Hello " + msg + " Welcome to the Attendance App");
        int absCount = msg.length();

        ArrayList <Integer> absences = new ArrayList<Integer>();
        Random rand  = new Random();
        for(int i=0; i < absCount; i++ ){
            int temp = rand.nextInt(11);
             absences.add(temp);

        }
        System.out.println("The elements are " + absences);


    }
}
