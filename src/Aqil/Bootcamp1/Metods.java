package Aqil.Bootcamp1;

public class Metods {
    public static void main(String[] args) {

        String mark = checkExamMark(48);
        System.out.println(mark);
    }
    public static String checkExamMark(int studentScore){
        if(studentScore > 90 && studentScore <= 100){
            return "A";
        } else if (studentScore > 80 &&  studentScore <= 90) {
            return "B";
        } else if (studentScore > 70 && studentScore <= 80) {
            return  "C";
        } else if (studentScore > 50 && studentScore <= 70) {
            return "D";
        }
            return "Failed";
        }
    }

