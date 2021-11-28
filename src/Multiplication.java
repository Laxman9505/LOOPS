import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication of.");
        int userInput;
        userInput = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(userInput +"*"+ i +"=" +userInput*i);
        }
    }
}
