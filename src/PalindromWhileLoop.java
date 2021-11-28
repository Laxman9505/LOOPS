import java.util.Scanner;
public class PalindromWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        int number = sc.nextInt();
        userNumber = number;
        int reverse = 0;
        while (number> 0){
            int rem = number % 10 ;
            reverse = reverse + rem;
            number = number / 10;

        }
        System.out.println(reverse);
        if(userNumber == reverse){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
}
