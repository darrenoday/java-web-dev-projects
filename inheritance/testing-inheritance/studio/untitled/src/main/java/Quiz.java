
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private Scanner scanner;

    public Quiz() {
        questions = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (question.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }
        System.out.println("Your final score is: " + score + "/" + questions.size());
    }
}