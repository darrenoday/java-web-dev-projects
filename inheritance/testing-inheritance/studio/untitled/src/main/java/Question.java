public abstract class Question {
    private String prompt;

    public Question(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String answer);
}
