import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {


        // TODO this should be a function
        Scanner keyb = new Scanner(System.in);


        ArrayList<Integer> attendanceRecord = calcAbsences(welcomeInput());
        System.out.println("This many student(s) had perfect Attendance: " + calcPerfAttendance(attendanceRecord));
        System.out.println("The average absent rate is: " + calcAverageAbsence(attendanceRecord));
        System.out.println(attendanceRecord);


    }

    public static int welcomeInput() {

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

        return msg.length();
    }

    public static ArrayList<Integer> calcAbsences(int absencesCnt) {
        ArrayList<Integer> absences = new ArrayList<Integer>();
        Random rand = new Random();

        int perfAttendanceCount = 0;
        for (int i = 0; i < absencesCnt; i++) {
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


        }
        return absences;
    }

    public static int calcPerfAttendance(ArrayList<Integer> arr) {
        int perfAttendanceCount = 0;
        for (int elem : arr) {
            if (elem == 0) {
                perfAttendanceCount++;
            }

        }
        return perfAttendanceCount;
    }

    public static int calcAverageAbsence(ArrayList<Integer> arr) {

        int avgAbs = 0;
        int absTotal = 0;
        for (int elem : arr) {
            absTotal += elem;
        }
        return absTotal / arr.size();
    }
}
