public class App {
    public static void main(String[] args) throws Exception {
        // QuizMaker quizMaker = new QuizMaker();
        // QuizQuestion quizQuestion = quizMaker.createQuizQuestion();

        QuizQuestion quizQuestion = new QuizQuestion("2 + 2 = ?", "4");

        QuizPage quizPage = new QuizPage(quizQuestion);
        quizPage.show();
    }
}
