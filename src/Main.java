import java.util.Scanner;
public class Main{
    //defining the function
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time");
        System.out.println("Type a random word and press enter to start tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It is developer tea time");
    }
    public static void main(String[] args) {
        //calling the function
        announceDeveloperTeaTime();
    }
}