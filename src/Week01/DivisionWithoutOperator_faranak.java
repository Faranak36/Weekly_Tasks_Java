package Week01;

public class DivisionWithoutOperator_faranak {

    public static void main(String[] args) {

        division(10, 0);
    }
    public static void division(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        System.out.println(Math.floorDiv(a, b));

        }
    }

// Create a method that divide two numbers without operator