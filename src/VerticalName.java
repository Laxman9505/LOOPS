import java.util.Scanner;
public class VerticalName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        for (int i = 0; i< name.length();i++){

            if(name.charAt(i) != ' '){
                System.out.println(name.charAt(i));
            }
        }
    }
}
