
public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String prompt, boolean correctAnswer) {
        super(prompt);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getPrompt());
        System.out.println("1. True");
        System.out.println("2. False");
    }

    @Override
    public boolean checkAnswer(String answer) {
        boolean userAnswer = answer.equalsIgnoreCase("true") || answer.equals("1");
        return userAnswer == correctAnswer;
    }
}
