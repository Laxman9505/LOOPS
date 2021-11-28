import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingValue;
        int endingValue;
        int numberOfLoop = 0;
        System.out.println("Enter the starting value");
        startingValue = sc.nextInt();
        System.out.println("Enter the ending value");
        endingValue = sc.nextInt();
        if(startingValue % 2 == 1){
            startingValue += 1;
        }
        for (int i=startingValue;i<endingValue;i+=2){
            System.out.println(i);
            numberOfLoop++;
        }
        System.out.println("Number of loop is " + numberOfLoop);
    }
}
