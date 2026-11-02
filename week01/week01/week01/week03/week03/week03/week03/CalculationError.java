public class CalculationError {
public static void main(String[] args) {
int firstNumber = 5;
int secondNumber = 2;

    // Explicitly casting firstNumber to double forces floating-point division
    double result = (double) firstNumber / secondNumber;
    
    System.out.println("Result: " + result); // Correctly outputs 2.5
}


}
