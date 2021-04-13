package RenameVariable;

public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static final String CANNOTDIVIDEBY0 = "Can not divide by 0";
    public static final String UNSUPPORTED = "Unsupported";

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        boolean secondOperandDif0 = secondOperand != 0;
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (!secondOperandDif0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException(CANNOTDIVIDEBY0);
            default:
                throw new RuntimeException(UNSUPPORTED);
        }
    }
}
