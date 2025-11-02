package week04;

// Week 4 Project - Arrays, Loops, and Methods
// Author: Elena Cuevas
// Notes: Solves numbered tasks (1–8) from the assignment.

public class Week04 {

    public static void main(String[] args) {

        // -----------------------------
        // 1) Ages array work
        // -----------------------------
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1a) Last minus first (programmatic indexes)
        int diffAges = ages[ages.length - 1] - ages[0];
        System.out.println("1a) Last - First (ages): " + diffAges);

        // 1b) New ages2 (9 elements), then repeat subtraction programmatically
        int[] ages2 = {10, 4, 18, 21, 33, 7, 2, 15, 44};
        int diffAges2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("1b) Last - First (ages2): " + diffAges2 + " (works regardless of length)");

        // 1c) Average age in ages using a loop
        int sumAges = 0;
        for (int a : ages) {
            sumAges += a;
        }
        double avgAges = (double) sumAges / ages.length;
        System.out.println("1c) Average of ages: " + avgAges);

        // -----------------------------
        // 2) Names array work
        // -----------------------------
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2a) Average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double avgLetters = (double) totalLetters / names.length;
        System.out.println("2a) Average letters per name: " + avgLetters);

        // 2b) Concatenate all names separated by spaces
        String allNames = "";
        for (int i = 0; i < names.length; i++) {
            allNames += names[i];
            if (i < names.length - 1) {
                allNames += " ";
            }
        }
        System.out.println("2b) All names: " + allNames);

        // -----------------------------
        // 3) & 4) Accessing array elements
        // -----------------------------
        System.out.println("3) Last element of any array: array[array.length - 1]");
        System.out.println("4) First element of any array: array[0]");

        // -----------------------------
        // 5) nameLengths array
        // -----------------------------
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // -----------------------------
        // 6) Sum of nameLengths
        // -----------------------------
        int sumNameLengths = 0;
        for (int len : nameLengths) {
            sumNameLengths += len;
        }
        System.out.println("6) Sum of all name lengths: " + sumNameLengths);

        // -----------------------------
        // 7) Test repeatWord method
        // -----------------------------
        System.out.println("7) repeatWord: " + repeatWord("Hello", 3));

        // -----------------------------
        // 8) Test getFullName method
        // -----------------------------
        System.out.println("8) getFullName: " + getFullName("Elena", "Cuevas"));
   
        // -----------------------------
        // 9) Test isSumGreaterThan100
        // -----------------------------
        int[] nums = {20, 30, 10, 45}; // sum = 105
        System.out.println("9) isSumGreaterThan100: " + isSumGreaterThan100(nums));
        // -----------------------------
        // 10) Test averageArray method
        // -----------------------------
        double[] numbers = {5.0, 10.0, 15.0, 20.0};
        System.out.println("10) averageArray: " + averageArray(numbers));
        // -----------------------------
        // 11) Test isFirstArrayAverageGreater method
        // -----------------------------
        double[] arrayA = {10.0, 20.0, 30.0};
        double[] arrayB = {5.0, 5.0, 5.0};
        System.out.println("11) isFirstArrayAverageGreater: " + isFirstArrayAverageGreater(arrayA, arrayB));

     

        
    } // end of main


    // 7) repeatWord method
    public static String repeatWord(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }

    // 8) getFullName method
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    // 9) isSumGreaterThan100 method
    public static boolean isSumGreaterThan100(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum > 100;
    }
 
    // 10) averageArray method
    public static double averageArray(double[] arr) {
        double sum = 0;
        for (double n : arr) {
            sum += n;
        }
        return sum / arr.length;
    }
    
    // 11) isFirstArrayAverageGreater method
    public static boolean isFirstArrayAverageGreater(double[] arr1, double[] arr2) {
        double sum1 = 0;
        double sum2 = 0;

        for (double n : arr1) {
            sum1 += n;
        }
        for (double n : arr2) {
            sum2 += n;
        }

        double avg1 = sum1 / arr1.length;
        double avg2 = sum2 / arr2.length;

        return avg1 > avg2;
    }


} // end of class
