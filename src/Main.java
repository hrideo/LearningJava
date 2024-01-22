import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String question ="Which of the following is the largest country in the world by area?";
        String choiceOne ="Canada";
        String choiceTwo ="Russia";
        String choiceThree ="China";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("The choices are " + choiceOne + " " + choiceTwo + " " + choiceThree);

        // Have the user input an answer
        System.out.println("Enter your answer: ");
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userAnswer = input.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(userAnswer.equals(correctAnswer)){
            System.out.println("Congrats your answer is correct!");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the
        // user is incorrect as well as what the correct choice was.
        else{
            System.out.println("Sorry your answer is incorrect. The correct answer is " + correctAnswer);
        }
    }
}
