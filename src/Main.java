import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class Main {
    final static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {


        ArrayList<Integer> attendanceRecord = calcAbsences(welcomeInput());
        System.out.println("Attendance Record: " + attendanceRecord);
        System.out.println("This many student(s) had perfect Attendance: " + calcPerfAttendance(attendanceRecord));
        System.out.printf("The average absent rate is: %.2f \n" , calcAverageAbsence(attendanceRecord));

        System.out.println("Here are the indices of the students with certain number of absences: " + countCertainAbsences(attendanceRecord,5));
        Collections.sort(attendanceRecord);
        absenceAdder(attendanceRecord,5,2);
        uniqueAbsenceRecords(attendanceRecord);


    }
    public static HashMap<Integer,Integer> absenceHistogramgenerator(ArrayList<Integer> arr){
        HashMap<Integer,Integer>attHist  = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if(attHist.containsKey(arr.get(i))){
               attHist.put(arr.get(i),attHist.get(arr.get(i))+1);
            }
            else{
                attHist.put(arr.get(i),1);
            }

        }
        return attHist;
    }
    public static HashSet<Integer> uniqueAbsenceRecords(ArrayList<Integer> arr){
        HashSet<Integer>uniqueRecord = new HashSet<Integer>();
        for (int elem:arr) {
            if(!uniqueRecord.contains(elem)){
               uniqueRecord.add(elem);
            }
        }
        return uniqueRecord;
    }

    public  static ArrayList<Integer> absenceAdder(ArrayList<Integer> arr,int absentmin,int absentsadded){
        for (int i=0; i<arr.size();i++) {
            if(arr.get(i)>=absentmin){
               if(arr.get(i)+absentsadded>15){
                   arr.set(i,15);
               }
               else if(arr.get(i)+absentsadded<0){
                   arr.set(i,0);
               }
               else if((arr.get(i)+absentsadded>=0) && arr.get(i)+absentsadded<=15){
                   arr.set(i,arr.get(i)+absentsadded);
               }
            }
        }
        return arr;

    }
    public static ArrayList<Integer> countCertainAbsences(ArrayList<Integer> arr ,int  certainAbsences ){
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
