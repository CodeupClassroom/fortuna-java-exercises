package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // return the student's name
    public String getName() {
        return name;
    }

    // add grades to the grades ArrayList
    public void addGrade(int grade) {
        grades.add(grade);
        // we can comment this out later
//        System.out.println(name + " just scored a " + grade);
    }

    // calculate the average of all grades of a student
    public double getGradeAverage() {
        double sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student casey = new Student("Casey");
        casey.addGrade(95);
        casey.addGrade(34);
        casey.addGrade(75);
        casey.addGrade(100);
        System.out.println(casey.getGradeAverage());
    }
}
