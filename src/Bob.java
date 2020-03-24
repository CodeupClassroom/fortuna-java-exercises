import java.util.Scanner;

/**
 * Method courtesy of Bryce Payne, of the Fortuna class.
 * Create a class named Bob with a main method for the following exercise.
 *
 * Bob is a lackadaisical teenager. In conversation, his responses are very limited.
 *
 * Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
 * He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
 * He says 'Fine. Be that way!' if you address him without actually saying anything.
 * (empty input)
 *
 * He answers 'Whatever.' to anything else.
 *
 * Write the Java code necessary so that a user of your command line application can
 * have a conversation with Bob.
 */
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exit = "bye";
        String responseQ = "Sure.";
        String responseE = "Whoa, chill out!";
        String responseN = "Fine, be that way!";
        String responseElse = "Whatever.";
        boolean again = true;
        do {
            String input = scanner.nextLine().trim();
            if (input.toLowerCase().equals(exit)){
                again = false;
            } else if (input.endsWith("?")) {
                System.out.println(responseQ);
            } else if (input.endsWith("!")) {
                System.out.println(responseE);
            } else if (input.equals("")) {
                System.out.println(responseN);
            } else {
                System.out.println(responseElse);
            }
        } while (again);
    }
}
