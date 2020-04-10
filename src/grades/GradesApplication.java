package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) throws Exception {
        // Instantiate a new HashMap called student
        HashMap<String, Student> students = new HashMap<>();

        // Create 4 students and add some grades for each
        students.put("batman", new Student("Christian"));
        students.put("cptmarvel", new Student("Brie"));
        students.put("starlord", new Student("Chris"));
        students.put("dianaprince", new Student("Gal"));

        // Add some random grades
        Random random = new Random();
        for(int i=0; i < 4; i++) {
            students.get("batman").addGrade(random.nextInt(100));
            students.get("cptmarvel").addGrade(random.nextInt(100));
            students.get("starlord").addGrade(random.nextInt(100));
            students.get("dianaprince").addGrade(random.nextInt(100));
        }

        System.out.println("\n\n\tWelcome!\n\n\tHere are teh Github usernames of our students:\n");
        System.out.println("\t" + students.keySet());

        // Create an Input for user input
        Input input = new Input();

        String ghUser;
        boolean confirmation = true;
        do {
            ghUser = input.getString("\tWhich student's stats would you like to view?: ");
            // check if typed in user actually exists
            if(!students.containsKey(ghUser)){
                System.out.println("\n\tNo student with that Github username was found. :-(");
            } else {
                // they did type in a matching Github user name / key
                Student thisStudent = students.get(ghUser);
                System.out.println("\n\n\tName: " + thisStudent.getName() + " || GH u/n: " + ghUser + " || Current grade avg: " + thisStudent.getGradeAverage());
            }
            confirmation = input.yesNo("\tWould you like to see another? [y/N]");

        } while(confirmation); // once the user says they no longer want to participate, EXIT

    }
}