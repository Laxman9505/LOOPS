import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        int factorial = 1;
        System.out.println("Enter the number you want factorial of");
        userInput = sc.nextInt();
        for(int i = userInput; i>=1;i--){
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}
