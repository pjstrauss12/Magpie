import java.util.Scanner;

public class Drills {

    public static void main(String[] args){
    
        // Declare 5 different data types with initial values
        int x = 5;
        double y = 10.56;
        char letter = 'b';
        String java = "Words";
        boolean like = true;

        // A standard for loop printing a message three times
        for(int z = 1; z <= 3; z++) {
            System.out.println("I like cookies");
        }
        // A for-each loop traversing a String[array]
        String[] classmates = {"Jon", "Brynn", "Parker", "Treppo"};
        for(String classmate : classmates) {
            System.out.println(classmate);
        }
        // An infinite loop
        while(true) {
            System.out.println("I am a cool dude");
        }
            // a short-circut conditional with four tests
            if(false && true || (true && true)) {
                System.out.println("Hi");
            }
                // Break a loop if a conditional passes
        break;
        // Loop through each char in a String
            for(p = 0; p < n.length(); p ++) {
                System.out.println(p);
            }
        // Print only the first three letters in “word”
        System.out.println("word".substring(0, 3));
        // Print all the odd numbers from 1 - 100
        for(int c = 1; c <= 100; c+=2) {
            System.out.println(c);
        }
        // Create a Scanner and take an input
        Scanner g = new Scanner(System.in);
        String name = g.nextLine();
        // Create a Scanner, take a number, and count down from that number to 0
        for(int k = g.nextInt(); k >= 0; k--) {
            System.out.println(k);
        }
    }
    
    // Create a method that returns a comparison (include a JavaDoc comment)
    /**
     * Checks if the param is even
     * @param num
     * @return true if given int is even
     */
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

