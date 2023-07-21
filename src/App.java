public class App {
    public static void main(String[] args) throws Exception {
        QuizMaker quizMaker = new QuizMaker();
        QuizQuestion quizQuestion = quizMaker.createQuizQuestion();

        QuizPage quizPage = new QuizPage(quizQuestion);
        quizPage.show();
    }
}
