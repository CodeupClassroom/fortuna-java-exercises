import java.util.Scanner;

public class ControlStatementsLec {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

        // Don't do this!
//        boolean confirmation = userInput == "y";

        // DO THIS INSTEAD!
//        boolean confirmation = userInput.equals("y");
//        boolean confirmation = userInput.equalsIgnoreCase("y");
//
//        System.out.println(confirmation);



//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }



//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }


        // print the numbers 1 through 5

//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }


        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
















    }

}
