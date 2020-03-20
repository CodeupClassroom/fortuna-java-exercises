import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        // Problem 1
        double pi = 3.14159;

        //System.out.printf("The value of pi is approximately %.2f.", pi);

//        System.out.format("The value of pi is approximately %.2f%n", pi);


        /// Explore Scanner Class
        Scanner input = new Scanner(System.in);

//      Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

//        System.out.println("Please enter an integer: ");
//        int userInt = input.nextInt();
//        System.out.println(userInt);

//      What happens if you input something that is not an integer
        // input mismatch exception

//        Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("Please enter 3 words");

//        String word1 = input.next();
//        String word2 = input.next();
//        String word3 = input.next();
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        What happens if you enter less than 3 words?
        // You cant continue until 3 words are entered


//        What happens if you enter more than 3 words?
        // only the first 3 inputs are accepted



//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.

//        System.out.println("please enter a sentence");
//        String sentence = input.next();
//        System.out.println(sentence);


        // Rewrite the above example using the .nextLine method.

//        System.out.println("please enter a sentence");
//        String sentence = input.nextLine();
//        System.out.println(sentence);



//     Calculate the perimeter and area of Codeup's classrooms. Prompt the user to enter values of length and width of the class. Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//

//        System.out.println("Please enter a length");
//        String lengthInput = input.nextLine();

//        System.out.println("Please enter a width");
//        String widthInput = input.nextLine();
//
//        int length = Integer.parseInt(lengthInput);
//        int width = Integer.parseInt(widthInput);
//
//        int area = length * width;
//        int perimeter = (2*width) + (2*length);
//
//        System.out.println("perimeter = " + perimeter);
//        System.out.println("area = " + area);



        System.out.println("Please enter a length");
        int length = Integer.parseInt(input.nextLine());

        System.out.println("Please enter a width");
        int width = Integer.parseInt(input.nextLine());


        int area = length * width;
        int perimeter = (2*width) + (2*length);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);





    }
}
