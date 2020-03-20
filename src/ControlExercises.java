public class ControlExercises {
    public static void main(String[] args) {

        /* ********* WHILE LOOP  **********/
//  Create an integer variable i with a value of 5.
//        int i = 5;


//  Create a while loop that runs so long as i is less than or equal to 15

//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }


        /* ********* DO WHILE LOOP  **********/

//    Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//    int a = 0;
//    do{
//        System.out.println(a);
//        a+=2;
//    }while(a <= 100);


//    Alter your loop to count backwards by 5's from 100 to -10.

//    int a = 100;
//    do{
//        System.out.println(a);
//        a-=5;
//    }while(a >= -10);


        //        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
// 65536 * 65536 = 4294967296 (4billion whatever) - this is EXACTLY twice the max value of integer
        long a = 2;
        int counter1 = 0;
        do {
            System.out.println("\n=================================");
            System.out.println("Current loop: " + counter1);

//            if(a == 0){
//                System.out.println(a);
//                break;
//            }

            System.out.print("\nValue of a: " + a + "\n");
            a *= a;

            counter1++;
        } while (a <= 1000000);


        /* ********* FOR LOOP  **********/


//    Refactor the previous two exercises to use a for loop instead.

//    Create a  loop that runs so long as i is less than or equal to 15

//        for(int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }


//        Create a loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.


//        for(int a = 0; a <= 100; a+=2){
//            System.out.println(a);
//        }


//        Alter your loop to count backwards by 5's from 100 to -10.

//        for(int a = 100; a >= -10; a-=5){
//            System.out.println(a);
//        }

        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//        for(long a = 2; a <= 1000000; a *= a){
//            System.out.println(a);
//        }



        /* ********* FIZZ BUZZ  **********/

//        for(int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }



        /* ****************** TABLE OF POWERS ******************
         * Prompt the user to enter an integer.
         * Display a table of squares and cubes from 1 to the value entered.
         * Ask if the user wants to continue.
         * Assume that the user will enter valid data.
         * Only continue if the user agrees to.
         * */

//    Scanner input = new Scanner(System.in);
//
//    String userConfirm = "Y";
//
//    while(userConfirm.equalsIgnoreCase("y")){
//        System.out.println("What number would you like to go up to?");
//        int num = Integer.parseInt(input.nextLine());
//
//
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for(int counter = 1; counter <= num; counter++){
//            System.out.printf("%-6d | %-7d | %d%n", counter, counter*counter, counter*counter*counter);
//        }
//
//        System.out.println("Would you like to test another number? Y/N");
//        userConfirm = input.nextLine();
//
//    }
//
//    System.out.println("Ok, have a nice day!");




        /* ****************** Grades PROBLEM ******************
         *Convert given number grades into letter grades.
         *Prompt the user for a numerical grade from 0 to 100.
         *Display the corresponding letter grade.
         *Prompt the user to continue.
         *Assume that the user will enter valid integers for the grades.
         *The application should only continue if the user agrees to.
         *
         *Grade Ranges:
         ** A : 100 - 88
         ** B : 87 - 80
         ** C : 79 - 67
         ** D : 66 - 60
         ** F : 59 - 0
         */

//        boolean gradeContinue = true;
//        do{
//            System.out.println("Please enter a number grade");
//            int numericGrade = input.nextInt();
//
//            if(numericGrade >= 88){
//                System.out.println("A");
//            } else if ( numericGrade >= 80){
//                System.out.println("B");
//            } else if (numericGrade >= 67){
//                System.out.println("C");
//            } else if (numericGrade >= 60){
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to enter a new grade? (y/n)");
//            String userResponse = input.next();
//
//            if(!userResponse.equalsIgnoreCase("y")){
//                gradeContinue = false;
//            }
//
//        }while (gradeContinue);


    }
}
