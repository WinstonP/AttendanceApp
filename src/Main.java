import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    final static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Integer> attendanceRecord = calcAbsences(welcomeInput());
        System.out.println("This many student(s) had perfect Attendance: " + calcPerfAttendance(attendanceRecord));
        System.out.println("The average absent rate is: " + calcAverageAbsence(attendanceRecord));
        System.out.println(attendanceRecord);


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

    public static int calcAverageAbsence(ArrayList<Integer> arr) {
        int avgAbs = 0;
        int absTotal = 0;
        for (int elem : arr) {
            absTotal += elem;
        }
        return absTotal / arr.size();
    }
}
