public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add some questions to the quiz
        quiz.addQuestion(new MultipleChoice("What is the capital of France?",
                new String[]{"Paris", "London", "Berlin", "Madrid"}, 0));
        quiz.addQuestion(new TrueFalseQuestion("Is Java a statically typed language?", true));
        // Add more questions...

        // Run the quiz
        quiz.runQuiz();
    }
}