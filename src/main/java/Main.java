import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        System.out.println("Please input your name: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("alice") || userInput.equalsIgnoreCase("bob")){
            System.out.format("Hello %s",userInput);
        }

    }
}
