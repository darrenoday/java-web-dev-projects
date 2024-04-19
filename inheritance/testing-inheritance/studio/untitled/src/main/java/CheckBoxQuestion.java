public class CheckboxQuestion extends Question {
    private String[] choices;
    private boolean[] correctAnswers;

    public CheckboxQuestion(String prompt, String[] choices, boolean[] correctAnswers) {
        super(prompt);
        this.choices = choices;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getPrompt());
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    @Override
    public void checkAnswer(String answer) {
        // Logic to check if the provided combination matches correctAnswers
    }return System.out.println("correct");
}
