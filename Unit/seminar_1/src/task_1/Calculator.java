package GB.Unit.seminar_1.src.task_1;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Invalid discount entered");
        }
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("The purchase amount can't be less than 0");
        }
        double discount = (double) discountAmount / 100;
        purchaseAmount = purchaseAmount - (purchaseAmount * discount);
        return purchaseAmount;
    }
}