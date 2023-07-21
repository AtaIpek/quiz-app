public class App {
    public static void main(String[] args) throws Exception {
        QuizMaker quizMaker = new QuizMaker();
        QuizQuestion quizQuestion = quizMaker.createQuizQuestion();

        QuizPage quizApp = new QuizPage();
        quizApp.setQuestion(quizQuestion);

        Answer answer = quizApp.getAnswer();

        boolean truth = quizQuestion.checkAnswer(answer);
        quizApp.setTruth(truth);
    }
}
