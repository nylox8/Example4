import java.util.Scanner;
class Example4 {
    public static void main (String [] argv) {
        float x,y,sum,sub,mult,div;
        System.out.println("Enter number1");

        //Reading the Value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();

        System.out.println("Enter number 2:");
        y= inputValue.nextFloat();
        sum = x + y;
        sub = x - y;
        mult = x * y;
        div = x / y;
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division " + div);
    }
}