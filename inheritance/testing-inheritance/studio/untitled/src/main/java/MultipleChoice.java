public class MultipleChoice extends Question {
    private String[] choices;
    private int correctChoiceIndex;

    public MultipleChoice(String prompt, String[] choices, int correctChoiceIndex) {
        super(prompt);
        this.choices = choices;
        this.correctChoiceIndex = correctChoiceIndex;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getPrompt());
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        int selectedChoice = Integer.parseInt(answer) - 1;
        return selectedChoice == correctChoiceIndex;
    }
}
