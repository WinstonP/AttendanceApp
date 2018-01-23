import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Integer> attendanceRecord = calcAbsences(welcomeInput());
        System.out.println("Attendance Record: " + attendanceRecord);
        System.out.println("This many student(s) had perfect Attendance: " + calcPerfAttendance(attendanceRecord));
        System.out.printf("The average absent rate is: %.2f \n" , calcAverageAbsence(attendanceRecord));

        System.out.println("Here are the indices of the students with certain number of absences: " + countCertainAbsences(attendanceRecord));



    }
    public static void sortAttendanceRecord(ArrayList<Integer> arr){
        System.out.println(arr);
          Collections.sort(arr);
        System.out.println(arr);

    }
    public static ArrayList<Integer> countCertainAbsences(ArrayList<Integer> arr ){
        System.out.println("Students with how many absences are you looking for?");
        int certainAbsences = keyb.nextInt();
        ArrayList<Integer> certainAbs = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==certainAbsences){
                certainAbs.add(i);
            }
        }
        return certainAbs;
    }

    public static int welcomeInput() {
        System.out.printf("give me a name: ");
        String msg = keyb.next();
        System.out.println("Hello " + msg + " Welcome to the Attendance App");
        return msg.length();
    }

    public static ArrayList<Integer> calcAbsences(int absencesCnt) {
        ArrayList<Integer> absences = new ArrayList<Integer>();
        Random rand = new Random();
        int perfAttendanceCount = 0;
        for (int i = 0; i < absencesCnt; i++) {
            int temp = rand.nextInt(11);
            absences.add(temp);

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

    public static double calcAverageAbsence(ArrayList<Integer> arr) {
        double  absTotal = 0;
        for (int elem : arr) {
            absTotal += elem;
        }
        return absTotal / arr.size();
    }
}
