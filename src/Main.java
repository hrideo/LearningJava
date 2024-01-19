import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 to 10");
        Scanner input = new Scanner(System.in);

        int inputtedNum = input.nextInt();

        if (inputtedNum < 5){
        System.out.println("enjoy the luck of good friend");
        } else {
            System.out.println("your show collection will make you happy today");
        }
    }
}
