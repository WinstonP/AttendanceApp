import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // TODO this should be a function
        Scanner keyb = new Scanner(System.in);
        System.out.printf("give me a name: ");
        String msg = keyb.next();
        // commit and push: read the user's name

        System.out.println("Hello " + msg + " Welcome to the Attendance App");
        // commit and push: output the welcome message


        // TODO this should be two functions
        // TODO a function should solve only one task: store rands in ArrayList is separate from counting

        int absCount = msg.length();
        ArrayList <Integer> absences = new ArrayList<Integer>();
        Random rand  = new Random();
        int perfAttendanceCount = 0;
        for(int i=0; i < absCount; i++ ){
            int temp = rand.nextInt(11);
            absences.add(temp);
            if(temp==0){
                perfAttendanceCount++;
            }

        }
        System.out.println("The elements are " + absences);
        // commit and push: create and output random absences

        System.out.println(perfAttendanceCount + " student(s) had perfect attendance");
        // commit and push: count number of perfect attendances

        System.out.println(calcAverageAbsence(absences));
        // commit and push: average of all absences

        // @winstonp, write more code, more often.  The Current Iteration column/swimline has lots of user stories for you.

    }
    public static int calcAverageAbsence (ArrayList<Integer> arr){
        int avgAbs = 0;
        return avgAbs;
    }
}
