package homework9;

public class Grades {
    public static void printGrade(String surname, String grade, String subject) {
        int maxLengthSurname = 15;
        int maxLengthGrade = 3;
        int maxLengthSubject = 10;
        if (surname.length() > maxLengthSurname){
            surname = surname.substring(0, maxLengthSurname);
        }
        if (grade.length() > maxLengthGrade) {
            grade = grade.substring(0, maxLengthGrade);
        }
        if (subject.length() > maxLengthSubject) {
            subject = subject.substring(0, maxLengthSubject);
        }
        System.out.printf("Студент %-15s получил %-3s по %-10s\n", surname, grade, subject);
    }
}
