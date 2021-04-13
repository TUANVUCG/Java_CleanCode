package FIZZBUZZ;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String BLANK = "";
    public static String fizzBuzz(int number){
        boolean diviable3And5 = number % 3 == 0 && number % 5 == 0;
        boolean diviable3 = number % 3 == 0;
        boolean diviable5 = number % 5 == 0;
        String fizzBuzz = "FizzBuzz";

        if(diviable3And5) {
            return fizzBuzz;
        }

        if(diviable3) {
            return FIZZ;
        }

        if(diviable5) {
            return BUZZ;
        }

        return number + BLANK;
    }
}
