package homework9;

public class Main {
    public static void main(String[] args) {

        //task 1
        String text = "I like Java!!!";
        Modifier.applyModifications(text);

        //task 2
        Grades.printGrade("Иванов", "5", "Математике");
        Grades.printGrade("ПетроваПетроваПетрова", "4", "Физике");
        Grades.printGrade("Сидорова", "3", "Программированию");

        //task 3
        Sentence sentence = new Sentence("fffff ab f 1234 jkjk");
        sentence.printWordWithLeastUniqueChars();
    }

}