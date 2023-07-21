public class App {
    public static void main(String[] args) throws Exception {
        QuizMaker quizMaker = new QuizMaker();
        QuizQuestion quizQuestion = quizMaker.createQuizQuestion();

        QuizPage quizPage = new QuizPage();
        quizPage.setQuestion(quizQuestion);

        QuizAnswer answer = quizPage.getAnswer();

        boolean truth = quizQuestion.checkAnswer(answer); // true döndürecek
        quizPage.setTruth(truth);
    }
}
